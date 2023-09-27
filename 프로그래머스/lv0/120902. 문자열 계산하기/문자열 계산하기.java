public class Solution {
    public int solution(String my_string) {

        String[] s_arr = my_string.split(" ");
        int answer = Integer.parseInt(s_arr[0]);
        for (int i = 0; i < s_arr.length; i++) {
            if (i%2!=0){
                if (s_arr[i].replaceAll("\\s", "").equals("+")){
                    answer += Integer.parseInt(s_arr[i+1]);
                } else answer -= Integer.parseInt(s_arr[i+1]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "12 + 14";
        int answer = sol.solution(my_string);
        System.out.println("answer = " + answer);
    }
}
