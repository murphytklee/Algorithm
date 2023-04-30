import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; ++i){
            for (int j=0; j<n; ++j){
                String binary1 = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr1[i])));
                String binary2 = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr2[i])));
                if (binary1.charAt(j) == 49 || binary2.charAt(j) == 49){
                    sb.append("#");
                } else sb.append(" ");
            }
            answer[i] = sb.toString();
            sb.setLength(0);
            System.out.println(Arrays.toString(answer));
        }


        return answer;
    }
}