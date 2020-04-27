package model.plants;

public class Store {
    public Store instance = null;

    private Store() {
    }

    public Store getInstance() {
        if(instance == null){
            instance = new Store();
        }
        return instance;
    }
}
