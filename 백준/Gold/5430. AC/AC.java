import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String commands = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arrayInput = br.readLine();

            ArrayDeque<Integer> deque = new ArrayDeque<>();
            if (n > 0) {
                StringTokenizer st = new StringTokenizer(arrayInput.substring(1, arrayInput.length() - 1), ",");
                while (st.hasMoreTokens()) {
                    deque.add(Integer.parseInt(st.nextToken()));
                }
            }

            boolean isError = false;
            boolean isReversed = false;

            for (char command : commands.toCharArray()) {
                if (command == 'R') {
                    isReversed = !isReversed;
                } else if (command == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
                }
            }

            if (isError) {
                bw.write("error\n");
            } else {
                bw.write('[');
                if (!deque.isEmpty()) {
                    if (isReversed) {
                        bw.write(deque.removeLast().toString());
                        while (!deque.isEmpty()) {
                            bw.write(',');
                            bw.write(deque.removeLast().toString());
                        }
                    } else {
                        bw.write(deque.removeFirst().toString());
                        while (!deque.isEmpty()) {
                            bw.write(',');
                            bw.write(deque.removeFirst().toString());
                        }
                    }
                }
                bw.write("]\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
