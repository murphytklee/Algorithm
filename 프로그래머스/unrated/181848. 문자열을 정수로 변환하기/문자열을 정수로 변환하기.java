class Solution {
    public int solution(String n_str) {
        int answer = Integer.parseInt(n_str);;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String n_str = "10";
        int answer = sol.solution(n_str);
        System.out.println("answer = " + answer);
    }
}
