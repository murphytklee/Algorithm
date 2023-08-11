class Solution {
    public int solution(int age) {
        int answer = 0;
        int year = 2022;
        answer = year - age +1;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int age = 23;
        int answer = sol.solution(age);
        System.out.println("answer = " + answer);
    }
}
