class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a){
            int change = (n/a)*b;
            int rest = n%a;
            n = change + rest;
            answer += change;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int a = 3;
        int b = 1;
        int n = 20;
        int answer = s.solution(a,b,n);
        System.out.println("answer = " + answer);
    }
}
