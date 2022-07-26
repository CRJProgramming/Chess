import javax.swing.*;
import java.util.Arrays;

public class ChessApplication{

    private Board board;
    private Game game;

    private final int BOARD_HEIGHT = 8;
    private final int BOARD_WIDTH = 8;

    public ChessApplication() {

        board = new Board(BOARD_HEIGHT,BOARD_WIDTH);
        game = new Game(board);
        game.printBoard();

    }

    public static void main(String[] args) {

        new ChessApplication();
    }
}
