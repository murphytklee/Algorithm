public class Solution {
    public int solution(int[] box, int n) {
        return  (box[0] / n) * (box[1] / n) * (box[2] / n);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] box = {10, 8, 6};
        int n = 3;
        int answer = sol.solution(box, n);
        System.out.println("answer = " + answer);
    }
}
