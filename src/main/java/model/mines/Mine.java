package model.mines;

public abstract class Mine {
    private String name;
    private int resPerDay;

    public int getResPerDay() {
        return resPerDay;
    }

    abstract int produceRes();
}
