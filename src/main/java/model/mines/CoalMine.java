package model.mines;

public class CoalMine extends Mine {
    public CoalMine(int resPerDay) {
        super(resPerDay);
        super.setName("Coal mine");
    }

    @Override
    int produceRes() {
        return 0;
    }
}
