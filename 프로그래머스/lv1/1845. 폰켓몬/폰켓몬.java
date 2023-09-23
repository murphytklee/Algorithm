import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if ((nums.length / 2) < set.size()) {
            return nums.length / 2;

        }
        return set.size();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,3,3,2,2,4};
        int answer = sol.solution(nums);
        System.out.println("answer = " + answer);
    }
}
