class Solution {
    public String solution(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            stringBuilder.append(str1.charAt(i));
            stringBuilder.append(str2.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String answer = sol.solution(str1,str2);
        System.out.println("answer = " + answer);
    }
}
