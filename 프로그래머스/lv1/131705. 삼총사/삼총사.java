class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if (number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {-2, 3, 0, 2, -5};
        int result = s.solution(a);
        System.out.println(result);
    }
}
