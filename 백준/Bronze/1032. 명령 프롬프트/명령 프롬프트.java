import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] fileNames = new String[n];

        for (int i = 0; i < n; i++) {
            fileNames[i] = br.readLine();
        }

        String pattern = findPattern(fileNames);

        bw.write(pattern);
        bw.flush();
        br.close();
        bw.close();
    }

    private static String findPattern(String[] fileNames) {
        StringBuilder pattern = new StringBuilder();

        for (int i = 0; i < fileNames[0].length(); i++) {
            char currentChar = fileNames[0].charAt(i);
            boolean isWildcard = false;

            for (int j = 1; j < fileNames.length; j++) {
                if (fileNames[j].charAt(i) != currentChar) {
                    isWildcard = true;
                    break;
                }
            }

            pattern.append(isWildcard ? "?" : currentChar);
        }

        return pattern.toString();
    }
}
