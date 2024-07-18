function solution(arr, k) {
    let answer = [];
    let seen = new Set();

    for (let element of arr) {
        if (!seen.has(element)) {
            seen.add(element);
            answer.push(element);
        }
        if (answer.length === k) {
            break;
        }
    }

    while (answer.length < k) {
        answer.push(-1);
    }

    return answer;
}