function solution (l, r) {
    const answer = [];
    
    for (let i = l; i <= r; i++) {
        if (isOnlyFiveAndZero(i)) {
            answer.push(i);
        }
    }

    return answer.length > 0 ? answer : [-1];
};

const isOnlyFiveAndZero = (num) => {
    const str = num.toString();
    return str.split('').every((digit) => digit === '0' || digit === '5');
};