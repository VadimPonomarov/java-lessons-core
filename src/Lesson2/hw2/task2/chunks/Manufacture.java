package Lesson2.hw2.task2.chunks;

import Lesson2.hw2.task2.enums.ScreenSize;
import Lesson2.hw2.task2.enums.ScreenType;

public enum Manufacture {
    DELL("Dell"),
    SAMSUNG("Samsung"),
    APPLE("Apple");


    private final String manufacture;

    Manufacture(String manufacture) {
        this.manufacture = manufacture;

    }

    @Override
    public String toString() {

        return " " +manufacture;
    }
}
