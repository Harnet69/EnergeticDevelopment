package model.consumers;

public class Poland extends Consumer {
    public Poland(int consumeEnergyPerDay) {
        super(consumeEnergyPerDay);
        super.setName("Poland");
    }

    @Override
    int consumeEnergy() {
        return 0;
    }
}
