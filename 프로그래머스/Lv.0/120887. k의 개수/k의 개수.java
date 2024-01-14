public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {
            int currentNum = num;
            while (currentNum > 0) {
                if (currentNum % 10 == k) {
                    answer++;
                }
                currentNum /= 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int i = 10;
        int j = 50;
        int k = 5;
        int answer = sol.solution(i, j, k);
        System.out.println("answer = " + answer);
    }
}
