import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i=0; i<d.length; i++){
            answer += 1;
            budget -= d[i];
            if (budget < 0){
                answer -= 1;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}