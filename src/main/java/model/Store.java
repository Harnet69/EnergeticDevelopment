package model;

import model.consumers.Consumer;
import model.mines.CoalMine;
import model.mines.Mine;
import model.mines.MoonMine;
import model.mines.UraniumMine;
import model.plants.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private static Store instance = null;
    private List<Mine> mines = new ArrayList<>();
    private List<EnergyPlant> plants = new ArrayList<>();
    private List<Consumer> customers = new ArrayList<>();

    private int coal;
    private int uranium;
    private int helium3;

    private int energy;

    private Store() {
    }

    public static Store getInstance() {
        if (instance == null) {
            instance = new Store();
        }
        return instance;
    }

    public List<Mine> getMines() {
        return mines;
    }

    public List<EnergyPlant> getPlants() {
        return plants;
    }

    public List<Consumer> getCustomers() {
        return customers;
    }

    public int getCoal() {
        return coal;
    }

    public int getUranium() {
        return uranium;
    }

    public int getHelium3() {
        return helium3;
    }

    public int getEnergy() {
        return energy;
    }

    public void addMine(int coals, int uranium, int moon) {
        int[] plantsQtt = new int[]{coals, uranium, moon};
        for (int q = 0; q < plantsQtt.length; q++) {
            if (q == 0) {
                for (int i = 1; i <= plantsQtt[q]; i++) {
                    mines.add(new CoalMine());
                }
            } else if (q == 1) {
                for (int i = 1; i <= plantsQtt[q]; i++) {
                    mines.add(new UraniumMine());
                }
            } else {
                for (int i = 1; i <= plantsQtt[q]; i++) {
                    mines.add(new MoonMine());
                }
            }
        }
    }

    public void produceResources() {
        for (Mine mine : mines) {
            switch (mine.getName()) {
                case "Coal mine":
                    coal += mine.produceRes();
                    break;
                case "Uranium mine":
                    uranium += mine.produceRes();
                    break;
                case "Moon mine":
                    helium3 += mine.produceRes();
                    break;
            }
        }
    }

    public void addPlant(int coals, int solar, int nuclear, int fusion) {
        int[] plantsQtt = new int[]{coals, solar, nuclear,fusion};
        for (int q = 0; q < plantsQtt.length; q++) {
            if (q == 0) {
                for (int i = 1; i <= plantsQtt[q]; i++) {
                    plants.add(new CoalPlant());
                }
            } else if (q == 1) {
                for (int i = 1; i <= plantsQtt[q]; i++) {
                    plants.add(new SolarPlant());
                }
            } else if(q == 2){
                for (int i = 1; i <= plantsQtt[q]; i++) {
                    plants.add(new NuclearPlant());
                }
            }
            else{
                for (int i = 1; i <= plantsQtt[q]; i++) {
                    plants.add(new FusionPlant());
                }
            }
        }
    }

    public void produceEnergy(){
        for (EnergyPlant plant : plants) {
            switch (plant.getName()) {
                case "Coal plant":
                    coal -= plant.getConsumeResPerDay();
                    energy += plant.getEnergyPerDay();
                    break;
                case "Solar plant":
                    energy += plant.getEnergyPerDay();
                    break;
                case "Nuclear plant":
                    uranium -= plant.getConsumeResPerDay();
                    energy += plant.getEnergyPerDay();
                    break;
                case "Fusion plant":
                    helium3 -= plant.getConsumeResPerDay();
                    energy += plant.getEnergyPerDay();
                    break;
            }
        }
    }
}