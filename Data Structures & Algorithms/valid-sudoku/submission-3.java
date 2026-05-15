class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> seen=new HashSet<>();
        //rows
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
            seen.clear();
        }
        //columns
        for(int j=0; j<9; j++){
            for(int i=0; i<9; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
            seen.clear();
        }
        
        // Check 3x3 boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                seen.clear();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        char c = board[i][j];
                        if (c == '.') continue;
                        if (seen.contains(c)) {
                            return false;
                        }
                        seen.add(c);
                    }
                }
            }
        }

        return true;
    }
}
