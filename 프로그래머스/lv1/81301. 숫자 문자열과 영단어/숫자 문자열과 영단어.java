import java.util.*;
class Solution {
    public static int solution(String s) {
        // 문자열 저
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder answer = new StringBuilder();
        // 숫자가 아닌 문자열을 저장하여 비교할 String 객체 생성
        StringBuilder check = new StringBuilder();

        // 문자열 s를 한 글자씩 처리
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 문자가 숫자인 경우, answer에 숫자 추가
            if (Character.isDigit(c)) {
                answer.append(c);
            } else {
                // 문자가 알파벳인 경우, check에 문자를 추가
                check.append(c);
                String temp = check.toString();

                // check에 저장된 문자열이 0~9까지의 문자열 배열 words에 포함되어 있는지 확인
                for (int j = 0; j < words.length; j++) {
                    if (temp.equals(words[j])) {
                        // 저장된 문자열이 words에 포함되어 있다면 해당 숫자를 result에 추가
                        answer.append(j);
                        // 다음 문자열을 위해 check 초기화
                        check.setLength(0);
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}