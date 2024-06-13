import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = 0;

        for (int i = 1; i < 4; i++) {
            int n = Integer.parseInt(br.readLine());
            score += n * i;
        }
        if (score >= 10){
            System.out.println("happy");
        } else System.out.println("sad");
        
        br.close();
    }
}