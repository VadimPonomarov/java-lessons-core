package lesson3.hw.task2_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
abstract class MusicalTool {
    private String name;

    abstract public ArrayList<String> getAllCharacteristics();

    Void play() {
        System.out.print(
                "Играет инструмент:" + this.getName() +
                        " с характеристиками:" + this.getAllCharacteristics() +
                        "\n==================================\n");
        return null;
    }
}
