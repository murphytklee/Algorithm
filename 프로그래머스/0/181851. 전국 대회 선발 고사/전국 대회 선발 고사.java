import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> rankIndexMap = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            rankIndexMap.put(rank[i], i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]){
                list.add(rank[i]);
            }
        }
        list.sort(Integer::compareTo);


        int a = rankIndexMap.get(list.get(0));
        int b = rankIndexMap.get(list.get(1));
        int c = rankIndexMap.get(list.get(2));

        return (10000 * a) + (100 * b) + c;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int answer = sol.solution(rank, attendance);
        System.out.println("answer = " + answer);
    }
}
