package lesson4.task1;

import Lesson2.hw2.task1.Address;
import lesson1.hw.classes.Company;
import lesson1.hw.classes.Geo;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UserAged> userAged = new ArrayList<>();
        userAged.add(
                new UserAged(1, "User 111", "UserName 1", "email_jhgfgh@gmail.com", new Address("Street", "suite", "City", "ZipCode", new Geo("37", "46")), "+3803222233", "http://website.com", new Company("Company name", "Catch phrase", "bs"), 41)
        );
        userAged.add(
                new UserAged(2, "User 2222", "UserName 2", "email7_sad.dwef@gmail.com", new Address("Street", "suite", "City", "ZipCode", new Geo("37", "26")), "+3803222233", "http://website.com", new Company("Company name", "Catch phrase", "bs"), 40)
        );
        userAged.add(
                new UserAged(3, "User 3", "UserName 3", "email2.bvbv@gmail.com", new Address("Street", "suite", "City", "ZipCode", new Geo("37", "16")), "+3803222233", "http://website.com", new Company("Company name", "Catch phrase", "bs"), 23)
        );
        userAged.add(
                new UserAged(4, "User 44", "UserName 4", "email.22@gmail.com", new Address("Street", "suite", "City", "ZipCode", new Geo("37", "36")), "+3803222233", "http://website.com", new Company("Company name", "Catch phrase", "bs"), 33)
        );

        /*--------------------------Task1----------------------------*/

        userAged.sort((o1, o2) -> o1.getAge() - o2.getAge());

        /*------------------------------------------------------*/

        System.out.println("====Task1.var1====" + "\n");
        for (UserAged _userAged : userAged) {
            System.out.println(_userAged.getAge());
        }
        for (UserAged _userAged : userAged) {
            System.out.println("\n==========\n" + _userAged + "\n");
        }
        /*------------------------------------------------------*/
        userAged.sort(Comparator.comparingInt(UserAged::getAge));
        /*------------------------------------------------------*/

        System.out.println("\n" + "====Task1.var2====" + "\n");
        for (UserAged _userAged : userAged) {
            System.out.println(_userAged.getAge());
        }
        for (UserAged _userAged : userAged) {
            System.out.println("\n==========\n" + _userAged + "\n");
        }

        /*------------------------------------------------------*/

        userAged.sort((o1, o2) -> o1.getName().length() - o2.getName().length());

        /*--------------------------Task2----------------------------*/

        System.out.println("\n" + "====Task2.Var1.Ascending====" + "\n");
        for (UserAged _userAged : userAged) {
            System.out.println(_userAged.getName());
        }

        /*----------------------------Var1--------------------------*/

        userAged.sort((o1, o2) -> o2.getName().length() - o1.getName().length());

        /*------------------------------------------------------*/

        System.out.println("\n" + "====Task2.Var1.Descending====" + "\n");
        for (UserAged _userAged : userAged) {
            System.out.println(_userAged.getName());
        }
        /*------------------------------------------------------*/

        class MyComparator implements Comparator<UserAged> {

            @Override
            public int compare(UserAged o1, UserAged o2) {
                return o1.getName().length() - o2.getName().length();
            }

            public int compareReverse(UserAged o1, UserAged o2) {
                return -(o1.getName().length() - o2.getName().length());
            }
        }
        MyComparator myComparator = new MyComparator();
        userAged.sort(((o1, o2) -> myComparator.compare(o1, o2)));

        /*--------------------------Var2----------------------------*/

        System.out.println("\n" + "====Task2.Var2.Ascending====" + "\n");
        for (UserAged _userAged : userAged) {
            System.out.println(_userAged.getName());
        }
        /*------------------------------------------------------*/

        userAged.sort(((o1, o2) -> myComparator.compareReverse(o1, o2)));

        /*------------------------------------------------------*/

        System.out.println("\n" + "====Task2.Var2.Descending====" + "\n");
        for (UserAged _userAged : userAged) {
            System.out.println(_userAged.getName());
        }

        /*--------------------------Task3----------------------------*/

        userAged.sort(Comparator.comparing(UserAged::getEmail));

        /*------------------------------------------------------*/

        System.out.println("\n" + "====Task3====" + "\n");
        for (UserAged _userAged : userAged) {
            System.out.println(_userAged.getName() + " " + _userAged.getEmail());
        }
    }
}
