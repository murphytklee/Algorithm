import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String sortedNumber = sortNumber(n);

        bw.write(sortedNumber);
        bw.flush();
        br.close();
        bw.close();
    }

    private static String sortNumber(int n){
        String[] digits = Integer.toString(n).split("");
        Arrays.sort(digits, Collections.reverseOrder());

        StringBuilder sortedNumber = new StringBuilder();

        for (String digit : digits) {
            sortedNumber.append(digit);
        }

        return sortedNumber.toString();
    }
}
