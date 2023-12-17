public class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 0, 0, 1, 0, 0};
        int idx = 4;
        int answer = sol.solution(arr, idx);
        System.out.println("answer = " + answer);
    }
}
