public class Solution {
    public int solution(int[] common) {
        int answer = 0;

        if (common[2] == common[1] + (common[1]  - common[0])) {
            answer = common[common.length - 1] + ((common[1]  - common[0]));
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] common = {1, 2, 3, 4};
        int answer = sol.solution(common);
        System.out.println("answer = " + answer);
    }
}
