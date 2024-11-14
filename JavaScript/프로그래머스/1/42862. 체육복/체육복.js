function solution(n, lost, reserve) {
    lost.sort();
    reserve.sort();
    let lostSet = new Set(lost.filter(e => !reserve.includes(e)));
    let reserveSet = new Set(reserve.filter(e => !lost.includes(e)));
    let answer = n - lostSet.size;

    for (let student of lostSet) {
        if (reserveSet.has(student - 1)) {
            answer++;
            reserveSet.delete(student - 1);
        } else if (reserveSet.has(student + 1)) {
            answer++;
            reserveSet.delete(student + 1);
        }
    }

    return answer;
}