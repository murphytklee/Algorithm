import java.io.*;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 듣도 못한 사람의 수 N
        int m = Integer.parseInt(input[1]); // 보도 못한 사람의 수 M

        HashSet<String> neverHeard = new HashSet<>();
        for (int i = 0; i < n; i++) {
            neverHeard.add(br.readLine());
        }

        TreeSet<String> neverHeardAndSeen = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String person = br.readLine();
            if (neverHeard.contains(person)) {
                neverHeardAndSeen.add(person);
            }
        }

        bw.write(neverHeardAndSeen.size() + "\n");
        for (String person : neverHeardAndSeen) {
            bw.write(person + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
