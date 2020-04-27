package model.mines;

public class MoonMine extends Mine {

    public MoonMine() {
        super.setResPerDay(10);
        super.setName("Moon mine");
    }

    @Override
    int produceRes() {
        return 0;
    }
}
