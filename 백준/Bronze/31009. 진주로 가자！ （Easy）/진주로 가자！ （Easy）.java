import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int jinjuFare = 0;
        int moreExpensiveCount = 0;
        int[] fares = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String destination = st.nextToken();
            int fare = Integer.parseInt(st.nextToken());
            fares[i] = fare;

            if (destination.equals("jinju")) {
                jinjuFare = fare;
            }
        }

        for (int fare : fares) {
            if (fare > jinjuFare) {
                moreExpensiveCount++;
            }
        }

        System.out.println(jinjuFare);
        System.out.println(moreExpensiveCount);
    }
}
