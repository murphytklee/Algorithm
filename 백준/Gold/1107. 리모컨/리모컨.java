import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static boolean[] broken;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        broken = new boolean[10];

        if (M != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                broken[Integer.parseInt(st.nextToken())] = true;
            }
        }

        System.out.println(findMinPresses());
    }

    static int findMinPresses() {
        int minPresses = Math.abs(N - 100);

        for (int i = 0; i <= 999999; i++) {
            int length = getValidLength(i);

            if (length > 0) {
                int presses = Math.abs(N - i) + length;
                minPresses = Math.min(minPresses, presses);
            }
        }
        return minPresses;
    }

    static int getValidLength(int number) {
        String str = String.valueOf(number);

        for (int i = 0; i < str.length(); i++) {
            if (broken[str.charAt(i) - '0']) {
                return -1;
            }
        }

        return str.length();
    }
}
