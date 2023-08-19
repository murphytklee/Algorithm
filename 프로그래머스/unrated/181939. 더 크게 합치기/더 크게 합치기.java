class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int value1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int value2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        if (value1 > value2) {
            return answer = value1;
        } else return answer = value2;
    }
    
    // String -> Int: Integer.parseInt
    // Int -> String: Integer.toString 

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 9;
        int b = 91;
        int answer = sol.solution(a,b);
        System.out.println("answer = " + answer);
    }
}
