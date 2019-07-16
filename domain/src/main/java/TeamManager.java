import champions.Champion;
import champions.classes.ChampionClass;
import champions.origins.ChampionOrigin;
import javafx.util.Pair;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

public class TeamManager {

    private List<Champion> championsOnField;
    private List<Pair<ChampionOrigin,Integer>> originPassives;
    private List<Pair<ChampionClass,Integer>> classesPassives;

    public List<Champion> getChampionsOnField() {
        return championsOnField;
    }

    public void setChampionsOnField(List<Champion> championsOnField) {
        this.championsOnField = championsOnField;
    }

    public void addChampionToTheField(Champion champion){
        this.championsOnField.add(champion);
    }


}
