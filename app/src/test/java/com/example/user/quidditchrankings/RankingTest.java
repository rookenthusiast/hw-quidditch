package com.example.user.quidditchrankings;
        import org.junit.Before;
        import org.junit.Test;
        import static org.junit.Assert.*;
/**
 * Created by user on 12/12/2016.
 */
public class RankingTest {

    Ranking ranking;
    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before(){
        ranking = new Ranking();
        player1 = new Player("Adam", "Hufflepuff");
        player2 = new Player("Lewis", "Slytherin");
        player3 = new Player("Bob Marley", "Stoned");
    }

    @Test
    public void canAddToArray(){
        Player player = new Player("Harry", "Gryffindor");
        ranking.addToArray(player);
        assertNotNull(ranking.getPlayers());
    }

    @Test
    public void canGetPlayerAtRank(){
        ranking.addToArray(player1);
        assertEquals(1, ranking.getPlayerAtRank(player1));
    }

    @Test
    public void canChangePlayersRank(){
        ranking.addToArray(player1);
        ranking.addToArray(player2);
        assertEquals(2,ranking.getPlayerAtRank(player2));
        ranking.addToArray(player3);
        ranking.changePlayerRank(player2, 1);
        assertEquals(1, ranking.getPlayerAtRank(player2));
    }
}

