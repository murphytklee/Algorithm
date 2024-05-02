import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] scoreStrings = br.readLine().split(" ");
        double[] scores = new double[N];
        double maxScore = 0.0;

        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(scoreStrings[i]);
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        double sum = 0.0;
        
        for (int i = 0; i < N; i++) {
            double rescaledScore = (scores[i] / maxScore) * 100;
            sum += rescaledScore;
        }

        double newAverage = sum / N;

        System.out.println(newAverage);
    }
}
