function solution(arr) {
    let answer = [];
    arr.forEach(element => {
        if (element >= 50 && element % 2 === 0) {
            answer.push(element / 2);
        } else if (element < 50 && element % 2 === 1) {
            answer.push(element * 2);
        } else {
            answer.push(element);
        }
    });
    return answer;
}