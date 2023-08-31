import java.util.Arrays;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int unfinishedCount = 0;

        for (boolean isFinished : finished) {
            if (!isFinished) {
                unfinishedCount++;
            }
        }
        
        String[] answer = new String[unfinishedCount];
        int temp = 0;
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]){
                answer[temp] = todo_list[i];
                temp++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        String[] answer = sol.solution(todo_list, finished);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}