class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        // i 마다 약수의 갯수 구해야함.
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i ; j++) {
                if (i % j == 0 ){
                    count++;
                    if (j * j < i){
                        count++;
                    }
                }

            }
            if (count > limit){
                answer += power;
                count = 0;
            } else {
                answer += count;
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int number = 5;
        int limit = 3;
        int power = 2;
        int answer = sol.solution(number, limit, power);
        System.out.println("answer = " + answer);
    }
}
