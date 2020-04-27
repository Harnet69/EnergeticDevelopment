package controller;

import model.Store;
import model.consumers.NewYork;

public class App {
    public static void main(String[] args) {
        Store.getInstance().addMines(3, 1, 0);
        Store.getInstance().addPlants(1,1, 1, 0);
        Store.getInstance().addConsumers(NewYork.getInstance());

        // produce resources
        for (int i = 1; i <= 3; i++) {
            Store.getInstance().produceResources();
            Store.getInstance().produceEnergy();
            Store.getInstance().consumeEnergy();

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
