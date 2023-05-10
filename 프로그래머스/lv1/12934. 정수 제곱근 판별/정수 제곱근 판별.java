import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = 0;
        sqrt = Math.sqrt(n);
        if(sqrt == (long)sqrt)
            return (long)Math.pow(sqrt + 1, 2);
        else
            return -1;
    }
}