package champions.glacialOrigin;

import champions.Champion;
import champions.classes.Brawler;
import champions.origins.Glacial;

import java.util.Collections;

public class Volibear extends Champion {
    public Volibear() {
        super(Collections.singletonList(new Glacial()), Collections.singletonList(new Brawler()));
    }
}
