package model.plants;

public class SolarPlant extends EnergyPlant {
    public SolarPlant(int energyPerDay, int consumeResPerDay) {
        super.setEnergyPerDay(2);
        super.setName("Solar plant");
    }

    @Override
    int consumeRes() {
        return 0;
    }

    @Override
    int produceEnergy() {
        return 0;
    }
}
