package champions.glacialOrigin;

import champions.Champion;
import champions.classes.Guardian;
import champions.origins.Glacial;

import java.util.Collections;

public class Braum extends Champion {

    public Braum() {
        super(Collections.singletonList(new Glacial()), Collections.singletonList(new Guardian()));
    }
}
