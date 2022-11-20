package Lesson2.hw2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Paper paper;
    private String author;
    private String name;
    private String publisher;

    @Override
    public String toString() {
        return "\nBook:" +
                "\npaper=" + paper.toString() +
                ", \nauthor=" + author  +
                ", \nname=" + name  +
                ", \npublisher=" + publisher  +
                ", \npublish_date=" + publish_date;
    }

    private String publish_date;
}
