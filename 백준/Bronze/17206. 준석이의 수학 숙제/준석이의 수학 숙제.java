import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        
        int maxN = 0;
        int[] queries = new int[T];
        for (int i = 0; i < T; i++) {
            queries[i] = Integer.parseInt(inputs[i]);
            if (queries[i] > maxN) {
                maxN = queries[i];
            }
        }
        
        int[] sumMultiples = new int[maxN + 1];
        for (int i = 1; i <= maxN; i++) {
            sumMultiples[i] = sumMultiples[i - 1];
            if (i % 3 == 0 || i % 7 == 0) {
                sumMultiples[i] += i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(sumMultiples[queries[i]]).append("\n");
        }
        
        System.out.print(sb);
    }
}