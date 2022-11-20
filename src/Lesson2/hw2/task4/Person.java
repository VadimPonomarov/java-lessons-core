package Lesson2.hw2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;

    @Override
    public String toString() {
        return "Person:" +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \nsurname='" + surname + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nage=" + age +
                ", \ngender=" + gender +
                ", \nskills=" + skills +
                ", \ncar=" + car;
    }

    ArrayList<Skills> skills;
    Car car;
}
