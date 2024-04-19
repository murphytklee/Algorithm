class Solution {
    public int[] solution(int[] arr) {
        int arrLength = arr.length;
        int updateLength = 1;
        while (updateLength < arrLength) {
            updateLength *= 2;
        }

        if (arrLength == updateLength) {
            return arr;
        } else {
            int[] answer = new int[updateLength];
            for(int i = 0; i < arrLength; i++){
                answer[i] = arr[i];
            }
            return answer;
        }
    }
}
