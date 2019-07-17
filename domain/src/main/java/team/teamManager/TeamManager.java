package team.teamManager;

import champions.Champion;
import champions.classes.ChampionClass;
import champions.origins.ChampionOrigin;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeamManager {

    private List<Champion> championsOnField;
    private Map<ChampionOrigin, Long> originPassives;
    private Map<ChampionClass, Long> classesPassives;

    public List<Champion> getChampionsOnField() {
        return championsOnField;
    }

    public void setChampionsOnField(List<Champion> championsOnField) {
        this.championsOnField = championsOnField;
    }

    public void addChampionToTheField(Champion champion) {
        this.championsOnField.add(champion);
    }

    public Map<ChampionOrigin, Long> calculateOriginPassives(List<Champion> passives) {
        return passives.stream()
                .distinct()
                .flatMap(champion -> champion.getChampionAttributes()._1()
                        .stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }

    public Map<ChampionClass, Long> calculateClassespassive(List<Champion> passives) {
        return passives.stream()
                .distinct()
                .flatMap(champion -> champion.getChampionAttributes()._2()
                        .stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }


}
