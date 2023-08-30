import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1){
                odd.append(num_list[i]);
            } else even.append(num_list[i]);
        }
        answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {3, 4, 5, 2, 1};
        int answer = sol.solution(num_list);
        System.out.println("answer = " + answer);
    }
}
