public class Solution {
   public String solution(String my_string, int[][] queries) {
       StringBuilder answer = new StringBuilder(my_string);
       for (int i = 0; i < queries.length; i++) {
           answer.replace(queries[i][0], queries[i][1] + 1, new StringBuilder(answer.substring(queries[i][0], queries[i][1] + 1)).reverse().toString());
       }

       return answer.toString();
   }

   public static void main(String[] args) {
       Solution sol = new Solution();
       String my_string = "rermgorpsam";
       int[][] queries = {{2,3}, {0,7}, {5,9}, {6,10}};
       String answer = sol.solution(my_string,queries);
       System.out.println("answer = " + answer);
   }
}