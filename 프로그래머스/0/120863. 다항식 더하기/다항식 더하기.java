import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String[] hang = polynomial.split(" \\+ ");
        int x = 0;
        int constant = 0;

        for(String s : hang){
            if(s.contains("x")){
                String xs = s.replace("x", "");
                x += xs.isEmpty() ? 1 : Integer.parseInt(xs);
            } else constant += Integer.parseInt(s);
        }

        StringBuilder answer = new StringBuilder();
        
        if(x == 1){
            answer.append("x");
        } else if(x > 1){
            answer.append(x).append("x");   
        }
        
        if (constant != 0) {
            if (constant > 0 && x != 0) {
                answer.append(" + ");
            }
            answer.append(constant);
        }
        return answer.toString();
    }
}