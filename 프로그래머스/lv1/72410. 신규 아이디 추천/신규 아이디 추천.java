class Solution {
    public String solution(String new_id) {
            String answer = "";
            answer = new_id.toLowerCase(); // 1
            answer = answer.replaceAll("[^0-9a-z-_.]",""); // 2
            answer = answer.replaceAll("\\.{2,}", "."); // 3
            answer = answer.replaceAll("^[.]|[.]$", ""); // 4
            answer = answer.equals("") ? "a" : answer; // 5
            answer = answer.length() >= 16 ? answer.substring(0, 15) : answer; // 6
            answer = answer.replaceAll("[.]$", ""); // 6
            char lastChar = answer.charAt(answer.length() - 1); // 7
            if (answer.length() <= 2) {
                while (!(answer.length() == 3)) {
                    answer += lastChar;
                }
            }
            return answer;
        }
}
//