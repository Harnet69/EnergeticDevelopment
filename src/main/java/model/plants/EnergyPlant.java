package model.plants;

public abstract class EnergyPlant {
    private String name;
    private int energyPerDay;
    private int consumeResPerDay;


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

    public void setEnergyPerDay(int energyPerDay) {
        this.energyPerDay = energyPerDay;
    }

    public void setConsumeResPerDay(int consumeResPerDay) {
        this.consumeResPerDay = consumeResPerDay;
    }

    abstract int consumeRes();

    abstract int produceEnergy();
}
