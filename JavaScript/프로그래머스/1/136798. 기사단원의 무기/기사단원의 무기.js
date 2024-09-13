function solution(number, limit, power) {
    let answer = 0;
    const divisorsCount = Array(number + 1).fill(0);

    // 1부터 number까지 각 숫자의 약수를 미리 계산
    for (let i = 1; i <= number; i++) {
        for (let j = i; j <= number; j += i) {
            divisorsCount[j]++;
        }
    }

    for (let i = 1; i <= number; i++) {
        answer += divisorsCount[i] > limit ? power : divisorsCount[i];
    }
    return answer;
}