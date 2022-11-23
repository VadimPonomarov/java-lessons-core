package lesson3.hw.task1;

import Lesson2.hw2.task3.Paper;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Book3 extends Lesson2.hw2.task3.Book implements Printable {

    public Book3(Paper paper, String author, String name, String publisher, String publish_date) {
        super(paper, author, name, publisher, publish_date);
    }

    @Override
    public void print() {
        System.out.print(super.toString());
    }
}
