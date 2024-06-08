import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        int[] stack = new int[N];
        int idx = 0;
        int start = 0;
        
        boolean possible = true;

        while (N-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stack[idx] = i;
                    idx++;
                    sb.append('+').append('\n');
                }
                start = value;
            }

            if (stack[idx - 1] != value) {
                possible = false;
                break;
            }

            idx--;
            sb.append('-').append('\n');
        }
        
        if (possible) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
