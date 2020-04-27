package model.mines;

public class MoonMine extends Mine {

    public MoonMine() {
        super.setResPerDay(10);
        super.setName("Moon mine");
    }

    @Override
    public int produceRes() {
        return super.getResPerDay();
    }
}
