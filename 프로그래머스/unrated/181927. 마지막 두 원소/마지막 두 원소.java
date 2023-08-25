import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {2, 1, 6};
        int[] answer = sol.solution(num_list);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
