import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcount = 0;
        int ycount = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'p') {
                pcount++;
            } else if (s.charAt(i) == 'y'){
                ycount++;
            }
        }
        if (pcount==ycount) {
            return true;
        } else {
            return false;
        }
    }
}