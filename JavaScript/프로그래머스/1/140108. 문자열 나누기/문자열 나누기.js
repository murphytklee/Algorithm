function solution(s) {
    let answer = 0;
    let firstLetter = s.charAt(0);
    let sameCount = 1;
    let diffCount = 0;

    for (let i = 1; i < s.length; i++) {
        if (firstLetter === s.charAt(i)) {
            sameCount++;
        } else diffCount++;
        
        if (sameCount === diffCount) {
            sameCount = 0;
            diffCount = 0;
            firstLetter = s.charAt(i + 1);
            answer++;
        }
    }

    return sameCount != diffCount ? answer + 1 : answer;
}