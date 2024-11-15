function solution(X, Y) {
    const count = new Map();
    const arr = [];

    for (let num of X) {
        count.set(num, (count.get(num) || 0) + 1);
    }

    for (let num of Y) {
        if (count.has(num) && count.get(num) > 0) {
            arr.push(num);
            count.set(num, count.get(num) - 1);
        }
    }

    const answer = arr.sort((a, b) => b - a).join('');

    return answer === '' ? "-1" : answer[0] === '0' ? "0" : answer;
}