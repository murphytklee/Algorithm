import java.util.*;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if (num > k){
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        int[] answer = sol.solution(intStrs, k, s, l);
        System.out.println(Arrays.toString(answer));
    }
}
