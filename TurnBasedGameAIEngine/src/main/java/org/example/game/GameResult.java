package org.example.gamestate;

public class GameResult {
    boolean isOver;
    String winner;
    public GameResult(boolean isOver, String winner){
        this.isOver=isOver;
        this.winner=winner;
    }
}
