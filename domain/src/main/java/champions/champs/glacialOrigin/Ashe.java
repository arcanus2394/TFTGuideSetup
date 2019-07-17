package champions.champs.glacialOrigin;

import champions.Champion;
import champions.classes.Ranger;
import champions.origins.Glacial;

import java.util.Collections;

public class Ashe extends Champion {

    public Ashe() {
        super(Collections.singletonList(new Glacial()),Collections.singletonList( new Ranger()));
        setName("Ashe");
    }
}
