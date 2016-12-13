package com.example.user.quidditchrankings;


import java.util.ArrayList;

/**
 * Created by user on 12/12/2016.
 */
public class Ranking {

    ArrayList<Player> rankings;

    public Ranking(){
        rankings = new ArrayList<Player>();
    }

    public void addToArray(Player player){
        rankings.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return new ArrayList<Player>(rankings);
    }

    public int getPlayerAtRank(Player player){
        return rankings.indexOf(player) +1;
    }

    public void changePlayerRank(Player player, int rank){
        rankings.remove(player);
        rankings.add(rank - 1, player);
    }
}
