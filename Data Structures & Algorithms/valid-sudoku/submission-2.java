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
        //matrix1
        for(int j=0; j<3; j++){
            for(int i=0; i<3; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        seen.clear();
        //matrix2
        for(int j=3; j<6; j++){
            for(int i=0; i<3; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        seen.clear();
        //matrix3
        for(int j=6; j<9; j++){
            for(int i=0; i<3; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        seen.clear();
        //matrix4
        for(int j=0; j<3; j++){
            for(int i=3; i<6; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        seen.clear();
        //matrix5
        for(int j=3; j<6; j++){
            for(int i=3; i<6; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        seen.clear();
        //matrix6
        for(int j=6; j<9; j++){
            for(int i=3; i<6; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        seen.clear();
        //matrix7
        for(int j=0; j<3; j++){
            for(int i=6; i<9; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        seen.clear();
        //matrix8
        for(int j=3; j<6; j++){
            for(int i=6; i<9; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        seen.clear();
        //matrix9
        for(int j=6; j<9; j++){
            for(int i=6; i<9; i++){
                char c=board[i][j];
                if(c=='.') continue;
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }

        return true;
    }
}
