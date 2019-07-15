package origins.originPasives;

public class GlacialPassive implements Passive{
    @Override
    public void apply() {
        System.out.println("Attacks from glacials have a chance of stun for 2s. ");
    }
}
