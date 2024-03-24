import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        int hour = Integer.parseInt(line.split(" ")[0]);
        int minute = Integer.parseInt(line.split(" ")[1]);
        int needMinute = Integer.parseInt(br.readLine());
        br.close();

        if (minute + needMinute >= 60){
            hour += (minute + needMinute) / 60;
        }
        minute = (minute + needMinute) % 60;

        if (hour >= 24){
            hour %= 24;
        }

        bw.write(hour + " " + minute);
        bw.flush();
        bw.close();
    }
}
