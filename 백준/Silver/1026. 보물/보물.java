import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(stA.nextToken()));
            B.add(Integer.parseInt(stB.nextToken()));
        }

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += A.get(i) * B.get(i);
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        br.close();
        bw.close();
    }
}
