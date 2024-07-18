function solution (arr) {
    let answer = [];
    let i = 0;

    while (i < arr.length) {
        if (answer.length === 0) {
            answer.push(arr[i]);
            i++;
        } else if (answer[answer.length - 1] < arr[i]) {
            answer.push(arr[i]);
            i++;
        } else {
            answer.pop();
        }
    }

    return answer;
};