import java.io.*;
import java.util.*;

public class Main {
    private static List<List<Integer>> graph;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] params = br.readLine().split(" ");
        int N = Integer.parseInt(params[0]); // 정점 갯수
        int M = Integer.parseInt(params[1]); // 간선 갯수
        int V = Integer.parseInt(params[2]); // 시작점

        // 그래프 초기화
        graph = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 노드 간선 연결
        for (int i = 0; i < M; i++) {
            String[] edge = br.readLine().split(" ");
            int vertex1 = Integer.parseInt(edge[0]);
            int vertex2 = Integer.parseInt(edge[1]);
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1); // 양방향 삽입
        }
        
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        
        visited = new boolean[N + 1];
        
        dfs(V, bw);
        bw.newLine();
        Arrays.fill(visited, false);
        bfs(V, bw);

        bw.flush();
        br.close();
        bw.close();
    }

    private static void dfs(int vertex, BufferedWriter bw) throws IOException {
        visited[vertex] = true;
        bw.write(vertex + " ");

        for (int adjVertex : graph.get(vertex)) {
            if (!visited[adjVertex]) {
                dfs(adjVertex, bw);
            }
        }
    }

    private static void bfs(int start, BufferedWriter bw) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            bw.write(vertex + " ");

            for (int adjVertex : graph.get(vertex)) {
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.offer(adjVertex);
                }
            }
        }
    }
}


