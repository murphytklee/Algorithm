class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag){
            answer = a + b;
        } else answer = a - b;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = -4;
        int b = 7;
        boolean flag = true;
        int answer = sol.solution(a, b, flag);
        System.out.println("answer = " + answer);
    }
}
