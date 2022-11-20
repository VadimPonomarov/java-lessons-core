package Lesson2.hw2.task2;

import Lesson2.hw2.task2.enums.Processor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Workstation {
    private Laptop laptop;
    private Processor processor;

    @Override
    public String toString() {
        return "" + laptop + " " + processor;
    }
}
