import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += " ";
                continue;
            }
            char temp = s.charAt(i);
            int asc = 0;
            if (Character.isLowerCase(temp)) {
                asc = temp + n;
                if (asc > 122) {
                    asc = 96 + (asc - 122);
                }
            } else if (Character.isUpperCase(temp)){
                asc = temp + n;
                if (asc > 90){
                    asc = 64 + (asc - 90);
                }
            }
            answer = answer + Character.toString((char)asc);
        }

        System.out.println(answer);
        return answer;
    }
}