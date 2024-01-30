public class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n){
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;
        int answer = sol.solution(num_list, n);
        System.out.println("answer = " + answer);
    }
}