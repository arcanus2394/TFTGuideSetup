package champions;

import champions.classes.ChampionClass;
import champions.origins.ChampionOrigin;
import io.vavr.Tuple2;

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


    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.getClass().getSimpleName().hashCode();
    }
}
