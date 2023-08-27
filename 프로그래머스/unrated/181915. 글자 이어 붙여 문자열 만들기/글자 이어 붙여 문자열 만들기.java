class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for (int i : index_list) {
            answer += my_string.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String answer = sol.solution(my_string, index_list);
        System.out.println("answer = " + answer);
    }
}
