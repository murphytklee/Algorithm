import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> A = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> B = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += A.get(i) * B.get(i);
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        br.close();
        bw.close();
    }
}
