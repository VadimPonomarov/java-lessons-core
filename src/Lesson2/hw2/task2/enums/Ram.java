package Lesson2.hw2.task2.enums;

public enum Ram {
    SMALL("2Gb"), NORMAL("4Gb"), BIG("8Gb"), EXTRABIG("16Gb");

    private final String size;

    Ram(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.size;
    }
}
