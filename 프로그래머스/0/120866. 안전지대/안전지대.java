class Solution {

    static int[] dx = {0, 1, -1, 0, -1, 1, -1 ,1};
    static int[] dy = {1, 0, 0, -1, 1, 1, -1, -1};

    public int solution(int[][] board) {
        int n = board.length;
        int answer = 0;

        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                if(board[x][y] == 1){
                    markUnsafe(x, y, board);
                }
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int num : board[i]) {
                if (num == 0) answer++;
            }
        }
        return answer;
    }
    private void markUnsafe(int x, int y, int[][] board) {
        int n = board.length;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 0) {
                board[nx][ny] = -1;
            }
        }
    }
}