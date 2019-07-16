package champions.classes;

public class Guardian extends ChampionClass {
    public String applyPassiveLv1() {
        return "At the start of combat, all Guardians and adjacent allies receive +40 armor.";
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
