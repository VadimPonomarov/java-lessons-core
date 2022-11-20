package Lesson2.hw2.task2.enums;

public enum HdSize {
    SMALL("300Gb"), NORMAL("500Gb"), BIG("1000Gb"), EXTRABIG("3000Gb");

    private final String size;

    HdSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {

        return this.size;
    }
}
