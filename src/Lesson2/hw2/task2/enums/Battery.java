package Lesson2.hw2.task2.enums;

public enum Battery {
    MAH2200("2200mAh"), MAH4000("4000mAh"), MAH5800("5800mAh");

    private final String mAh;

    Battery(String mAh) {
        this.mAh = mAh;
    }

    @Override
    public String toString() {
        return this.mAh;
    }
}
