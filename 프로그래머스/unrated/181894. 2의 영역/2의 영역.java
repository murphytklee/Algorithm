import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                index1 = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2){
                index2 = i;
                break;
            }
        }

        if (index1 != -1 && index2 != -1) {
            return Arrays.copyOfRange(arr, index1, index2 + 1);
        } else if (index1 == index2 && index1 != -1) {
            return new int[]{2};
        } else {
            return new int[]{-1};
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 1, 1};
        int[] answer = sol.solution(arr);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}