package model.mines;

public class UraniumMine extends Mine {

    public UraniumMine() {
        super.setResPerDay(100);
        super.setName("Uranium mine");
    }

    @Override
    public int produceRes() {
        return super.getResPerDay();
    }
}
