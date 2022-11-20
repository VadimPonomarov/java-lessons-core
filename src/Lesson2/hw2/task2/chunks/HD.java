package Lesson2.hw2.task2.chunks;

import Lesson2.hw2.task2.enums.HdSize;
import Lesson2.hw2.task2.enums.HdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HD {
    private HdSize hdSize;
    private HdType hdType;

    @Override
    public String toString() {
        return " " + hdSize + " " + hdType;
    }
}
