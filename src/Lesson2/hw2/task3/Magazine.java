package Lesson2.hw2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magazine {
    private Paper paper;
    private String editor;
    private String release_date;

    @Override
    public String toString() {
        return "\nMagazine:" +
                "\npaper=" + paper.toString() +
                ", \neditor=" + editor +
                ", \nrelease_date=" + release_date;
    }
}
