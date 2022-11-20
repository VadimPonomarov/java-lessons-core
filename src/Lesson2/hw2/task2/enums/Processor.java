package Lesson2.hw2.task2.enums;

public enum Processor {
    AMD8("8-core"), AMD16("16-core");

    private final String coreNumber;

    Processor(String coreNumber) {
        this.coreNumber = coreNumber;
    }

    @Override
    public String toString() {
        return this.coreNumber;
    }
}
