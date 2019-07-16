package champions.glacialOrigin;
import champions.origins.ChampionOrigin;
import champions.origins.Glacial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class AsheTest {

    private Ashe ashe;

    @Test
    public void asheShouldHave1GlacialPassive(){
        ashe = new Ashe();
        Assertions.assertEquals(ashe.getChampionAttributes()._1()
                .stream()
                .filter(championOrigin -> championOrigin.getClass().equals(Glacial.class))
                .count(),1);
    }


}
