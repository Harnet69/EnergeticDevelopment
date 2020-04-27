package model.mines;

public class MoonMine extends Mine {

    public MoonMine(int resPerDay) {
        super(resPerDay);
        super.setName("Moon mine");
    }

    @Override
    int produceRes() {
        return 0;
    }
}
