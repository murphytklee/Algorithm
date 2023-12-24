public class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            
            if (my_string.substring(i, i+1).equals(alp)){
                answer.append(my_string.substring(i, i+1).toUpperCase());
            } else {
                answer.append(my_string.substring(i, i+1));
            }
        }
        
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "programmers";
        String alp = "p";
        String answer = sol.solution(my_string, alp);
        System.out.println("answer = " + answer);
    }
}

// public class Solution {
//     public String solution(String my_string, String alp) {
//         StringBuilder answer = new StringBuilder();

//         for (int i = 0; i < my_string.length(); i++) {
//             String str = my_string.substring(i, i+1);
//             if (str.equals(alp)){
//                 answer.append(str.toUpperCase());
//             } else {
//                 answer.append(str);
//             }
//         }
        
//         return answer.toString();
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         String my_string = "programmers";
//         String alp = "p";
//         String answer = sol.solution(my_string, alp);
//         System.out.println("answer = " + answer);
//     }
// }

