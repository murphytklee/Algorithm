import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int answer [] = new int[str.length()];

        int index= 0;
        // for (int i =str.length()-1; i>=0; i--) {
        for (int i = str.length()-1; i>=0; --i){
            answer[index] = str.charAt(i)-'0'; 
            ++index;
        } 
        return answer;
    }
}