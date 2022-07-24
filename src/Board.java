public class Board {

    //Will be replaced with Piece/Position objects when possible
    private String[][] board;

    private final int HEIGHT;
    private final int WIDTH;

    public Board(int height, int width) {
        HEIGHT = height;
        WIDTH = width;
        board = new String[height][width];
    }

    public String[][] getBoard(){
        return board;
    }

    public int getHeight() {
        return HEIGHT;
    }

    public int getWidth() {
        return WIDTH;
    }

    public String[][] getTransposedBoard() {
        String[][] transposedBoard = new String[WIDTH][HEIGHT];

        for(int x = 0; x < WIDTH; x++) {
            for(int y = 0; y < HEIGHT; y++) {
                transposedBoard[x][y] = board[y][x];
            }
        }

        return transposedBoard;
    }

}
