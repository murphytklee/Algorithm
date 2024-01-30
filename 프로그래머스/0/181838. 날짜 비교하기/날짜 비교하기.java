import java.time.LocalDate;

public class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate localDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate localDate2 = LocalDate.of(date2[0], date2[1], date2[2]);
        int answer;

        if (localDate1.isBefore(localDate2)){
            answer = 1;
        } else answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        int answer = sol.solution(date1, date2);
        System.out.println("answer = " + answer);
    }
}