package Lesson2.hw2.task2;

import Lesson2.hw2.task2.chunks.HD;
import Lesson2.hw2.task2.chunks.Manufacture;
import Lesson2.hw2.task2.chunks.Monitor;
import Lesson2.hw2.task2.enums.*;

public class Main {
    public static void main(String[] args) {
        Pc basePc = new Pc(
                new Monitor(Manufacture.DELL, ScreenSize.BIG, ScreenType.MATTE),
                new HD(HdSize.BIG, HdType.SSD),
                Ram.NORMAL);
        System.out.print("\n!!! PC:\n" + basePc);

        Laptop laptop = new Laptop(
                new Monitor(Manufacture.APPLE, ScreenSize.SMALL, ScreenType.GLOSSY),
                new HD(HdSize.BIG, HdType.SSD),
                Ram.BIG,
                Battery.MAH5800
        );
        System.out.print("\n!!! Laptop:\n" + laptop);

        Ultrabook ultrabook = new Ultrabook(
                new Monitor(Manufacture.APPLE, ScreenSize.SMALL, ScreenType.GLOSSY),
                new HD(HdSize.BIG, HdType.SSD),
                Ram.BIG,
                Battery.MAH5800,
                Weight.EXTRALIGHT
        );
        System.out.print("\n!!! Ultrabook\n" + ultrabook);

        Workstation workstation = new Workstation(
                laptop,
                Processor.AMD8
        );

        System.out.print("\n!!! Workstation\n" + workstation);
    }
}
