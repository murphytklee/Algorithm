function solution(numbers) {
    let answer = 45;

    numbers.forEach(num => {
        answer -= num;
    });

    return answer;
}