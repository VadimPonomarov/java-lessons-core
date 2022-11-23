package lesson3.hw.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Guitar extends MusicalTool implements IMusicalTool {
    private StringType stringNumber;

    public Guitar(String name, StringType stringNumber) {
        super(name);
        this.stringNumber = stringNumber;
    }

    @Override
    public ArrayList<String> getAllCharacteristics() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Всего струн - " + "" + this.getStringNumber().getNumber());
        return list;
    }
}
