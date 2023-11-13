public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;

        for (int item : section) {
            if (start + m > item){
                continue;
            }
            start = item;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        int answer = sol.solution(n, m, section);
        System.out.println("answer = " + answer);
    }
}
