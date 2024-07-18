function solution (intStrs, k, s, l) {
    const answer = [];

    intStrs.forEach(num => {
        const sliceNum = parseInt(num.slice(s, s + l));
        if(sliceNum > k) {
            answer.push(sliceNum);
        }
    });

    return answer;
};