package champions.classes;

public class Knight extends ChampionClass {
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
}
