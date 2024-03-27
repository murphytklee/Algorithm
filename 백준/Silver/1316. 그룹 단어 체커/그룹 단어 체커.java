import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)){
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26]; // 알파벳 소문자 개수만큼의 배열 생성, 초기값: false
        int prev = -1; // 이전 문자의 인덱스를 초기화

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            int index = current - 'a'; // 현재 문자의 인덱스 계산

            // 이전 문자와 현재 문자가 다르면서 이전 문자가 이미 방문한 적이 있을 경우
            if (prev != index && visited[index]) {
                return false; // 그룹 단어가 아님
            }

            visited[index] = true; // 현재 문자 방문 처리
            prev = index; // 이전 문자 갱신
        }

        return true; // 그룹 단어임
    }
}
