package champions;

public abstract class Champion {

    public Champion(Origin origin, ChampionClass championClass){

    }

    private Passive origin;
    private Passive classChampion;

    public Passive getOrigin() {
        return origin;
    }

    public void setOrigin(Passive origin) {
        this.origin = origin;
    }

    public Passive getClassChampion() {
        return classChampion;
    }

    public void setClassChampion(Passive classChampion) {
        this.classChampion = classChampion;
    }

}
