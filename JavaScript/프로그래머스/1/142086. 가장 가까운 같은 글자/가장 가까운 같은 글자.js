function solution(s) {
    let answer = [];
    
    for (let i = 0; i < s.length; i++) {
        if (i == s.indexOf(s[i])) {
            answer.push(-1);
        } else {
            for (let j = i - 1; j >= 0; j--){
                if (s[i] == s[j]) {
                    answer.push(i - j);
                    break;
                }
            }   
        }
    }
    return answer;
}