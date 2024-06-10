import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int importance = Integer.parseInt(st.nextToken());
                q.offer(new int[]{i, importance});
                pq.offer(importance);
            }

            int count = 0;

            while (!q.isEmpty()) {
                int[] front = q.poll();

                if (pq.peek() == front[1]) {
                    pq.poll();
                    count++;
                    if (front[0] == M) {
                        sb.append(count).append('\n');
                        break;
                    }
                } else {
                    q.offer(front);
                }
            }
        }
        System.out.println(sb);
    }
}
