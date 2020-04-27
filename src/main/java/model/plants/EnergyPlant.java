package model.plants;

public abstract class EnergyPlant {
    private String name;
    private int energyPerDay;
    private int consumeResPerDay;

    public int getEnergyPerDay() {
        return energyPerDay;
    }

    public int getConsumeResPerDay() {
        return consumeResPerDay;
    }

    abstract int consumeRes();

    abstract int produceEnergy();
}
