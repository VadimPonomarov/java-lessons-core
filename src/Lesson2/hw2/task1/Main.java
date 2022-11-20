package Lesson2.hw2.task1;

import lesson1.hw.classes.Company;
import lesson1.hw.classes.Geo;
import lesson1.hw.classes.User;

public class Main {
    public static void main(String[] args) {

        Geo geo = new Geo("-37.3159", "81.1496");

        Address address = new Address(
                "Kulas Light",
                "Apt. 556",
                "Gwenborough",
                "92998-3874",
                geo
        );

        Company company = new Company(
                "Romaguera-Crona",
                "Multi-layered client-server neural-net",
                "harness real-time e-markets"
        );

        User user = new User(
                1,
                "Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                address,
                "1-770-736-8031 x56442",
                "hildegard.org",
                company
        );

        System.out.print(user);
    }
}
