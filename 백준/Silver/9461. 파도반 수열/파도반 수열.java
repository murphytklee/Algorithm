import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static Long[] seq = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        precomputeSequence();
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(seq[N]);
        }
    }

    public static void precomputeSequence() {
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;
        
        for (int i = 4; i <= 100; i++) {
            seq[i] = seq[i - 2] + seq[i - 3];
        }
    }
}
