function solution(k, score) {
    let answer = [];
    let crwon = [];
    score.forEach(v => {
        if ( crwon.length < k) {
            crwon.push(v);
        } else if (v > crwon[0]) {
            crwon.shift();
            crwon.push(v);
        }
        crwon.sort((a, b) => a - b);
        answer.push(crwon[0]);
    });
    console.log();
    return answer;
}