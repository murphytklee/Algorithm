import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x, y, z;

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Main {
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int M, N, H;
    static int[][][] box;
    static Queue<Point> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];
        boolean allRipe = true;

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    box[h][n][m] = Integer.parseInt(st.nextToken());
                    if (box[h][n][m] == 1) {
                        queue.add(new Point(h, n, m));
                    } else if (box[h][n][m] == 0) {
                        allRipe = false;
                    }
                }
            }
        }

        if (allRipe) {
            bw.write("0\n");
        } else {
            int result = bfs();
            if (isAllRipe()) {
                bw.write(result + "\n");
            } else {
                bw.write("-1\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int bfs() {
        int days = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point point = queue.poll();
                for (int d = 0; d < 6; d++) {
                    int nz = point.x + dz[d];
                    int nx = point.y + dx[d];
                    int ny = point.z + dy[d];
                    if (nz >= 0 && nz < H && nx >= 0 && nx < N && ny >= 0 && ny < M && box[nz][nx][ny] == 0) {
                        box[nz][nx][ny] = 1;
                        queue.add(new Point(nz, nx, ny));
                    }
                }
            }
            if (!queue.isEmpty()) {
                days++;
            }
        }
        return days;
    }

    private static boolean isAllRipe() {
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (box[h][n][m] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
