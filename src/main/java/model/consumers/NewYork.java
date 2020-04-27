package model.consumers;

public class NewYork extends Consumer {

    public NewYork(int consumeEnergyPerDay) {
        super(consumeEnergyPerDay);
        super.setName("New York");
    }

    @Override
    int consumeEnergy() {
        return 0;
    }
}
