package lesson1.hw.classes;

import Lesson2.hw2.task1.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public String toString() {
        return "User:" +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \nusername='" + username + '\'' +
                ", \nemail='" + email + '\'' +
                ", \naddress=" + address +
                ", \nphone='" + phone + '\'' +
                ", \nwebsite='" + website + '\'' +
                ", \ncompany=" + company;
    }
}
