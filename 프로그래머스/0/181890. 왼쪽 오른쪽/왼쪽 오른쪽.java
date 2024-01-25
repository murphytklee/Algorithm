import java.util.Arrays;

public class Solution {
    public String[] solution(String[] str_list) {

        for (int i = 0; i < str_list.length;i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return new String[0];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] str_list = {"u", "u", "l", "r"};
        String[] answer = sol.solution(str_list);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
