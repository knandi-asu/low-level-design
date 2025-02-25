import LLDTicTacToe.Board;
import LLDTicTacToe.Player;

import java.util.Scanner;

public class Game {
    Player p1, p2;
    Board ticTacToe;
    public Game(){
        p1=new Player("player1", 'X');
        p2=new Player("player2", 'O');
        ticTacToe=new Board(3);
        gameStart(p1, p2, ticTacToe);
    }

    public void gameStart(Player p1, Player p2, Board ticTacToe){
        boolean winnerFound=false;
        while(!winnerFound){
            if(ticTacToe.isComplete(ticTacToe.board)){
                break;
            }
            System.out.println("Enter the position of player 1");
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            String[] values= s.split(",");
            int row=Integer.valueOf(values[0]);
            int col=Integer.valueOf(values[1]);

            if(ticTacToe.canMove(row, col, ticTacToe.board, p1.symbol)){
                char c= ticTacToe.winner(ticTacToe.board);
                if(c!='\u0000') {
                    winnerFound = true;
                    System.out.println("Winner of the game is : " + (c == 'X' ? "Player1" : "Player2"));
                    break;
                }
            }

            System.out.println("Enter the position of player 2");
            s=sc.next();
            values= s.split(",");
            row=Integer.valueOf(values[0]);
            col=Integer.valueOf(values[1]);

            if(ticTacToe.canMove(row, col, ticTacToe.board, p2.symbol)) {
                char c = ticTacToe.winner(ticTacToe.board);
                if(c!='\u0000') {
                    winnerFound = true;
                    System.out.println("Winner of the game is : " + (c == 'X' ? "Player1" : "Player2"));
                    break;
                }
            }
        }
        if(!winnerFound) {
            System.out.println("Game is a tie!!!!");
        }
    }

}
