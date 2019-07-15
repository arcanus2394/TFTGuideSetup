package classes;

import champions.Passive;

public interface Guardian extends Passive {
    default String apply() {
        return "At the start of combat, all Guardians and adjacent allies receive +40 armor.";
    }
}
