package model.consumers;

public class NewYork extends Consumer {
    public static NewYork instance;

    private NewYork() {
        super.setConsumeEnergyPerDay(10_000);
        super.setName("New York");
    }

    public static NewYork getInstance() {
        if(instance == null){
            instance = new NewYork();
        }
        return instance;
    }

    @Override
    int consumeEnergy() {
        return getConsumeEnergyPerDay();
    }
}
