import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4; // Change this to any N value
        List<List<String>> solutions = nqueens(n); // Directly calling static method

        // Printing solutions
        for (int i = 0; i < solutions.size(); i++) {
            System.out.println("Solution " + (i + 1) + ":");
            for (int j = 0; j < solutions.get(i).size(); j++) {
                System.out.println(solutions.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        //horizontal
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // upper right
        r = row;
        for(int c = col; c < board.length && r >= 0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        r = row;
        for(int c = col; c >= 0 && r < board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower right
        for(int c = col; c < board.length && r < board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allboards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            newBoard.add(new String(board[i]));
        }
        allboards.add(newBoard);
    }

    public static void helper(char[][] board, List<List<String>> allboards, int col) {
        if (col == board.length) {
            saveBoard(board, allboards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allboards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> nqueens(int n) {
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allboards, 0);
        return allboards;
    }
}
