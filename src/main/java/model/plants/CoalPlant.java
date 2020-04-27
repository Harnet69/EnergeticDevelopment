package model.plants;

public class CoalPlant extends EnergyPlant {
    public CoalPlant() {
        super.setConsumeResPerDay(100);
        super.setEnergyPerDay(7);
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
