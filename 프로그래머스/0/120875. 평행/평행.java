class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double l, k;
        
        //[0] - [1] / [2] - [3]
        l = (double) (dots[0][0] - dots[1][0]) / (dots[0][1] - dots[1][1]);
        k = (double) (dots[2][0] - dots[3][0]) / (dots[2][1] - dots[3][1]);
        if (l == k) answer = 1;
        
        //[0] - [2] / [1] - [3]
        l = (double) (dots[0][0] - dots[2][0]) / (dots[0][1] - dots[2][1]);
        k = (double) (dots[1][0] - dots[3][0]) / (dots[1][1] - dots[3][1]);
        if (l == k) answer = 1;
        
        //[0] - [3] / [1] - [2]
        l = (double) (dots[0][0] - dots[3][0]) / (dots[0][1] - dots[3][1]);
        k = (double) (dots[1][0] - dots[2][0]) / (dots[1][1] - dots[2][1]);
        if (l == k) answer = 1;
        
        return answer;
    }
}
