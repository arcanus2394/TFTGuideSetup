package champions;

import champions.champs.glacialOrigin.Anivia;
import champions.champs.glacialOrigin.Ashe;
import champions.origins.ChampionOrigin;
import champions.origins.Glacial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ChampionTest {

    Champion champion;

    @Test
    public void shouldCreateAChampion(){
        Ashe ashe = new Ashe();
        Assertions.assertEquals(Champion.class,ashe.getClass().getSuperclass());
    }

    @Test
    public void aChampionShouldHaveOriginsAndClasses(){
        champion = new Anivia();
        List<ChampionOrigin> origins = Arrays.asList(new Glacial());
        Assertions.assertEquals(origins,champion.getChampionAttributes()._1());
    }



}
