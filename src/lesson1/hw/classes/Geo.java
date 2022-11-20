package lesson1.hw.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geo {
    private String lat;
    private String lng;

    @Override
    public String toString() {
        return "Geo:" +
                "\n\t\tlat='" + lat + '\'' +
                ", \n\t\tlng='" + lng + '\'';
    }
}
