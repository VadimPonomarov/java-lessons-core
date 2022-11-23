package lesson3.hw.task3;

import java.util.ArrayList;

public interface IMusicalTool {
    ArrayList<String> getAllCharacteristics();

    default void play(String toolName, ArrayList<String> array) {
        String text = array.stream()
                .reduce("", (partialString, element) -> partialString + element);
        System.out.print("Играет инструмент: " + toolName + " с характеристиками: " + text);
    }
}
