package lesson3.hw.task1;

import Lesson2.hw2.task3.Paper;
import Lesson2.hw2.task3.enums.Color;
import Lesson2.hw2.task3.enums.Manufacture;
import Lesson2.hw2.task3.enums.Size;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book3 book = new Book3(
                new Paper(Manufacture.MANUFACTURE2, Size.A5, Color.LIGHTGREY),
                "Author1",
                "Name1",
                "Publisher1",
                "10.01.2022"
        );
        book.print();
        System.out.print("\n=================================");
        Magazine3 magazine = new Magazine3(
                new Paper(Manufacture.MANUFACTURE1, Size.A4, Color.WHITE),
                "Editor1",
                "22.12.2022"
        );
        magazine.print();
        System.out.print("\n=================================");
        List<Printable> list = new ArrayList<>();
        list.add(book);
        list.add(magazine);
        list.forEach(Printable::print);
        System.out.print("\n=================================");
    }
}
