package champions;

import champions.classes.ChampionClass;
import io.vavr.Tuple2;
import javafx.util.Pair;
import champions.origins.ChampionOrigin;

import java.util.List;

public abstract class Champion {

    private List<ChampionOrigin> origins;
    private List<ChampionClass> championClass;

    public Champion(List<ChampionOrigin> origins, List<ChampionClass> championClass) {
        this.origins = origins;
        this.championClass = championClass;
    }

    public Tuple2<List<ChampionOrigin>, List<ChampionClass>> getChampionAttributes() {
        return new Tuple2<>(origins, championClass);
    }

}
