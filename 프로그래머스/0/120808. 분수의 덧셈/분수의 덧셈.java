class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 공통 분모 계산 및 새로운 분자 계산
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        // 최대 공약수를 사용하여 기약분수 만들기
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        return new int[]{ numerator, denominator };
    }

    private static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
