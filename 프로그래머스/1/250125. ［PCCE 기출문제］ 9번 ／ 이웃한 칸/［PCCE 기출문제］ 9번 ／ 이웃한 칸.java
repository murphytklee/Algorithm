class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        int N = board.length;
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int nh = dh[i] + h;
            int nw = dw[i] + w;
            if (nh >= 0 && nw >= 0 && nh < N && nw < N && board[nh][nw].equals(board[h][w])) {
                count++;
            }
        }
        return count;
    }
}
