class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> isSeen = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char current = board[i][j];
                if(current == '.') continue;
                String rowCheck = current + " in row " + i;
                if(isSeen.contains(rowCheck)) return false;
                String colCheck = current + " in col " + j;
                if(isSeen.contains(colCheck)) return false;
                String miniSquare = current + " in row " + i/3 + " in col " + j/3;
                if(isSeen.contains(miniSquare)) return false;
                isSeen.add(rowCheck);
                isSeen.add(colCheck);
                isSeen.add(miniSquare);
            }
        }
        return true;
    }
}
