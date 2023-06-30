import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray(); // 문자열 s를 문자 배열로 변환
        Arrays.sort(arr); // 문자 배열을 오름차순으로 정렬
        // 유니코드상 대문자는 소문자의 앞에 있기 때문에 대문자가 맨 앞에 오게 된다.
        return new StringBuilder(new String(arr)).reverse().toString(); 
        // 문자 배열을 뒤집어서 문자열로 만들어 반환
    }
}
