package model.consumers;

public class World extends Consumer {

    public World() {
        super.setConsumeEnergyPerDay(6_000_000);
        super.setName("World");
    }

    @Override
    int consumeEnergy() {
        return getConsumeEnergyPerDay();
    }
}
