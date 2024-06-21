import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] positions = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            positions[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        int totalOperations = 0;

        for (int target : positions) {
            int index = 0;

            Iterator<Integer> it = deque.iterator();
            while (it.hasNext()) {
                if (it.next() == target) {
                    break;
                }
                index++;
            }

            int size = deque.size();
            int leftRotations = index;
            int rightRotations = size - index;

            if (leftRotations <= rightRotations) {
                for (int i = 0; i < leftRotations; i++) {
                    deque.addLast(deque.removeFirst());
                }
                totalOperations += leftRotations;
            } else {
                for (int i = 0; i < rightRotations; i++) {
                    deque.addFirst(deque.removeLast());
                }
                totalOperations += rightRotations;
            }

            deque.removeFirst();
        }

        System.out.println(totalOperations);
    }
}
