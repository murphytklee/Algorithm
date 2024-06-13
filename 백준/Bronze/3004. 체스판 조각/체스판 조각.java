import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int answer;

        if (N % 2 == 0) {
            answer = (N / 2 + 1) * (N / 2 + 1);
        } else {
            answer = (N / 2 + 2) * (N / 2 + 1);
        }

        System.out.println(answer);
    }
}