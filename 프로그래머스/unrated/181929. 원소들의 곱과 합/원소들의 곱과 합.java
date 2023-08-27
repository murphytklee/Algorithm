class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul_sum = 1;
        int sum = 0;

        for (int i : num_list) {
            sum += i;
            mul_sum *= i;
        }
        if (sum * sum > mul_sum){
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {3, 4, 5, 2, 1};
        int answer = sol.solution(num_list);
        System.out.println("answer = " + answer);
    }
}
