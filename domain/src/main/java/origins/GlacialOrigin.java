package origins;

import origins.originPasives.Passive;

public interface GlacialOrigin{

    default void applyPasive(Passive passive){
        passive.apply();
    }
}
