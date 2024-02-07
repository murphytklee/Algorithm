public class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] s_list = s.split(" ");

        for (int i = 0; i < s_list.length; i++) {
            if (s_list[i].equals("Z")){
                answer -= Integer.parseInt(s_list[i - 1]);
            } else {
                answer += Integer.parseInt(s_list[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "10 Z 20 Z 1";
        int answer = sol.solution(s);
        System.out.println("answer = " + answer);
    }
}