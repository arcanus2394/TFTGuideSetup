package champions.classes;

import champions.Passive;

public abstract class ChampionClass implements Passive {

    private String NAME;

    public String getName(){
        return NAME;
    }

    public void setNAME(String name){
        this.NAME = name;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
