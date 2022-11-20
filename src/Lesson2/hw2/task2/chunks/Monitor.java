package Lesson2.hw2.task2.chunks;

import Lesson2.hw2.task2.chunks.Manufacture;
import Lesson2.hw2.task2.enums.ScreenSize;
import Lesson2.hw2.task2.enums.ScreenType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monitor {
    private Manufacture manufacture;

    private ScreenSize screenSize;

    private ScreenType screenType;

    @Override
    public String toString() {
        return " " + manufacture + " " + screenSize + " " + screenType;
    }
}
