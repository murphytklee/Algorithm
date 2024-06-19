import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int M = Integer.parseInt(br.readLine());
        
        int bitMask = 0;
        
        for (int i = 0; i < M; i++) {
            String[] command = br.readLine().split(" ");
            String operation = command[0];

            int num = 0;
            if (command.length > 1) {
                num = Integer.parseInt(command[1]);
            }
            
            switch (operation) {
                case "add":
                    bitMask |= (1 << (num - 1));
                    break;
                case "remove":
                    bitMask &= ~(1 << (num - 1));
                    break;
                case "check":
                    sb.append((bitMask & (1 << (num - 1))) != 0 ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    bitMask ^= (1 << (num - 1));
                    break;
                case "all":
                    bitMask = (1 << 20) - 1;
                    break;
                case "empty":
                    bitMask = 0;
                    break;
            }
        }
        
        System.out.print(sb.toString());
    }
}
