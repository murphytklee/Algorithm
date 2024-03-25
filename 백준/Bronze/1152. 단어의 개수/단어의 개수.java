import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine().trim();
        String[] lineArr = line.split(" ");
        int answer = line.isEmpty() ? 0 : lineArr.length;

        bw.write(Integer.toString(answer));
        bw.newLine();
        br.close();
        bw.close();
    }
}
