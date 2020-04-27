package model.plants;

public class FusionPlant extends EnergyPlant {
    public FusionPlant(int energyPerDay, int consumeResPerDay) {
        super.setConsumeResPerDay(1);
        super.setEnergyPerDay(20_000);
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
