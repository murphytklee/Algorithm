class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int value1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int value2 = 2 * a * b;
        if (value1 >= value2){
            return value1;
        } else return value2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 2;
        int b = 91;
        int answer = sol.solution(a,b);
        System.out.println("answer = " + answer);
    }
}
