package Lesson2.hw2.task2.enums;

public enum ScreenType {
    MATTE("Matte"), GLOSSY("Glossy");

    private final String type;

    ScreenType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}

