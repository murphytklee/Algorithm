import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] heights = new int[n];
        st = new StringTokenizer(br.readLine());
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
            maxHeight = Math.max(maxHeight, heights[i]);
        }
        
        int low = 0;
        int high = maxHeight;
        int best = 0;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            long total = 0;
            
            for (int height : heights) {
                if (height > mid) {
                    total += (height - mid);
                }
            }
            
            if (total >= m) {
                best = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println(best);
    }
}