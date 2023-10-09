import java.util.Arrays;

public class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if (arr[0] == arr[2]){
            answer = (a + b + c) * ((int)Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2)) * ((int)Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3));
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            answer = (a + b + c) * ((int)Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2));
        } else {
            answer = a + b + c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 2;
        int b = 6;
        int c = 1;
        int answer = sol.solution(a, b, c);
        System.out.println("answer = " + answer);
    }
}
