import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private static final char[] mapping = new char[26];

    static {
        String googlerese = "ynficwlbkuomxsevzpdrjgthaq";
        String english =    "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 26; i++) {
            mapping[googlerese.charAt(i) - 'a'] = english.charAt(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        
        for (int t = 1; t <= T; t++) {
            String googlerese = br.readLine();
            StringBuilder english = new StringBuilder();

            for (char ch : googlerese.toCharArray()) {
                if (ch == ' ') {
                    english.append(' ');
                } else {
                    english.append(mapping[ch - 'a']);
                }
            }
            output.append("Case #").append(t).append(": ").append(english).append('\n');
        }

        System.out.print(output);
    }
}
