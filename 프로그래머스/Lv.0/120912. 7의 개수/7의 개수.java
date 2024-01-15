public class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0){
                if (array[i] % 10 == 7){
                    answer++;
                }
                array[i] /= 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {7, 77, 17};
        int answer = sol.solution(array);
        System.out.println("answer = " + answer);
    }
}