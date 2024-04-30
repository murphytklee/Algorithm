import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            int minOperations = dp[i - 1] + 1;

            if (i % 2 == 0) {
                minOperations = Math.min(minOperations, dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                minOperations = Math.min(minOperations, dp[i / 3] + 1);
            }

            dp[i] = minOperations;
        }

        bw.write(Integer.toString(dp[N]));
        bw.flush();
        br.close();
        bw.close();
    }
}
