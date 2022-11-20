package Lesson2.hw2.task3;

import Lesson2.hw2.task3.enums.Manufacture;
import Lesson2.hw2.task3.enums.Color;
import Lesson2.hw2.task3.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paper {
    @Override
    public String toString() {
        return "Paper:" +
                "\nmanufacture=" + manufacture.toString() +
                ", \nsize=" + size.toString() +
                ", \ncolor=" + color.toString();
    }

    private Manufacture manufacture;
    private Size size;
    private Color color;
}
