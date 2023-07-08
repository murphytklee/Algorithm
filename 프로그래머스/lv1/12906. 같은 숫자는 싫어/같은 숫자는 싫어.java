import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] input) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i-1]){
                arrayList.add(input[i]);
            }
        }
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size() ; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1,1,3,3,0,1,1};
        int[] result = s.solution(a);
        System.out.println(Arrays.toString(result));
    }
}
