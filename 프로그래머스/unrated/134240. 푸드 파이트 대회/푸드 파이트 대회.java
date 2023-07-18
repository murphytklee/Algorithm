class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 0; i < food.length; i++) {
            int count = food[i]/2;
            if (count >= 1){
                for (int j = 0; j < count; j++) {
                    answer += i;
                }
            }
        }
        answer += "0";
        for (int i = food.length-1; i >= 0; i--) {
            int count = food[i]/2;
            if (count >= 1){
                for (int j = 0; j < count; j++) {
                    answer += i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] food = {1, 7, 1, 2};
        String answer = s.solution(food);
        System.out.println("answer = " + answer);
    }
}
