import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; ++i) {
            if (supo1[i % supo1.length] == answers[i]) {
                ++count1;
            }
            if (supo2[i % supo2.length] == answers[i]) {
                ++count2;
            }
            if (supo3[i % supo3.length] == answers[i]) {
                ++count3;
            }
        }

        int highest = Math.max(Math.max(count1, count2), count3);

        // Add the students with the highest score to an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        if (count1 == highest) {
            list.add(1);
        }
        if (count2 == highest) {
            list.add(2);
        }
        if (count3 == highest) {
            list.add(3);
        }

        // Convert the ArrayList to an array and return it
        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); ++j) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}