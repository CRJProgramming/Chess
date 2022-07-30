public class Board {

    //Will be replaced with Piece/Position objects when possible
    private String[][] board;

    private final int HEIGHT;
    private final int WIDTH;

    public Board(int height, int width) {
        HEIGHT = height;
        WIDTH = width;
        board = new String[height][width];


        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                board[row][col] = "   ";
            }
        }
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
