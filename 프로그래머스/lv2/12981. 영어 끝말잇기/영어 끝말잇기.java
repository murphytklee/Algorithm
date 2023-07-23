import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || set.contains(words[i]) || words[i].length() == 1){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break; //Important
            } else set.add(words[i]);
        }
        return answer;
    }

        public static void main(String[] args) {
        Solution s = new Solution();
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer = s.solution(n,words);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
