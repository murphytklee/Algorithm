function solution(dartResult) {
    let totalScore = 0;
    let previousScore = 0;
    let arr = dartResult.match(/\d+[SDT][*#]?/g);

    arr.forEach(el => {
        let [_, num, bonus, option] = el.match(/(\d+)([SDT])([*#]?)/);
        num = +num;

        let score = bonus === 'S' ? num : bonus === 'D' ? num ** 2 : num ** 3;

        if (option === '*') {
            score *= 2;
            totalScore += previousScore;
        } else if (option === '#') {
            score *= -1;
        }
        totalScore += score;
        previousScore = score;

    });

    return totalScore;
}