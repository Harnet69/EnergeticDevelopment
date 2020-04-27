package model.plants;

public class CoalPlant extends EnergyPlant {
    public CoalPlant(int energyPerDay, int consumeResPerDay) {
        super(energyPerDay, consumeResPerDay);
        super.setName("Coal plant");
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
