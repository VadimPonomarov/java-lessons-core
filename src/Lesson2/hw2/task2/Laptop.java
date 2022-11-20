package Lesson2.hw2.task2;

import Lesson2.hw2.task2.chunks.HD;
import Lesson2.hw2.task2.chunks.Monitor;
import Lesson2.hw2.task2.enums.Battery;
import Lesson2.hw2.task2.enums.Ram;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Laptop extends Pc {
    private Battery battery;

    public Laptop() {
    }

    public Laptop(Monitor monitor, HD hd, Ram ram, Battery battery) {
        super(monitor, hd, ram);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return super.toString() + " " + battery;
    }
}
