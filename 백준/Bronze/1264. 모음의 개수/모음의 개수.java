import java.io.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        String line;
        while ((line = br.readLine()) != null && !line.equals("#")) {
            bw.write(countVowels(line, vowels) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    private static int countVowels(String line, Set<Character> vowels) {
        int count = 0;
        
        for (char c : line.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        
        return count;
    }
}