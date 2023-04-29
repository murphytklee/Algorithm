import java.util.*;

class Solution {
    public int solution(long n) {
        int answer = 0;
        int count = 0;
        Stack<Integer> Stack = new Stack<>();
        while (n != 0){
            Stack.push((int) (n%3));
            n /= 3;
            count ++;
        }
        for (int i=0;i<count;++i){
            answer += Stack.pop() * Math.pow(3, i);
        }

        return answer;
    }
}