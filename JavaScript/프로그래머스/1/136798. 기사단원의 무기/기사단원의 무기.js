function solution(number, limit, power) {
    let answer = 0;
    for (let i = 1; i <= number; i++) {
        const divisors = countDivisors(i);
        answer +=  divisors > limit ? power : divisors;
    }
    return answer;
}

function countDivisors(num) {
    let count = 0;
    for (let i = 1; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
            count++;
            if (i !== num / i) {
                count++;
            }
        }
    }
    return count;
}
