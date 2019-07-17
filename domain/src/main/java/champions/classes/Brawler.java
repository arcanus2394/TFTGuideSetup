package champions.classes;

public class Brawler extends ChampionClass {

    public Brawler(){
        setName("BRAWLER");
    }

    @Override
    public String applyPassiveLv1() {
        return "300 Bonus Health";
    }

    @Override
    public String applyPassiveLv2() {
        return "700 Bonus Health";
    }

    @Override
    public String applyPassiveLv3() {
        return null;
    }

}
