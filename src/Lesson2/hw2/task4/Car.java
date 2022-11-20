package Lesson2.hw2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    CarModel carModel;
    String year;

    @Override
    public String toString() {
        return "[carModel=" + carModel +
                ", year='" + year + '\'' +
                ", power=" + power + "]";
    }

    int power;
}
