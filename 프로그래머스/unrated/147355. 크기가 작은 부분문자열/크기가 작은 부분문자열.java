class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long numbers = Long.parseLong(t.substring(i, i + p.length()));
            System.out.println("numbers = " + numbers);
            if (Long.parseLong(p) >= numbers){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "3141592";
        String b = "271";
        int result = s.solution(a,b);
        System.out.println(result);
    }
}
