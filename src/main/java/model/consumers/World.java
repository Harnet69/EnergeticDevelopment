package model.consumers;

public class World extends Consumer {
    public static World instance = null;

    public World() {
        super.setConsumeEnergyPerDay(6_000_000);
        super.setName("World");
    }

    public static World getInstance() {
        if(instance == null){
            instance = new World();
        }
        return instance;
    }

    @Override
    int consumeEnergy() {
        return getConsumeEnergyPerDay();
    }
}
