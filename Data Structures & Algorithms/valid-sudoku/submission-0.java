class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m=9;
        int n=9;

        //row-wise logic
        for(int i=0; i<n; i++){
            int[] count=new int[m+1];
            for(int j=0; j<m; j++){
                if(board[i][j]!='.'){
                    count[board[i][j]-'0']++;
                }
            }

            for(int k=1; k<m+1; k++){
                if(count[k]>1){
                    return false;
                }
            }
        }

        //column-wise logic
        for(int i=0; i<n; i++){
            int[] count=new int[m+1];
            for(int j=0; j<m; j++){
                if(board[j][i]!='.'){
                    count[board[j][i]-'0']++;
                }
            }

            for(int k=1; k<m+1; k++){
                if(count[k]>1){
                    return false;
                }
            }
        }

        //3x3 logic
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                int[] count = new int[10];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (board[row + i][col + j] != '.') {
                            int num = board[row + i][col + j] - '0';

                            if (count[num] > 0)
                                return false;

                            count[num]++;
                        }
                    }
                }
            }
        }

        return true;
    }
}
