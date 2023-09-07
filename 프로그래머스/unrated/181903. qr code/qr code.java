class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length() ; i++) {
            if (i % q == r){
                answer += code.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int q = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";
        String answer = sol.solution(q, r, code);
        System.out.println("answer = " + answer);
    }
}
