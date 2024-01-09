public class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length == arr2.length){
            int sum1 = 0;
            int sum2 = 0;

            for (int num : arr1) {
                sum1 += num;
            }

            for (int num : arr2) {
                sum2 += num;
            }

            answer = Integer.compare(sum1, sum2);
        } else {
            answer = Integer.compare(arr1.length, arr2.length);
        }
    return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {41, 13};
        int[] arr2 = {70, 11, 2};
        int answer = sol.solution(arr1, arr2);
        System.out.println("answer = " + answer);
    }
}
