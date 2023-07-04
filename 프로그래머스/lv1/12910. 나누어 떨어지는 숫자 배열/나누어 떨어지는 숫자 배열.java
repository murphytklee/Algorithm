import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                answer[index++] = arr[i];
            }
        }
        if (index == 0){
            return new int[]{-1};
        }
        answer = Arrays.copyOfRange(answer, 0, index);
        Arrays.sort(answer);

        return answer;
    }
}
