import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> diffIndex = new ArrayList<>();
        String line = br.readLine();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n - 1; i++) {
            String compareLine = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                if (diffIndex.contains(j)){
                    continue;
                }
                if (line.charAt(j) != compareLine.charAt(j)){
                    diffIndex.add(j);
                }
            }
        }

        for (int i = 0; i < line.length(); i++) {
            if (diffIndex.contains(i)){
                answer.append("?");
            } else {
                answer.append(line.charAt(i));
            }
        }


        bw.write(answer.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
