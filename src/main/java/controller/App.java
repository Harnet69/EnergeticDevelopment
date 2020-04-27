package controller;

import model.Store;
import model.mines.Mine;
import model.plants.EnergyPlant;

public class App {
    public static void main(String[] args) {
        Store.getInstance().addMine(2, 2, 1);
        Store.getInstance().addPlant(3,1, 1, 1);

        // produce resources
        for (int i = 1; i <= 3; i++) {
            Store.getInstance().produceResources();
        }
        System.out.println("Coal: " + Store.getInstance().getCoal());
        System.out.println("Uranium: " + Store.getInstance().getUranium());
        System.out.println("Helium-3: " + Store.getInstance().getHelium3());

//
//        Store.getInstance().getMines().stream()
//                .map(Mine::getName)
//                .forEach(System.out::println);

        Store.getInstance().getPlants().stream()
                .map(EnergyPlant::getName)
                .forEach(System.out::println);

    }
}
