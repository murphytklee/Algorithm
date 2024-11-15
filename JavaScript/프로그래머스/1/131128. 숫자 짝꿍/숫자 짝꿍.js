function solution(X, Y) {
    const countObjX = new Map();
    const countObjY = new Map();
    let answer = '';

    for (let num of X) {
        countObjX.set(num, (countObjX.get(num) || 0) + 1);
    }

    for (let num of Y) {
        countObjY.set(num, (countObjY.get(num) || 0) + 1);
    }

    for (let i = 0; i < 10; i++) {
        let x = countObjX.get(i.toString()) ?? 0;
        let y = countObjY.get(i.toString()) ?? 0;
        let minCount = Math.min(x, y);

        answer += i.toString().repeat(minCount);
    }

    if (answer.length > 0 && answer.replaceAll('0', '').length == 0) return '0';
    
    return answer != '' ? [...answer].sort().reverse().join('') : '-1';
}