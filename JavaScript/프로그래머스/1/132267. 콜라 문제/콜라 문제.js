function solution(a, b, n) {
    let answer = 0;
    
    while (n >= a) {
        let change = Math.floor(n / a) * b;
        let rest = n % a;
        n = change + rest;
        answer += change;
    }
    return answer;
}