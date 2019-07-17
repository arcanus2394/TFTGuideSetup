package champions;

import champions.glacialOrigin.Anivia;
import champions.glacialOrigin.Ashe;
import champions.glacialOrigin.Braum;
import champions.teamManager.TeamManager;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TeamManagerTest {

    @Test
    public void shouldCalculateOriginPasives(){

        List<Champion> champions = Arrays.asList(new Ashe(),new Braum(),new Anivia());
        TeamManager teamManager = new TeamManager();
        teamManager.calculateOriginPassives(champions)
                .forEach((champion,number)-> System.out.println(champion.getName()+" = "+number));
    }

    @Test
    public void shouldCalculateClasessPasives(){

        List<Champion> champions = Arrays.asList(new Ashe(), new Ashe(), new Braum(), new Anivia());
        TeamManager teamManager = new TeamManager();
        System.out.println(teamManager.calculateClassespassive(champions));

    }
}
