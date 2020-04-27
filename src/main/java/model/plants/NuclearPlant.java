package model.plants;

public class NuclearPlant extends EnergyPlant{
    public NuclearPlant(int energyPerDay, int consumeResPerDay) {
        super(energyPerDay, consumeResPerDay);
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
