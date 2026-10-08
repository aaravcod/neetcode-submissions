import java.util.HashSet;
import java.util.Set;

class Solution{
    public boolean isValidSudoku(char[][] board) {

    for (int i = 0; i < 9; i++) {
        Set<Character> row = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            char ch = board[i][j];
            if (ch != '.' && !row.add(ch)) {
                return false;
            }
        }
    }
    for (int j = 0; j < 9; j++) {
        Set<Character> col = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char ch = board[i][j];
            if (ch != '.' && !col.add(ch)) {
                return false;
            }
        }
    }


    for (int boxRow = 0; boxRow < 9; boxRow += 3) {
        for (int boxCol = 0; boxCol < 9; boxCol += 3) {
            Set<Character> box = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char ch = board[boxRow + i][boxCol + j];
                    if (ch != '.' && !box.add(ch)) {
                        return false;
                    }
                }
            }
        }
    }

    return true;
}

}
