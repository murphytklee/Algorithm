public class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;
        boolean answer = sol.solution(x1, x2 ,x3 ,x4);
        System.out.println("answer = " + answer);
    }
}