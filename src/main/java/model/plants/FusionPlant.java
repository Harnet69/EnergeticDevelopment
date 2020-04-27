package model.plants;

public class FusionPlant extends EnergyPlant {
    public FusionPlant(int energyPerDay, int consumeResPerDay) {
        super(energyPerDay, consumeResPerDay);
        super.setName("Fusion plant");
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
