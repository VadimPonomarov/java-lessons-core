package Lesson2.hw2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Skills {
    private String title;

    @Override
    public String toString() {
        return title + " " + exp;
    }

    int exp;
}
