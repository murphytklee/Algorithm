public class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 0){
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        return Math.max(odd, even);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int answer = sol.solution(num_list);
        System.out.println("answer = " + answer);
    }
}