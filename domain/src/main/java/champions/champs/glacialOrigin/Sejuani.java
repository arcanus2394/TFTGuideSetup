package champions.champs.glacialOrigin;

import champions.Champion;
import champions.classes.Knight;
import champions.origins.Glacial;

import java.util.Collections;

public class Sejuani extends Champion {
    public Sejuani() {
        super(Collections.singletonList(new Glacial()), Collections.singletonList(new Knight()));
        setName("Sejuani");
    }
}
