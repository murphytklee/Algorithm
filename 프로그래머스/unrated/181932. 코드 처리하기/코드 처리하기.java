public class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (mode == 0){
                if (code.charAt(i) == '1') {
                    mode = 1;
                } else if (i % 2 == 0 ){
                    answer.append(code.charAt(i));
                }
            } else {
                if (code.charAt(i) == '1'){
                    mode = 0;
                } else {
                    if (i % 2 != 0){
                        answer.append(code.charAt(i));
                    }
                }
            }
        }

        if (answer.toString().isEmpty()){
            answer.append("EMPTY");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String code = "";
        String answer = sol.solution(code);
        System.out.println("answer = " + answer);
    }
}