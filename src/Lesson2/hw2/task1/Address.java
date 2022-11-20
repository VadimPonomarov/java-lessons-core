package Lesson2.hw2.task1;

import lesson1.hw.classes.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public String toString() {
        return "Address:" +
                "\ntstreet='" + street + '\'' +
                ", \n\tsuite='" + suite + '\'' +
                ", \n\tcity='" + city + '\'' +
                ", \n\tzipcode='" + zipcode + '\'' +
                ", \n\tgeo=" + geo;
    }
}
