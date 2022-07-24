import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private Board board;
    private int blackTotalValue = 0;
    private int whiteTotalValue = 0;
    private boolean running = false;
    private boolean whitesMove = true;

    public Game(Board board){
        this.board = board;
        startGame();

    }

    public void startGame(){
        initializeBoard();
        running = true;
        run();
    }

    public void initializeBoard(){
        for(int x=0; x<board.getWidth(); x++){
            board.getBoard()[1][x] = "BlackPawn"; //new Pawn(Black) *Use Pawn object when created
            blackTotalValue++;
            board.getBoard()[6][x] = "WhitePawn"; //new Pawn(White) Pawn object should have a point value of 1
            whiteTotalValue++;
        }
        board.getBoard()[7][0] = "WhiteRook";  //Rook object should have a point value of 5
        board.getBoard()[7][7] = "WhiteRook";
        board.getBoard()[7][1] = "WhiteKnight";  //Knight object should have a point value of 3
        board.getBoard()[7][6] = "WhiteKnight";
        board.getBoard()[7][2] = "WhiteBishop";  //Bishop object should have a point value of 3
        board.getBoard()[7][5] = "WhiteBishop";
        board.getBoard()[7][3] = "WhiteQueen";   //Queen object should have a point value of 9
        board.getBoard()[7][4] = "WhiteKing";
        whiteTotalValue += 31;

        board.getBoard()[0][0] = "BlackRook";
        board.getBoard()[0][7] = "BlackRook";
        board.getBoard()[0][1] = "BlackKnight";
        board.getBoard()[0][6] = "BlackKnight";
        board.getBoard()[0][2] = "BlackBishop";
        board.getBoard()[0][5] = "BlackBishop";
        board.getBoard()[0][3] = "BlackQueen";
        board.getBoard()[0][4] = "BlackKing";
        blackTotalValue += 31;

    }

    public String nextMove(){
        Scanner userInput = new Scanner(System.in);
        if(whitesMove){
            System.out.println("White's Move:");
            whitesMove = false;
        }
        else{
            System.out.println("Black's Move:");
            whitesMove = true;
        }
        String move = userInput.nextLine();
        return move;

    }

    public void checkForCheckmate(){

    }

    public void checkForCheck(){
        checkForCheckmate();
    }

    public void run(){
        while(running){
            String move = nextMove();
            checkForCheck();

        }
    }

}
