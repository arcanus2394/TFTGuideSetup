package champions.champs.glacialOrigin;

import champions.Champion;
import champions.classes.Elementalist;
import champions.origins.Glacial;

import java.util.Collections;

public class Lissandra extends Champion {
    public Lissandra() {
        super(Collections.singletonList(new Glacial()), Collections.singletonList(new Elementalist()));
        setName("Lissandra");
    }
}
