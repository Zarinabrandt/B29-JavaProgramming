package day34_abstruaction;

import day34_abstruaction.animalTask.Flyable;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }
}
