class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isUpper = true;
        for (char c : s.toCharArray()) {
            if (c == ' '){
                answer.append(c);
                isUpper = true;
            } else {
                answer.append(isUpper ? Character.toUpperCase(c) : Character.toLowerCase(c));
                isUpper = !isUpper;
            }
        }
        return answer.toString();
    }
}