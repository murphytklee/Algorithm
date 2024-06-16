import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int K = Integer.parseInt(br.readLine());
            String[] studentNumbersStr = br.readLine().split(" ");
            Set<Integer> studentNumbers = new HashSet<>();
            for (String num : studentNumbersStr) {
                studentNumbers.add(Integer.parseInt(num));
            }

            int N = Integer.parseInt(br.readLine());
            List<int[]> participants = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String[] result = br.readLine().split(" ");
                int participationNumber = Integer.parseInt(result[0]);
                int hours = Integer.parseInt(result[1]);
                int minutes = Integer.parseInt(result[2]);
                participants.add(new int[] { participationNumber, hours, minutes });
            }

            int bestTimeStudent = -1;
            int bestTime = Integer.MAX_VALUE;
            int certificateCount = 0;

            for (int[] participant : participants) {
                int number = participant[0];
                int hours = participant[1];
                int minutes = participant[2];

                if (studentNumbers.contains(number) && hours != -1 && (hours < 6 || (hours == 6 && minutes == 0))) {
                    certificateCount++;
                    int totalMinutes = hours * 60 + minutes;
                    if (totalMinutes < bestTime) {
                        bestTime = totalMinutes;
                        bestTimeStudent = number;
                    }
                }
            }

            System.out.println(bestTimeStudent + " " + certificateCount);
        }
    }
}
