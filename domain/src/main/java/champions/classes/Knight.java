package champions.classes;

public class Knight extends ChampionClass {

    public Knight(){
        setNAME("KNIGHT");
    }

    @Override
    public String applyPassiveLv1() {
        return "20 Damage Blocked";
    }

    @Override
    public String applyPassiveLv2() {
        return "40 Damage Blocked";
    }

    @Override
    public String applyPassiveLv3() {
        return "80 Damage Blocked";
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
        return "KNIGHT".hashCode();
    }
}
