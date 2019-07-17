package champions.classes;

public class Ranger extends ChampionClass {

    public Ranger(){
        setNAME("RANGER");
    }

    @Override
    public String applyPassiveLv1() {
        return "Rangers have a chance to double their attack speed for the next 3s. \n" +
                "25% Chance to Double Attack Speed";
    }

    @Override
    public String applyPassiveLv2() {
        return "65% Chance to Double Attack Speed";
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
        return "RANGER".hashCode();
    }

/*    @Override
    public String toString(){
        return "RANGER";
    }*/
}
