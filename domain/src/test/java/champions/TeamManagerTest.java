package champions;

import champions.champs.glacialOrigin.Anivia;
import champions.champs.glacialOrigin.Ashe;
import champions.champs.glacialOrigin.Braum;
import team.teamManager.TeamManager;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TeamManagerTest {

    @Test
    public void shouldCalculateOriginPasives(){

        List<Champion> champions = Arrays.asList(new Ashe(),new Braum(),new Anivia());
        TeamManager teamManager = new TeamManager();
        System.out.println(teamManager.calculateOriginPassives(champions));
    }

    @Test
    public void shouldCalculateClasessPasives(){

        List<Champion> champions = Arrays.asList(new Ashe(), new Ashe(), new Braum(), new Anivia());
        TeamManager teamManager = new TeamManager();
        System.out.println(teamManager.calculateClassespassive(champions));

    }
}
