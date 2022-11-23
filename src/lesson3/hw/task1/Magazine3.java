package lesson3.hw.task1;

import Lesson2.hw2.task3.Magazine;
import Lesson2.hw2.task3.Paper;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Magazine3 extends Magazine implements Printable {
    public Magazine3(Paper paper, String editor, String release_date) {
        super(paper, editor, release_date);
    }

    @Override
    public void print() {
        System.out.print(super.toString());
    }
}
