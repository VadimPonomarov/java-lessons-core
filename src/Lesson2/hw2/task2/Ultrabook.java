package Lesson2.hw2.task2;

import Lesson2.hw2.task2.chunks.HD;
import Lesson2.hw2.task2.chunks.Monitor;
import Lesson2.hw2.task2.enums.Battery;
import Lesson2.hw2.task2.enums.Ram;
import Lesson2.hw2.task2.enums.Weight;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Ultrabook extends Laptop {

    private Weight weight;

    public Ultrabook() {
    }

    public Ultrabook(Monitor monitor, HD hd, Ram ram, Battery battery, Weight weight) {
        super(monitor, hd, ram, battery);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "" + super.toString() + " " + "weight: "+ weight + "grm";
    }
}
