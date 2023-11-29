public class Solution {
    public static int solution(int chicken) {
        int coupons = chicken;
        int answer = 0;

        while (coupons >= 10) {
            int service = coupons / 10;
            answer += service;
            coupons = coupons % 10 + service;
        }

        return answer;
    }

    public static void main(String[] args) {
        int chicken = 1081;
        int answer = solution(chicken);
        System.out.println("answer = " + answer);
    }
}
