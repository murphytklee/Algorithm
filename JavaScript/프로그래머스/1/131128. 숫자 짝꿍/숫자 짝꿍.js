function solution(X, Y) {
    const countX = new Map();
    const countY = new Map();
    let answer = '';

    for (let num of X) {
        countX.set(num, (countX.get(num) || 0) + 1);
    }

    for (let num of Y) {
        countY.set(num, (countY.get(num) || 0) + 1);
    }

    for (let i = 9; i >= 0; i--) {
        const digit = i.toString();
        const minCount = Math.min(countX.get(digit) || 0, countY.get(digit) || 0);

        answer += digit.repeat(minCount);
    }

    return answer === '' ? "-1" : answer[0] === '0' ? "0" : answer;
}