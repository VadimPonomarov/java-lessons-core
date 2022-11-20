package Lesson2.hw2.task2.enums;

public enum Weight {
    NORMAL("500"), LIGHT("400"), EXTRALIGHT("350");

    private final String weight;

    Weight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.weight;
    }
}
