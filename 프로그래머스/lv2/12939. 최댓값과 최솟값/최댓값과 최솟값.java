import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("\\s");
        
        int[] numbers = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        answer = min + " " + max;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "-1 -2 -3 -4";
        String answer = s.solution(str);
        System.out.println("answer = " + answer);
    }
}
