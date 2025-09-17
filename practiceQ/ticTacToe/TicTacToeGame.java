package practiceQ.ticTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;
    public TicTacToeGame(){

    }
    public void InitializeGame(){
        // crate 2 players
        players = new LinkedList<>();
        PlayingPieceX xPiece = new PlayingPieceX();
        Player player1 = new Player("player1", xPiece);

        PlayingPieceO oPiece = new PlayingPieceO();
        Player player2 = new Player("player2", oPiece);

        players.add(player1);
        players.add(player2);

        // initialize board
        gameBoard = new Board(3);
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        boolean noWinner=true;
        int total = gameBoard.size* gameBoard.size;
        int row ;
        int column;
        while (total>0){
                if(total%2==1) {
                    System.out.println("Player: Player1 Enter row, column: ");
                     while(true){
                         row = scanner.nextInt();
                         column = scanner.nextInt();
                         if(gameBoard.board[row][column]!=null){
                             System.out.println("Piece already exist try again");
                         }
                         else{
                             total--;
                             break;
                         }
                     }
                    gameBoard.board[row][column]= new PlayingPieceX();
                }
                else{
                    System.out.println("Player: Player2 Enter row, column: ");
                    while(true){
                        row = scanner.nextInt();
                        column = scanner.nextInt();
                        if(gameBoard.board[row][column]!=null){
                            System.out.println("Piece already exist try again");
                        }
                        else{
                            total--;
                            break;
                        }

                    }
                    gameBoard.board[row][column]= new PlayingPieceO();

                }
                printBoard();
                if(checkWinner()){
                    noWinner = false;
                    break;
                }
        }
        if(noWinner)
            System.out.println("Match is draw");

    }



    public void printBoard(){
        for(int i =0;i< gameBoard.size;i++){
            for(int j=0;j< gameBoard.size;j++){
                if(gameBoard.board[i][j]!=null)
                    System.out.print(gameBoard.board[i][j].pieceType+"  |");
                else{
                    System.out.print("   |");
                }
            }
            System.out.println();
        }
    }
    public boolean checkWinner(){
        PieceType  pieceType= checkRows();
        if(pieceType!=null){
            if(pieceType==PieceType.O)
                System.out.println( "Player 2 is winner");
            else
                System.out.println( "Player 1 is winner");
            return true;
        }
        pieceType = checkColumn();
        if(pieceType!=null){
            if(pieceType==PieceType.O)
                System.out.println( "Player 2 is winner");
            else
                System.out.println( "Player 1 is winner");
            return true;
        }
        pieceType = checkDiagonals();
        if(pieceType!=null){
            if(pieceType==PieceType.O)
                System.out.println( "Player 2 is winner");
            else
                System.out.println( "Player 1 is winner");
            return true;
        }
        return false;
    }
    public PieceType checkRows(){
        // each row
        for(int i =0;i<gameBoard.size;i++){
            boolean flag = true;
            for(int j=0;j<gameBoard.size-1;j++){
                if(gameBoard.board[i][j]==null || gameBoard.board[i][j+1]==null){
                    flag = false;
                    break;
                }
                if(gameBoard.board[i][j].pieceType!=gameBoard.board[i][j+1].pieceType){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return gameBoard.board[i][0].pieceType;
        }
        return null;
    }
    public PieceType checkColumn(){
        // each column
        for(int j=0;j<gameBoard.size;j++){
            boolean flag = true;
            for(int i=0;i<gameBoard.size-1;i++){
                if(gameBoard.board[i][j]==null || gameBoard.board[i+1][j]==null){
                    flag = false;
                    break;
                }
                if(gameBoard.board[i][j].pieceType!=gameBoard.board[i+1][j].pieceType){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return gameBoard.board[j][0].pieceType;
        }
        return null;

    }
    public PieceType checkDiagonals(){
        // first diagonal
        boolean flag = true;
        int i = 0;
        int j = 0;
        while(i<gameBoard.size-1){
            if (gameBoard.board[i][j] == null || gameBoard.board[i+1][j+1] == null) {
                flag = false;
                break;
            }
            if (gameBoard.board[i][j].pieceType != gameBoard.board[i+1][j+1].pieceType) {
                flag = false;
                break;
            }
            i++;
            j++;
        }
        if(flag)
            return gameBoard.board[0][0].pieceType;

       // second diagonal
        flag = true;
         i = 0;
         j = gameBoard.size-1;
        while(j>=0 && i<gameBoard.size-1){
                if (gameBoard.board[i][j] == null || gameBoard.board[i+1][j-1] == null) {
                    flag = false;
                    break;
                }
                if (gameBoard.board[i][j].pieceType != gameBoard.board[i+1][j-1].pieceType) {
                    flag = false;
                    break;
                }
                i++;
                j--;
        }
        if(flag)
            return gameBoard.board[0][gameBoard.size-1].pieceType;

    return null;

    }


}
