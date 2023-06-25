package ru.gb.lesson6;

import java.util.HashSet;

public class OOPMain {

    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 100, 7);
        Plate plate = new Plate(150);

        murzik.eat(plate);

        System.out.println(murzik);

        System.out.println(plate);

    }

}
