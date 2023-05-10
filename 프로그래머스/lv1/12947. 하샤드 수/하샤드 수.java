import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int z = x;
        int y = 0;
        while (x != 0){
            y += x%10;
            x /= 10;
        }
        if (z%y != 0){
            answer = false;
        }
        return answer;
    }
}