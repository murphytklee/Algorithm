import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<List<Integer>> graph;
    static boolean[] infected;
    static int numInfected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numComputers = Integer.parseInt(br.readLine());
        int numConnections = Integer.parseInt(br.readLine());
        graph = new ArrayList<>(numComputers + 1);
        infected = new boolean[numComputers + 1];
        numInfected = -1;

        for (int i = 0; i <= numComputers; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < numConnections; i++) {
            String[] connection = br.readLine().split(" ");
            int computer1 = Integer.parseInt(connection[0]);
            int computer2 = Integer.parseInt(connection[1]);
            graph.get(computer1).add(computer2);
            graph.get(computer2).add(computer1);
        }

        dfs(1);
        bw.write(Integer.toString(numInfected));
        bw.flush();
        br.close();
        bw.close();
    }

    private static void dfs(int computer) {
        infected[computer] = true;
        numInfected++;

        for (int adjacent : graph.get(computer)) {
            if (!infected[adjacent]) {
                dfs(adjacent);
            }
        }
    }
}
