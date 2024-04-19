import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int minStart = Integer.MAX_VALUE;
        int maxEnd = Integer.MIN_VALUE;
        
        for (int[] line : lines) {
            minStart = Math.min(minStart, line[0]);
            maxEnd = Math.max(maxEnd, line[1]);
        }
        
        int[] counts = new int[maxEnd - minStart + 1];
        
        for (int[] line : lines) {
            int start = line[0];
            int end = line[1];
            for (int i = start - minStart; i < end - minStart; i++) {
                counts[i]++;
            }
        }
        
        int totalLength = 0;
        for (int count : counts) {
            if (count >= 2) {
                totalLength++;
            }
        }
        
        return totalLength;
    }
}
