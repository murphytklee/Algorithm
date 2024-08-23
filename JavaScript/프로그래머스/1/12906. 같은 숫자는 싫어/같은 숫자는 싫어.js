function solution(arr) {
    const answer = [];
    let lastValue;

    for (const element of arr) {
        if (element !== lastValue) {
            answer.push(element);
            lastValue = element;
        }
    }

    return answer;
}