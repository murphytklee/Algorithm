class Solution {
    public int solution(int n) {
        int answer = 1;
        while (n % answer != 1){
            answer++;
        }
        System.out.println(answer);
        return answer;
    }
}