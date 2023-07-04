class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            for (int i=b;i<a+1;i++){
                answer = answer + b;
                b++;
            }
        } else if(b>a){
            for (int i=a; i<b+1 ;i++) {
                answer = answer + a;
                a++;
            }
        } else {
          answer = a;
        }
        return answer;
    }
}