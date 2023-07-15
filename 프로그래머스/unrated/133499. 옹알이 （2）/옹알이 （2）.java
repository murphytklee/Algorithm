import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length ; i++) {
            babbling[i] = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama", " ");
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma","");
            if (babbling[i].equals("")){
                answer++;
            }
        }
        System.out.println("babbling = " + Arrays.toString(babbling));

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int answer = s.solution(babbling);
        System.out.println("answer = " + answer);
    }
}