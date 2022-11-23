package lesson3.hw.task2_3;

public enum StringType {
    CLASSIC(6), TYPE_SEVEN(7);

    private final int number;

    StringType(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
