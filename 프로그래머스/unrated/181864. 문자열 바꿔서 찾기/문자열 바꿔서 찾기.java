public class Solution {
    public int solution(String myString, String pat) {
        StringBuilder builder = new StringBuilder();
        int answer = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A'){
                builder.append("B");
            } else {
                builder.append("A");
            }
        }

        if (builder.toString().contains(pat)){
            answer = 1;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "ABBAA";
        String pat = "AABB";
        int answer = sol.solution(myString, pat);
        System.out.println("answer = " + answer);
    }
}
