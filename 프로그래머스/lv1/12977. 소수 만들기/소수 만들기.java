import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; ++i) {
            for (int j = i + 1; j < nums.length - 1; ++j) {
                for (int k = j + 1; k < nums.length; ++k) {
                    int check = nums[i] + nums[j] + nums[k];
                    if (isPrime(check)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private boolean isPrime(int check) {
        for (int o = 2; o < check; o++){
            if (check % o == 0) {
                return false;
            }
        }
        return true;
    }
}