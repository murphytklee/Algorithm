public class Solution {

    static int[][] answer;
    static int colStart, rowStart, colEnd, rowEnd, value;
    
    public int[][] solution(int n) {
        answer = new int[n][n];
        colStart = 0;
        rowStart = 0;
        colEnd = n - 1;
        rowEnd = n - 1;
        value = 1;

        while (value <= n * n){
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = value++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = value++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = value++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = value++;
            }
            colStart++;
        }
        
        return answer;
    }
}
