import java.io.*;
import java.util.*;

public class Main {

    static int[][] maze;
    static int N, M;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 세로
        M = Integer.parseInt(st.nextToken()); // 가로
        maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String road = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = road.charAt(j) - '0';
            }
        }
        
        bfs(0, 0);
        bw.write(Integer.toString(maze[N-1][M-1]));
        bw.flush();
        bw.close();
    }

    private static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && maze[nx][ny] == 1) {
                    maze[nx][ny] = maze[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
    }
}
