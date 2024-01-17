public class Solution {
    public int solution(int num, int k) {
        String number = Integer.toString(num);
        int answer = number.indexOf(Integer.toString(k));
        return answer >= 0 ? answer + 1 : -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 29183;
        int k = 1;
        int answer = sol.solution(num, k);
        System.out.println("answer = " + answer);
    }
}