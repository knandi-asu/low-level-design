package LLDTicTacToe;

public class Board {
    public int size;
    public char[][] board;
    public Board(int size){
       this.size=size;
       this.board=new char[size][size];
    }

    public boolean canMove(int x, int y, char[][] board, char symbol){
        if(board[x][y]!='\u0000'){
            System.out.println("This position is Occupied");
            return false;
        }
        board[x][y]=symbol;
        return true;
    }

    public boolean isComplete(char[][] board){
        int cnt=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='\u0000'){
                    cnt++;
                }
            }
        }
        if(cnt==0){
            return true;
        }
        return false;
    }

    public char winner(char[][] board){
        int row=board.length, col=board[0].length;
        char firstCharacter;
        for(int i=0;i<row;i++){
            firstCharacter=board[i][0];
            if(firstCharacter!='\u0000') {
                int cnt = 0;
                for (int j = 0; j < col; j++) {
                    if (firstCharacter == board[i][j]) {
                        cnt++;
                    }
                }
                if(cnt==3){
                    return firstCharacter;
                }
            }
        }
        for(int j=0;j<col;j++){
            firstCharacter=board[0][j];
            if(firstCharacter!='\u0000') {
                int cnt = 0;
                for (int i = 0; i < row; i++) {
                    if (firstCharacter == board[i][j]) {
                        cnt++;
                    }
                }
                if (cnt == 3) {
                    return firstCharacter;
                }
            }
        }
        int cnt1=0;
        for(int i=0;i<row;i++){
            firstCharacter=board[0][0];
            if(firstCharacter!='\u0000') {

                if (firstCharacter == board[i][i]) {
                    cnt1++;
                }
                if (cnt1 == 3) {
                    return firstCharacter;
                }
            }
        }
        cnt1=0;
        for(int i=0;i<row;i++){
            firstCharacter=board[0][col-1];
            if(firstCharacter!='\u0000') {

                if (firstCharacter == board[i][col - 1 - i]) {
                    cnt1++;
                }
                if (cnt1 == 3) {
                    return firstCharacter;
                }
            }
        }
        return '\u0000';
    }
}
