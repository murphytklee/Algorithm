import java.util.*;
class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
//        Integer[] integerNumbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        TreeSet<Integer> treenumbers = new TreeSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                treenumbers.add(numbers[i] + numbers[j]);
            }
        }
//        int[] answer = treenumbers.stream().mapToInt(Integer::intValue).toArray();
        return treenumbers;
    }
}