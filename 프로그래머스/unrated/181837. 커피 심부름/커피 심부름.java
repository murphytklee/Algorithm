public class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("latte")){
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int answer = sol.solution(order);
        System.out.println("answer = " + answer);
    }
}
