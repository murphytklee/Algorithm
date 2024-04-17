import java.util.HashMap;
import java.util.Map;

class Solution {

    static Map<String, int[]> directions = new HashMap<>();

    static {
        directions.put("up", new int[] {0, 1});
        directions.put("down", new int[] {0, -1});
        directions.put("left", new int[] {-1, 0});
        directions.put("right", new int[] {1, 0});
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int xLength = (board[0] - 1) / 2;
        int yLength = (board[1] - 1) / 2;

        for (String dir : keyinput) {
            int[] direction = directions.get(dir);
            int nx = answer[0] + direction[0];
            int ny = answer[1] + direction[1];
            if (Math.abs(nx) <= xLength && Math.abs(ny) <= yLength){
                answer[0] = nx;
                answer[1] = ny;
            }
        }
        return answer;
    }
}
