public class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }

        for (int i = 1; i < A.length(); i++) {
            String pushedA = A.substring(A.length() - i) + A.substring(0, A.length() - i);
            if (pushedA.equals(B)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String A = "hello";
        String B = "ohell";
        int answer = sol.solution(A, B);
        System.out.println("answer = " + answer);
    }
}
