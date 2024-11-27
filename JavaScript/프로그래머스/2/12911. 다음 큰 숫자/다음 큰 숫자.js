function solution(n) {
    let answer = n+1;
    
    while (answer.toString(2).replaceAll('0', '').length !== n.toString(2).replaceAll('0', '').length) {
        answer++;
    }

    return answer;
}