class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str2.contains(str1)){
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "tbt";
        String str2 = "tbbttb";
        int answer = sol.solution(str1, str2);
        System.out.println("answer = " + answer);
    }
}
