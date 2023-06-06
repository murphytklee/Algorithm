class Solution {
    public String solution(int n) {
        String answer = "";
        char sue = '수';
        char park = '박';
        boolean flag = true;
        for(int i=0; i<n; ++i){
            if (flag){
                answer += sue;
            } else {
                answer += park;
            }
            flag = !flag;
        }
        return answer;
    }
}