import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int pack = Integer.MAX_VALUE;
        int unit = Integer.MAX_VALUE;
        int answer = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            pack = Math.min(pack, Integer.parseInt(st.nextToken()));
            unit = Math.min(unit, Integer.parseInt(st.nextToken()));
        }

        if (unit * 6 < pack){
            answer = unit * N;
        } else {
            answer = pack * (N / 6);
            answer += Math.min(N % 6 * unit, pack);
        }
        
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
