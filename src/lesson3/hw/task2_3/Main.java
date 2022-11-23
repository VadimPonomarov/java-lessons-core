package lesson3.hw.task2_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Guitar", StringType.CLASSIC);
        Drum drum = new Drum("Drum", DrumSize.NORMAL);
        Trumpet trumpet = new Trumpet("Trumpet", TrumpetSize.SMALL);

        System.out.print("====== Task3 =====\n");


        System.out.print("==================================\n");
        guitar.play(guitar.getName(), guitar.getAllCharacteristics());
        System.out.print("\n==================================\n");
        drum.play(drum.getName(), drum.getAllCharacteristics());
        System.out.print("\n==================================\n");
        trumpet.play(trumpet.getName(), trumpet.getAllCharacteristics());
        System.out.print("\n==================================\n");

        System.out.print("====== Task3 (List iteration) =====\n");

        List.of(guitar, drum, trumpet)
                .stream()
                .forEach(item -> item.play());
    }
}
