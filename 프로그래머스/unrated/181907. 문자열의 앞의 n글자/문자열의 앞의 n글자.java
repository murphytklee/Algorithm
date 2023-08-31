class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0,n);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "ProgrammerS123";
        int n = 11;
        String answer = sol.solution(my_string, n);
        System.out.println("answer = " + answer);
    }
}