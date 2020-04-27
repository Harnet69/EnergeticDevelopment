package model.mines;

public class UraniumMine extends Mine {

    public UraniumMine(int resPerDay) {
        super(resPerDay);
        super.setName("Uranium mine");
    }

    @Override
    int produceRes() {
        return 0;
    }
}
