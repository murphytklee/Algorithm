import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        PriorityQueue<Integer> queueA = new PriorityQueue<>();
        PriorityQueue<Integer> queueB = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            queueA.add(A[i]);
            queueB.add(B[i]);
        }
        while (!queueA.isEmpty()){
            answer += queueA.poll() * queueB.poll();
        }
        
        return answer;
    }

        public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        int answer = s.solution(A,B);
        System.out.println("answer = " + answer);
    }
}
//import java.util.Arrays;
//import java.util.Collections;
//
//class Solution {
//    public int solution(int []A, int []B)
//    {
//        Integer arr[] = Arrays.stream(B).boxed().toArray(Integer[]::new);
//        int answer = 0;
//        Arrays.sort(A);
//        Arrays.sort(arr, Collections.reverseOrder());
//        for (int i = 0; i < A.length; i++) {
//            answer += A[i] * arr[i];
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] A = {1, 4, 2};
//        int[] B = {5, 4, 4};
//        int answer = s.solution(A,B);
//        System.out.println("answer = " + answer);
//    }
//}

