function solution (intStrs, k, s, l) {
    const answer = [];

    intStrs.forEach(num => {
        const sliceNum = num.slice(s, s + l);
        if(sliceNum > k) {
            answer.push(parseInt(sliceNum));
        }
    });

    return answer;
};