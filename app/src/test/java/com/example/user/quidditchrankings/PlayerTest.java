package com.example.user.quidditchrankings;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by user on 12/12/2016.
 */
public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Lewis", "Slytherin");
    }

    @Test
    public void getNameTest(){
        assertEquals("Lewis", player.getName());
    }

    @Test
    public void getHouseTest(){
        assertEquals("Slytherin", player.getHouse());
    }

    @Test
    public void setNameTest(){
        assertEquals("Cameron", player.setName("Cameron"));
    }

    @Test
    public void setHouseTest(){
        assertEquals("Hufflepuff", player.setHouse("Hufflepuff"));
    }

}
