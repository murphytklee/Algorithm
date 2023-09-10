import java.util.Arrays;

class Solution {
    public String[] solution(String[] names) {

        int size = names.length / 5 + 1;
        if (names.length % 5 == 0) {
            size = names.length / 5;
        }

        String[] answer = new String[size];

        for (int i = 0; i < size; i++) {
            answer[i] = names[5*i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] answer = sol.solution(names);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
