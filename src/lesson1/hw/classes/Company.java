package lesson1.hw.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    @Override
    public String toString() {
        return "Company:" +
                "\n\tname='" + name + '\'' +
                ", \n\tcatchPhrase='" + catchPhrase + '\'' +
                ", \n\tbs='" + bs + '\'';
    }
}
