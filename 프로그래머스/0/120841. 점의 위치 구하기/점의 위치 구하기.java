public class Solution {
    public int solution(int[] dot) {
        int answer;
        
        if (dot[0] > 0 && dot[1] > 0){
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] dot = {2, 4};
        int answer = sol.solution(dot);
        System.out.println("answer = " + answer);
    }
}