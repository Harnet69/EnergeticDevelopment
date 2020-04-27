package model.consumers;

public class World extends Consumer {

    public World(int consumeEnergyPerDay) {
        super(consumeEnergyPerDay);
        super.setName("World");
    }

    @Override
    int consumeEnergy() {
        return 0;
    }
}
