import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String document = br.readLine();
        String word = br.readLine();

        int count = 0;
        int position = 0;

        while (true) {
            int index = document.indexOf(word, position);

            if (index == -1) {
                break;
            }

            count++;
            position = index + word.length();
        }

        bw.write(Integer.toString(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
