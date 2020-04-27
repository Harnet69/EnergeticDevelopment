package model.consumers;

public class Poland extends Consumer {
    public static Poland instance = null;

    private Poland() {
        super.setConsumeEnergyPerDay(40_000);
        super.setName("Poland");
    }

    public static Poland getInstance() {
        if(instance == null){
            instance = new Poland();
        }
        return instance;
    }

    @Override
    int consumeEnergy() {
        return getConsumeEnergyPerDay();
    }
}
