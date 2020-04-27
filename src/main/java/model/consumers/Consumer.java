package model.consumers;

public abstract class Consumer {
    private String name;
    private int consumeEnergyPerDay;


    public int getConsumeEnergyPerDay() {
        return consumeEnergyPerDay;
    }

    abstract int consumeEnergy();
}
