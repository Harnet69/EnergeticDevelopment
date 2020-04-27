package model.consumers;

public abstract class Consumer {
    private String name;
    private int consumeEnergyPerDay;

    public int getConsumeEnergyPerDay() {
        return consumeEnergyPerDay;
    }

    public void setConsumeEnergyPerDay(int consumeEnergyPerDay) {
        this.consumeEnergyPerDay = consumeEnergyPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract int consumeEnergy();
}
