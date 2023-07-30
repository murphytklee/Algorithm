class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (i >= s && i < s+overwrite_string.length()){
                stringBuilder.append(overwrite_string.charAt(i-s));
            } else stringBuilder.append(my_string.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        String answer = sol.solution(my_string, overwrite_string, s);
        System.out.println("answer = " + answer);
    }
}
