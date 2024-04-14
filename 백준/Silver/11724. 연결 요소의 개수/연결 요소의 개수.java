import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M, connectedComponent;
    static boolean[] visited;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); // 정점 개수
            M = Integer.parseInt(st.nextToken()); // 간선 개수

            graph = new int[N + 1][N + 1];
            visited = new boolean[N + 1];
            connectedComponent = 0;

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u][v] = 1;
                graph[v][u] = 1; // Undirected graph
            }

            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    dfs(i);
                    connectedComponent++;
                }
            }

            bw.write(Integer.toString(connectedComponent));
        }
    }

    private static void dfs(int vertex) {
        visited[vertex] = true;
        for (int i = 1; i <= N; i++) {
            if (graph[vertex][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
