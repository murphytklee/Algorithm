function solution(s) {
    let isUpper = true;
    let answer = [];
    
    s.split('').forEach(c => {
        if (c === " ") {
            isUpper = true;
            answer.push(c);
        } else {
            answer.push(isUpper ? c.toUpperCase() : c.toLowerCase());
            isUpper = !isUpper;
        }
    });
    
    return answer.join('');
}