package champions.classes;

public class Brawler extends ChampionClass {

    public Brawler(){
        setNAME("BRAWLER");
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return "BRAWLER".hashCode();
    }
}
