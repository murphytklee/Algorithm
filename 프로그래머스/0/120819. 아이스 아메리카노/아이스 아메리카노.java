import java.util.Arrays;

public class Solution {
    public int[] solution(int money) {
        int amount = money / 5500;
        int change = money - (amount * 5500);

        return new int[]{amount, change};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int money = 15000;
        int[] answer = sol.solution(money);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}