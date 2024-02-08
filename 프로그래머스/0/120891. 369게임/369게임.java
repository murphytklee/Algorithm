public class Solution {
    public int solution(int order) {
        int answer = 0;
        while (order > 0){
            int temp = order % 10;
            if (temp != 0 && temp % 3 == 0){
                answer++;
            }
            order /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int order = 29423000;
        int answer = sol.solution(order);
        System.out.println("answer = " + answer);
    }
}