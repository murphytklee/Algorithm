function solution(answers) {
    const supo1 = [1, 2, 3, 4, 5];
    const supo2 = [2, 1, 2, 3, 2, 4, 2, 5];
    const supo3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

    const counts = {1: 0, 2: 0, 3: 0};

    for (let i = 0; i < answers.length; i++) {
        if (answers[i] === supo1[i % supo1.length]) counts[1]++;
        if (answers[i] === supo2[i % supo2.length]) counts[2]++;
        if (answers[i] === supo3[i % supo3.length]) counts[3]++;
    }
    const maxCount = Math.max(...Object.values(counts));

    return Object.entries(counts)
                 .filter(([, value]) => value === maxCount)
                 .map(([key]) => Number(key))
                 .sort((a, b) => a - b);
}