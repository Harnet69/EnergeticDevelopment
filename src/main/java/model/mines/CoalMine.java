package model.mines;

public class CoalMine extends Mine {
    public CoalMine() {
        super.setResPerDay(40);
        super.setName("Coal mine");
    }

    @Override
    public int produceRes() {
        return super.getResPerDay();
    }
}
