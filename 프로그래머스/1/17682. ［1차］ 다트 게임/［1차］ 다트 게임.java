import java.util.HashMap;

public class Solution {
    public int solution(String dartResult) {
        HashMap<Integer, Integer> scores = new HashMap<>();
        int startIndex = 0;
        int point;
        int dartRound = 1;
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T' ) {

                point = Integer.parseInt(dartResult.substring(startIndex, i));

                if (dartResult.charAt(i) == 'S'){
                    scores.put(dartRound, point);
                } else if (dartResult.charAt(i) == 'D') {
                    scores.put(dartRound, (int) Math.pow(point, 2));
                } else if (dartResult.charAt(i) == 'T') {
                    scores.put(dartRound, (int) Math.pow(point, 3));
                }

                if (i+1 < dartResult.length()){
                    if (dartResult.charAt(i+1) == '*'){
                        scores.put(dartRound, scores.get(dartRound) * 2);
                        if (dartRound > 1){
                            scores.put(dartRound-1, scores.get(dartRound-1) * 2);
                        }
                        startIndex = i + 2;
                    } else if (dartResult.charAt(i+1) == '#') {
                        scores.put(dartRound, scores.get(dartRound) * -1);
                        startIndex = i + 2;
                    } else {
                        startIndex = i + 1;
                    }
                }
                dartRound++;
            }
        }
        int answer = scores.get(1) + scores.get(2) + scores.get(3);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String dartResult = "1D2S0T";
        int answer = sol.solution(dartResult);
        System.out.println("answer = " + answer);
    }
}
