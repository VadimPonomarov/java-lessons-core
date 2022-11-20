package Lesson2.hw2.task3.enums;

public enum Manufacture {
    MANUFACTURE1("Manufacture1"), MANUFACTURE2("Manufacture2"), MANUFACTURE3("Manufacture3");

    private final String manufacture;

    Manufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return this.manufacture;
    }
}
