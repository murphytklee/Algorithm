function solution(X, Y) {
    const count = new Map();
    let answer = '';

    for (let num of X) {
        count.set(num, (count.get(num) || 0) + 1);
    }
    
    for (let num of Y) {
        if (count.has(num) && count.get(num) > 0) {
            count.set(num, count.get(num) - 1);
            answer += num;
        }
    }

    answer = [...answer].sort((a, b) => b - a).join('');

    return answer === '' ? "-1" : answer[0] === '0' ? "0" : answer;
}