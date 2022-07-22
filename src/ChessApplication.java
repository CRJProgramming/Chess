public class ChessApplication {

    private Board board;

    private final int BOARD_HEIGHT = 8;
    private final int BOARD_WIDTH = 8;

    public ChessApplication() {

        board = new Board(BOARD_HEIGHT,BOARD_WIDTH);
    }


    public Board getBoard() {

        return board;
    }

    public static void main(String[] args) {

        new ChessApplication();
    }
}
