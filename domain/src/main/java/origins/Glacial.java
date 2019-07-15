package origins;

import champions.Passive;

public interface Glacial extends Passive {
    default String apply() {
        return "Attacks from glacials have a chance of stun for 2s. ";
    }
}
