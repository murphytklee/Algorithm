import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int M = Integer.parseInt(br.readLine());
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < M; i++) {
            String[] command = br.readLine().split(" ");
            String operation = command[0];
            
            int num = 0;
            if (command.length > 1) {
                num = Integer.parseInt(command[1]);
            }
            
            switch (operation) {
                case "add":
                    set.add(num);
                    break;
                case "remove":
                    set.remove(num);
                    break;
                case "check":
                    sb.append(set.contains(num) ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    if (set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        
        System.out.print(sb.toString());
    }
}
