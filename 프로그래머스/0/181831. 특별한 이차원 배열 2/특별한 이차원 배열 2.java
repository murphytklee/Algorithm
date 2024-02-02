public class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]){
                    answer = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int answer = sol.solution(arr);
        System.out.println("answer = " + answer);
    }
}