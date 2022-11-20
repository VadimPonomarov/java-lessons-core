package Lesson2.hw2.task3.enums;

public enum Size {
    A6("A6"), A5("A5"), A4("A4"), A3("A3");

    private final String size;

    Size(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.size;
    }
}
