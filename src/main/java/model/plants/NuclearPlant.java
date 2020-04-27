package model.plants;

public class NuclearPlant extends EnergyPlant{
    public NuclearPlant() {
        super.setConsumeResPerDay(1);
        super.setEnergyPerDay(10_000);
        super.setName("Nuclear plant");
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
