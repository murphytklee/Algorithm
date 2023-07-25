class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; n-((i*(i-1))/2) > 0; i++){
            if((n-((i*(i-1))/2))% i == 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 15;
        int answer = s.solution(n);
        System.out.println("answer = " + answer);
    }
}
