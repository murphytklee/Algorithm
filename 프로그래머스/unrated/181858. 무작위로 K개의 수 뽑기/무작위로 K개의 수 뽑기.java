import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> uniqueNumbers = new HashSet<>();
        int index = 0;

        for (int num : arr) {
            if (!uniqueNumbers.contains(num)) {
                answer[index] = num;
                uniqueNumbers.add(num);
                index++;
                if (index == k) {
                    break;
                }
            }
        }
        
        while (index < k) {
            answer[index] = -1;
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;
        int[] answer = sol.solution(arr, k);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
