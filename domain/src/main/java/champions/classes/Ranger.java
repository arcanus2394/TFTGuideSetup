package champions.classes;

public class Ranger extends ChampionClass {

    public Ranger(){
        setName("RANGER");
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
}
