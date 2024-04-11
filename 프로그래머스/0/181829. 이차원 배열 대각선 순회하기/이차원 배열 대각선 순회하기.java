class Solution {
    public int solution(int[][] board, int k) {
        int n = board.length;
        int m = board[0].length;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
