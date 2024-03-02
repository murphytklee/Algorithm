public class Solution {
    public int solution(int price) {
        int answer = price;
        if (price >= 500000){
            answer *= 0.80;
        } else if (price >= 300000) {
            answer *= 0.90;
        } else if (price >= 100000) {
            answer *= 0.95;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int price = 350000;
        int answer = sol.solution(price);
        System.out.println("answer = " + answer);
    }
}
