package controller;

import model.Store;
import model.mines.Mine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Store.getInstance().addMines(2, 2, 1);

        // produce resources
        for(int i=1; i<=3; i++){
            Store.getInstance().produceResources();
        }
            System.out.println("Coal: " + Store.getInstance().getCoal());
            System.out.println("Uranium: " + Store.getInstance().getUranium());
            System.out.println("Helium-3: " + Store.getInstance().getHelium3());

//
//        Store.getInstance().getMines().stream()
//                .map(Mine::getName)
//                .forEach(System.out::println);

    }
}
