import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(reserve);
        Arrays.sort(lost);
        Set<Integer> reserveSet = new HashSet<>();
        for (int i : reserve) {
            reserveSet.add(i);
        }
        Set<Integer> lostSet = new HashSet<>();
        for (int i : lost) {
            lostSet.add(i);
        }

        for (int i = 0; i < lost.length; i++) {
            if (reserveSet.contains(lost[i])){
                reserveSet.remove(lost[i]);
                lostSet.remove(lost[i]);
            }
        }
        
        int answer = n - lostSet.size();
        int[] lostArr = lostSet.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < lostArr.length; ++i) {
            int check = lostArr[i];
            if (reserveSet.contains(check - 1)) {
                reserveSet.remove(check - 1);
                answer++;
                continue;
            }
            if (reserveSet.contains(check + 1)) {
                reserveSet.remove(check + 1);
                answer++;
            }
        }
        return answer;
    }
}