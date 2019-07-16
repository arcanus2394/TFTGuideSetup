package champions.origins;

public class Glacial extends ChampionOrigin {
    public String applyPassiveLv1() {
        return "Attacks from glacials have a chance of stun for 2s. 20% Chance to Stun";
    }

    @Override
    public String applyPassiveLv2() {
        return "30% Chance to Stun";
    }

    @Override
    public String applyPassiveLv3() {
        return "45% Chance to Stun";
    }
}
