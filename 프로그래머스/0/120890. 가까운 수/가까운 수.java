import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int arrLength = array.length;
        Arrays.sort(array);

        int answer = array[arrLength - 1];
        int min = Math.abs(n - array[arrLength - 1]);

        for(int i = array.length - 2; i >= 0; i--){
            int diff = Math.abs(n - array[i]);
            if(diff <= min) {
                min = diff;
                answer = array[i];
            }
        }

        return answer;
    }
}