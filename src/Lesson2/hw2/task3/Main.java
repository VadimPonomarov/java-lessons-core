package Lesson2.hw2.task3;

import Lesson2.hw2.task3.enums.Color;
import Lesson2.hw2.task3.enums.Manufacture;
import Lesson2.hw2.task3.enums.Size;

public class Main {
    public static void main(String[] args) {
        Paper paper = new Paper(Manufacture.MANUFACTURE2, Size.A4, Color.WHITE);
        System.out.print(paper);
        System.out.print("\n==================================");
        Book book = new Book(paper, "Author", "Name of the book", "Publisher", "2011-01-01");
        System.out.print(book);
        System.out.print("\n==================================");
        Magazine magazine = new Magazine(
                new Paper(Manufacture.MANUFACTURE3, Size.A4, Color.LIGHTBLUE),
                "Editor",
                "2022-11-11"
        );
        System.out.print(magazine);
        System.out.print("\n==================================");
        Comics comics = new Comics(
                new Paper(Manufacture.MANUFACTURE3, Size.A4, Color.LIGHTBLUE),
                "Editor",
                "2022-11-11",
                "Comics name"
        );
        System.out.print(comics);
        System.out.print("\n==================================");
    }
}
