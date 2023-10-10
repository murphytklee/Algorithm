import java.util.Arrays;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        if (isAllSame(arr)) {
            return 1111 * arr[0];

        } else if (isThreeSame(arr)) {
            int p = arr[0] == arr[1] ? arr[0] : arr[3];
            int q = arr[0] == arr[1] ? arr[3] : arr[0];
            return (10 * p + q) * (10 * p + q);

        } else if (isTwoPairs(arr)) {
            int p = arr[0] == arr[1] ? arr[0] : arr[2];
            int q = arr[0] == arr[1] ? arr[2] : arr[0];
            return (p + q) * Math.abs(p - q);

        } else if (isOnePair(arr)){
            if (arr[0] == arr[1]){
                return arr[2] * arr[3];
                
            } else if (arr[1] == arr[2]) {
                return arr[0] * arr[3];
                
            } else {
                return arr[0] * arr[1];
            }
        } else {
            return arr[0];
        }
    }

    private static boolean isAllSame(int[] arr) {
        return arr[0] == arr[3];
    }

    private static boolean isThreeSame(int[] arr) {
        return (arr[0] == arr[2] && arr[2] != arr[3]) || (arr[1] == arr[3] && arr[0] != arr[1]);
    }

    private static boolean isTwoPairs(int[] arr) {
        return (arr[0] == arr[1] && arr[2] == arr[3]);
    }

    private static boolean isOnePair(int[] arr){
        return (arr[0] == arr[1] && arr[1] != arr[2] && arr[2] != arr[3]) ||
                (arr[0] != arr[1] && arr[1] == arr[2] && arr[2] != arr[3]) ||
                (arr[0] != arr[1] && arr[1] != arr[2] && arr[2] == arr[3]);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 4;
        int b = 1;
        int c = 4;
        int d = 4;
        int answer = sol.solution(a, b, c, d);
        System.out.println("answer = " + answer);
    }
}
