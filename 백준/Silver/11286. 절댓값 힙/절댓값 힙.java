import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>(absComparator());

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num != 0) {
                pq.offer(num);
            } else {
                if (!pq.isEmpty()) {
                    sb.append(pq.poll()).append("\n");
                } else {
                    sb.append("0\n");
                }
            }
        }

        System.out.print(sb);
    }

    public static Comparator<Integer> absComparator() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (Math.abs(a) == Math.abs(b)) {
                    return a - b;
                } else {
                    return Math.abs(a) - Math.abs(b);
                }
            }
        };
    }
}
