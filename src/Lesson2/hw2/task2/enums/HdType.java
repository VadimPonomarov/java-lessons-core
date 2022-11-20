package Lesson2.hw2.task2.enums;

public enum HdType {
    HDD("Hdd"), SSD("Ssd");

    private final String type;

    HdType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
