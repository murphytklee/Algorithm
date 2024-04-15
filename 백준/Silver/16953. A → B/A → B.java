import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static long A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<Long> queue = new LinkedList<>();
        queue.offer(A);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;

            for (int i = 0; i < size; i++) {
                long currentNum = queue.poll();
                long temp1 = currentNum * 2;
                long temp2 = currentNum * 10 + 1;
                
                if (currentNum == B) {
                    return count;
                }
                if (temp1 <= B) {
                    queue.offer(temp1);
                }
                if (temp2 <= B) {
                    queue.offer(temp2);
                }
            }
        }
        return -1;
    }
}
