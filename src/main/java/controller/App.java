package controller;

import model.Store;
import model.mines.Mine;
import model.plants.EnergyPlant;

public class App {
    public static void main(String[] args) {
        Store.getInstance().addMine(3, 1, 1);
        Store.getInstance().addPlant(1,1, 3, 3);

        // produce resources
        for (int i = 1; i <= 3; i++) {
            Store.getInstance().produceResources();
            Store.getInstance().produceEnergy();

        System.out.println("Coal: " + Store.getInstance().getCoal());
        System.out.println("Uranium: " + Store.getInstance().getUranium());
        System.out.println("Helium-3: " + Store.getInstance().getHelium3());
        System.out.println("Energy : " + Store.getInstance().getEnergy());
        }

//
//        Store.getInstance().getMines().stream()
//                .map(Mine::getName)
//                .forEach(System.out::println);

//        Store.getInstance().getPlants().stream()
//                .map(EnergyPlant::getName)
//                .forEach(System.out::println);

    }
}
