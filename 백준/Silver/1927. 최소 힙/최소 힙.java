import java.io.*;
import java.util.PriorityQueue;


public class Main {

    static int x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());

            if (x > 0){
                minQueue.add(x);
            } else {
                if (minQueue.isEmpty()){
                    bw.write("0" + "\n");
                } else {
                    bw.write(Integer.toString(minQueue.poll()) + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
