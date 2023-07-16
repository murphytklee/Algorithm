class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String lowerCase = s.toLowerCase();
        lowerCase = " " + lowerCase;

        for (int i = 1; i < lowerCase.length(); i++) {
            char currentChar = lowerCase.charAt(i);
            char previousChar = lowerCase.charAt(i - 1);

            if (previousChar == ' ') {
                answer.append(Character.toUpperCase(currentChar));
            } else {
                answer.append(currentChar);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = " 3people    unFollowed me  4person 5GrILs";
        String answer = s.solution(str);
        System.out.println("answer = " + answer);
    }
}
