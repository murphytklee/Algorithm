import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String[] lineArr = line.split(" ");
        int answer = lineArr.length;

        if (line.length() != 1 && line.charAt(0) == ' '){
            answer -= 1;
        }

        br.close();
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
