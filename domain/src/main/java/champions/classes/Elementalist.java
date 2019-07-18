package champions.classes;

public class Elementalist extends ChampionClass {

    @Override
    public String applyPassiveLv1() {
        return "Elementalists gain double mana from attacks.\n" +
                "At the start of combat, summon a Golem";
    }

    @Override
    public String applyPassiveLv2() {
        return null;
    }

    @Override
    public String applyPassiveLv3() {
        return null;
    }

}
