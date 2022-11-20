package Lesson2.hw2.task2.enums;

public enum ScreenSize {
    SMALL("15\""), NORMAL("17\""), BIG("22\""), EXTRABIG("32\"");

    private final String size;

    ScreenSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.size;
    }
}
