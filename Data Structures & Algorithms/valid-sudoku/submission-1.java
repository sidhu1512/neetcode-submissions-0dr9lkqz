class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<String, Set<Character>> map =  new HashMap<>();

        for(int i=0; i< board.length; i++){
            Set<Character> col = new HashSet<>();
            Set<Character> row = new HashSet<>();

            for(int j=0; j< board[0].length; j++){

                //col logic 
                if(board[j][i] != '.'){
                if (col.contains(board[j][i])){
                    return false;
                }else {
                    col.add(board[j][i]);
                }}

                char val =  board[i][j];
                if( val == '.') continue;

                //row logic
                if (row.contains(val)){
                    return false;
                }else {
                    row.add(val);
                }

                //squre logic
                String key = (i/3 +","+ j/3);

                if(map.containsKey(key)){
                    if(map.get(key).contains(val)) return false;
                    map.get(key).add(val);
                } else {
                    Set<Character> temp = new HashSet<>();
                    temp.add(val);
                    map.put(key, temp);
                }
            }
        }

        return true;
    }
}
