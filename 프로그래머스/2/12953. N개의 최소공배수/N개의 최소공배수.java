public class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 6, 8, 14};
        int answer = sol.solution(arr);
        System.out.println("answer = " + answer);
    }
}
