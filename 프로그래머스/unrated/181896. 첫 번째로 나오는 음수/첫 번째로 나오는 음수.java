public class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        int answer = sol.solution(num_list);
        System.out.println("answer = " + answer);
    }
}
