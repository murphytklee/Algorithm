function solution(answers) {
    let answer = [];
    let a1 = [1, 2, 3, 4, 5];
    let a2 = [2, 1, 2, 3, 2, 4, 2, 5];
    let a3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let a1l = a1.length, a2l = a2.length, a3l = a3.length;
    let a1c = 0, a2c = 0, a3c = 0;

    answers.forEach((ans, i) => {
        if (ans == a1[i % a1l]) { a1c++;}
        if (ans == a2[i % a2l]) { a2c++;}
        if (ans == a3[i % a3l]) { a3c++;}
    });

    var max = Math.max(a1c,a2c,a3c);

    if (a1c === max) {answer.push(1)};
    if (a2c === max) {answer.push(2)};
    if (a3c === max) {answer.push(3)};

    return answer;
}