import java.util.*;

public class Solution {
    public int solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] prevArr = arr.clone();

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (prevArr[j] >= 50 && prevArr[j] % 2 == 0) {
                    arr[j] = prevArr[j] / 2;
                } else if (prevArr[j] < 50 && prevArr[j] % 2 != 0) {
                    arr[j] = prevArr[j] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, prevArr)) {
                list.add(i - 1);
                break;
            }
            prevArr = arr.clone();
        }

        return Collections.min(list);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        int answer = sol.solution(arr);
        System.out.println("answer = " + answer);
    }
}
