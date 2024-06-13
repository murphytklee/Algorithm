import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));
        br.close();
    }

    public static long factorial(long n) {
        if (n > 1) {
            n = n * factorial(n - 1);
        } else {
            n = 1;
        }
        return n;
    }
}