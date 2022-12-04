package lesson4.task1;

import Lesson2.hw2.task1.Address;
import lesson1.hw.classes.Company;
import lesson1.hw.classes.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Comparator;

@Data
@NoArgsConstructor
public class UserAged extends User implements Comparator<UserAged>, Comparable<UserAged> {
    private Integer age;

    public UserAged(int id,
                    String name,
                    String username,
                    String email,
                    Address address,
                    String phone,
                    String website,
                    Company company,
                    Integer age) {
        super(id, name, username, email, address, phone, website, company);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age=" + age + "\n" + super.toString();
    }

    @Override
    public int compare(UserAged o1, UserAged o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }

    @Override
    public int compareTo(UserAged o) {
        return o.getName().compareTo(this.getName());
    }
}
