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
public class Trumpet extends MusicalTool implements IMusicalTool {
    private TrumpetSize trumpetSize;

    public Trumpet(String name, TrumpetSize trumpetSize) {
        super(name);
        this.trumpetSize = trumpetSize;
    }

    @Override
    public ArrayList<String> getAllCharacteristics() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Диаметр трубы - " + this.getTrumpetSize());
        return list;
    }
}
