import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int index = 0;
        Integer[] integerArr = new Integer[arr.length]; // int[] -> Integer[]
        for (int i = 0; i < arr.length; i++) { //최솟값, 최솟값 인덱스 찾기
            integerArr[i] = Integer.valueOf(arr[i]);
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        // Integer -> List
        List<Integer> intList = new ArrayList<>(Arrays.asList(integerArr));
        intList.remove(index); //최솟값 제거
        if (intList.isEmpty()) { //arr 길이가 1인 배열은 삭제되어 비어있다.
            return new int[]{-1};
        }
        int[] answer = intList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
