package model.plants;

public abstract class EnergyPlant {
    private String name;
    private int energyPerDay;
    private int consumeResPerDay;

    public EnergyPlant(int energyPerDay, int consumeResPerDay) {
        this.energyPerDay = energyPerDay;
        this.consumeResPerDay = consumeResPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyPerDay() {
        return energyPerDay;
    }

    public int getConsumeResPerDay() {
        return consumeResPerDay;
    }

    abstract int consumeRes();

    abstract int produceEnergy();
}
