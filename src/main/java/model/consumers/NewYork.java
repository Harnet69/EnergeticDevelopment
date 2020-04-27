package model.consumers;

public class NewYork extends Consumer {

    public NewYork() {
        super.setConsumeEnergyPerDay(10_000);
        super.setName("New York");
    }

    @Override
    int consumeEnergy() {
        return getConsumeEnergyPerDay();
    }
}
