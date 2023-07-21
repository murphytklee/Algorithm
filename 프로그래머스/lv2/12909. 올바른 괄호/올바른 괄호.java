import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

        public static void main(String[] args) {
        Solution s = new Solution();
        String str = "(()))(()";
        boolean answer = s.solution(str);
            System.out.println("answer = " + answer);
    }
}
