class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        // 선택 정렬 알고리즘을 이용하여 문자열을 정렬합니다.
        for(int i = 0; i < strings.length; i++) {
            for(int j = i + 1; j < strings.length; j++) {
                // n번째 문자를 비교하여 정렬합니다.
                if(strings[i].charAt(n) > strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
                // n번째 문자가 같으면 사전순으로 정렬합니다.
                else if(strings[i].charAt(n) == strings[j].charAt(n)) {
                    if(strings[i].compareTo(strings[j]) > 0) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }

        // 반환할 배열을 초기화합니다.
        answer = strings;

        // 정렬된 배열을 반환합니다.
        return answer;
    }
}
