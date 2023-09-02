class Solution {
    public String solution(String n_str) {
        String answer = "";
        int beginIndex = 0;
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                break;
            }
            beginIndex++;
        }
        answer = n_str.substring(beginIndex);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String n_str = "0010";
        String answer = sol.solution(n_str);
        System.out.println("answer = " + answer);
    }
}