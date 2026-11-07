class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = initSet();
        Set<Character>[] columns = initSet();
        Set<Character>[][] squares = initSquare();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char num = board[i][j];
                if (num == '.')
                    continue;
                if (!rows[i].add(num)) {
                    return false;
                }
                if (!columns[j].add(num)) {
                    return false;
                }
                if (!squares[i / 3][j / 3].add(num)) {
                    return false;
                }
            }
        }

        return true;
    }

    private Set<Character>[] initSet() {
        Set<Character>[] set = new Set[9];
        for (int i = 0; i < set.length; i++) {
            set[i] = new HashSet<Character>();
        }
        return set;
    }

    private Set<Character>[][] initSquare() {
        Set<Character>[][] squares = new Set[3][3];
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                squares[i][j] = new HashSet<Character>();
            }
        }
        return squares;
    }
}
