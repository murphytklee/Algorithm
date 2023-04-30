import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] ratio = new double[N];
        int count = 0;
        int stl = stages.length;

        // answer = [1, 2, 3, ..., N]
        for (int i = 0; i < N; i++) {
            answer[i] = i + 1;
        }

        // ratio 구하기
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < stages.length ; j++) {
                if(stages[j] == i+1){
                    count++;
                }
            }
            ratio[i] = (stl == 0) ? 0 : (double) count / stl;
            stl -= count;
            count = 0;
        }

        // answer 정렬
        for (int i = 0; i < ratio.length; i++) {
            for (int j = i + 1; j < ratio.length; j++) {
                if (ratio[i] < ratio[j] || (ratio[i] == ratio[j] && answer[i] > answer[j])) {
                    double temp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = temp;

                    int tempAnswer = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tempAnswer;
                }
            }
        }

        return answer;
    }
}