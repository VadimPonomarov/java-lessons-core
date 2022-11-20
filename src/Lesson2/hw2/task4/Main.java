package Lesson2.hw2.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skills> skills = new ArrayList<>();
        skills.add(new Skills("Skill-1", 1));
        skills.add(new Skills("Skill-2", 2));
        skills.add(new Skills("Skill-3", 3));
        Person person = new Person(
                1,
                "Name",
                "Surname",
                "Email",
                33,
                Gender.Male,
                skills,
                new Car(CarModel.HONDA, "2019", 200)
        );
        System.out.print(person);
    }
}