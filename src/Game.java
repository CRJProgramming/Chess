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
            board.getBoard()[1][x] = "BPn"; //new Pawn(Black) *Use Pawn object when created
            blackTotalValue++;
            board.getBoard()[6][x] = "WPn"; //new Pawn(White) Pawn object should have a point value of 1
            whiteTotalValue++;
        }
        board.getBoard()[7][0] = "WRk";  //Rook object should have a point value of 5
        board.getBoard()[7][7] = "WRk";
        board.getBoard()[7][1] = "WKn";  //Knight object should have a point value of 3
        board.getBoard()[7][6] = "WKn";
        board.getBoard()[7][2] = "WBp";  //Bishop object should have a point value of 3
        board.getBoard()[7][5] = "WBp";
        board.getBoard()[7][3] = "WQn";   //Queen object should have a point value of 9
        board.getBoard()[7][4] = "WKg";
        whiteTotalValue += 31;

        board.getBoard()[0][0] = "BRk";
        board.getBoard()[0][7] = "BRk";
        board.getBoard()[0][1] = "BKn";
        board.getBoard()[0][6] = "BKnt";
        board.getBoard()[0][2] = "BBp";
        board.getBoard()[0][5] = "BBp";
        board.getBoard()[0][3] = "BQn";
        board.getBoard()[0][4] = "BKg";
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

    public boolean checkForCheckmate(){
        if(possibleMoves.length() == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkForCheck(){
        if(checkForCheckmate()){
            initiateGameOver();
        }
        if(opponentPossibleMoves.contains(King.getPosition)){
            return true;
        }
        else{
            return false;
        }

    }

    public void printBoard(){
        for(int x=0; x < board.getHeight(); x++){
            System.out.println("-------------------------------------------------");
            for(int y=0; y < board.getWidth(); y++){
                System.out.print("| "+board.getBoard()[x][y]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("-------------------------------------------------");

    }

    public void initiateGameOver(){
        running = false;
        if(whiteTotalValue > blackTotalValue){
            System.out.println("Checkmate! White wins");
        }else{
            System.out.println("Checkmate! Black wins");
        }
    }

    public void run(){
        printBoard();
        while(running){
            String move = nextMove();
            checkForCheck();
            printBoard();

        }
    }

}
