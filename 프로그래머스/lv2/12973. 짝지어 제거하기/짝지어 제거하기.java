import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "baabaa";
        int answer = s.solution(str);
        System.out.println("answer = " + answer);
    }
}
