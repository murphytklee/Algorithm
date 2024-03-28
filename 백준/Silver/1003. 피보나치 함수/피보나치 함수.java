import java.io.*;

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        dp = new int[41][2];
        
        fibonacci();

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n][0] + " " + dp[n][1]);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    private static void fibonacci() {
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }
    }
}
