import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            if (queue.size() > k) {
                queue.poll();
            }
            answer[i] = queue.peek();
        }
        return answer;
    }
    /*
    * 우선순위 큐, "PriorityQueue"는 기본적으로 작은 값이 높은 우선순위를 가지도록 구현되어있다.
    * poll() 메서드를 호출하면 가장 작은 값이 제거되고.
    * peek() 호출하면 가장 작은 값이 반환된다.
    * 반대로 큰 값이 우선순위를 갖도록 하려면 PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    */
        public static void main(String[] args) {
        Solution s = new Solution();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = s.solution(k,score);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
