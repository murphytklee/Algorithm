class Solution {
    public String solution(String s) {
        String answer = "";
        //홀 수 일때
        // if (s.length()%2 ==1){
        //     answer = String.valueOf(s.charAt(s.length()/2));
        // } else {
        //     // 작수일 때
        //     answer = s.substring(s.length()/2-1, s.length()/2+1);
        // }
        answer = (s.length()%2 ==1) ? String.valueOf(s.charAt(s.length()/2)) : s.substring(s.length()/2-1, s.length()/2+1);
        
        return answer;
    }
}