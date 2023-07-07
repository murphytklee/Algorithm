class Solution {
    public String solution(int a, int b) {
        String[] answer = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        for(int i=1;i<a;i++){
            days += months[i-1];
        }
        days += b-1;
        
        return answer[days%7];
    }
}