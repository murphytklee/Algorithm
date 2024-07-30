function solution(n) {
    let answer = '';
    let flag = true;
    while (n-- > 0) {
        if (flag) {
            answer += '수';
        } else answer += '박';
        flag = !flag;
    }
    return answer;
}