import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0){
                answer[i] = strArr[i].toLowerCase();
            } else answer[i] = strArr[i].toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strArr = {"AAA","BBB","CCC","DDD"};
        String[] answer = sol.solution(strArr);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
