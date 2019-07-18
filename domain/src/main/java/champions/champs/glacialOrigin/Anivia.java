package champions.champs.glacialOrigin;

import champions.Champion;
import champions.classes.Elementalist;
import champions.origins.Glacial;

import java.util.Collections;

public class Anivia extends Champion {
    public Anivia() {
        super(Collections.singletonList(new Glacial()),Collections.singletonList( new Elementalist()));
    }
}
