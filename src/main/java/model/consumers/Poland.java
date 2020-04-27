package model.consumers;

public class Poland extends Consumer {
    public Poland() {
        super.setConsumeEnergyPerDay(40_000);
        super.setName("Poland");
    }

    @Override
    int consumeEnergy() {
        return getConsumeEnergyPerDay();
    }
}
