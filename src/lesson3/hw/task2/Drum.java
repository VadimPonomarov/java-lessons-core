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
public class Drum extends MusicalTool implements IMusicalTool {
    private DrumSize drumSize;

    public Drum(String name, DrumSize drumSize) {
        super(name);
        this.drumSize = drumSize;
    }

    @Override
    public ArrayList<String> getAllCharacteristics() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Размер барабана - " + this.getDrumSize());
        return list;
    }

}
