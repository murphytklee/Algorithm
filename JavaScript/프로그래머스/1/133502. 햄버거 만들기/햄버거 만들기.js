function solution(ingredient) {
    let answer = 0;
    let stack = [];

    for (let ing of ingredient) {
        stack.push(ing);
        if (stack.length >= 4 && stack.slice(-4).join('') === '1231') {
            stack.splice(-4);
            answer++;
        }
    }

    return answer;
}