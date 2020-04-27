package model.mines;

public abstract class Mine {
    private String name;
    private int resPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResPerDay() {
        return resPerDay;
    }

    public void setResPerDay(int resPerDay) {
        this.resPerDay = resPerDay;
    }


    public abstract int produceRes();
}
