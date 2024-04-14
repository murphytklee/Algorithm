import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int virus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 정점 갯수
        int M = Integer.parseInt(br.readLine()); // 간선 갯수
        graph = new ArrayList<>(N + 1);
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] edge = br.readLine().split(" ");
            int vertex1 = Integer.parseInt(edge[0]);
            int vertex2 = Integer.parseInt(edge[1]);
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
        }

        dfs(1);
        bw.write(Integer.toString(virus - 1));
        bw.flush();
        br.close();
        bw.close();
    }

    private static void dfs(int vertex) {
        visited[vertex] = true;
        virus++;
        for (int adjVertex : graph.get(vertex)) {
            if (!visited[adjVertex]) {
                dfs(adjVertex);
            }
        }
    }
}


