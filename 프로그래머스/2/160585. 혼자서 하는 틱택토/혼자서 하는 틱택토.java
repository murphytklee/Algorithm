public class Solution {
    public int solution(String[] board) {
        // X,O 의 갯 수가 정상적이지 않은 경우가 있을 수 있다. -> O >= X
        // X,O 두 가지 모두 승리한 경우가 있을 수 있다. 완성된 줄이 1개 미만, 2개일 경우 존재함(특이케이스), 3개이상 존재할 수 없음
        // O 가 승리했는데 X 가 더 놓은 경우가 있을 수 있다. O 승리시 O > X
        // X 가 승리했는데 O 가 더 놓은 경우가 있을 수 있다. X 승리시 O == X
        int countO = 0;
        int countX = 0;
        int winO = 0;
        int winX = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'O') {
                    countO++;
                }
                if (board[i].charAt(j) == 'X') {
                    countX++;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            // 가로 체크
            if (board[i].equals("OOO")) {
                winO++;
            } else if (board[i].equals("XXX")) {
                winX++;
            }
            // 세로 체크
            if (board[0].charAt(i) == board[1].charAt(i) && board[1].charAt(i) == board[2].charAt(i)) {
                if (board[0].charAt(i) == 'O') {
                    winO++;
                } else if (board[0].charAt(i) == 'X') {
                    winX++;
                }
            }
            // 대각 체크
            if ((board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2)) ||
                    (board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0))) {
                if (board[1].charAt(1) == 'O') {
                    winO++;
                } else if (board[1].charAt(1) == 'X') {
                    winX++;
                }
            }
        }
        
        if (!(countO - countX == 0 || countO - countX == 1)){
            return 0;
        }
        if (winO > winX && countO - countX != 1){
            return 0;
        }
        if (winX > winO && countO != countX){
            return 0;
        }
        if (winO == winX && winO != 0){
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] board = {"...", ".X.", "..."};
        int answer = sol.solution(board);
        System.out.println("answer = " + answer);
    }
}
