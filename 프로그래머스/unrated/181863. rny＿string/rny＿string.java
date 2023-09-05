class Solution {
    public String solution(String rny_string) {
        String answer = "";
        answer = rny_string.replaceAll("m", "rn");
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String rny_string = "masterpiece";
        String answer = sol.solution(rny_string);
        System.out.println("answer = " + answer);
    }
}
