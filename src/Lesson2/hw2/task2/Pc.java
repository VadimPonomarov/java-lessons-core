package Lesson2.hw2.task2;

import Lesson2.hw2.task2.chunks.HD;
import Lesson2.hw2.task2.chunks.Monitor;
import Lesson2.hw2.task2.enums.Ram;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pc {
    private Monitor monitor;
    private HD hd;
    private Ram ram;

    @Override
    public String toString() {
        return " " + monitor + " " + hd + " " + ram;
    }
}
