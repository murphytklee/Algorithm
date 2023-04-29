class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for (int j = left; j<right+1;j++){
            for (int i=1; i<=j;++i){
                if (j%i == 0){
                    count += 1;
                }
            }
            if (count % 2 == 0){
                answer += j;
            } else {
                answer -= j;
            }
            count = 0;
        }

        System.out.println(answer);
        return answer;
    }
}