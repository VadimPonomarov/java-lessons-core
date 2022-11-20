package Lesson2.hw2.task3.enums;

public enum Color {
    WHITE("White"), LIGHTGREY("LightGrey"), LIGHTBLUE("LightBlue"), LIGHTYELLOW("LightYellow");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
