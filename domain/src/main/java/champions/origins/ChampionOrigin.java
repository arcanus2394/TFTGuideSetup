package champions.origins;

import champions.Passive;

public abstract class ChampionOrigin implements Passive {
    private static String NAME;

    public String getName(){
        return NAME;
    }

    public void setNAME(String name){
        this.NAME = name;
    }

}
