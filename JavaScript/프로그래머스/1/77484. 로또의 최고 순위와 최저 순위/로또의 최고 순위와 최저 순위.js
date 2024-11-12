function solution(lottos, win_nums) {
    let matches = 0;
    let unknowns = 0;

    for (let num of lottos) {
        if (num === 0) {
            unknowns++;
        } else if (win_nums.includes(num)) {
            matches++;
        }
    }
    const maxRank = Math.min(7 - (matches + unknowns), 6);
    const minRank = Math.min(7 - matches, 6);
    
    return [maxRank, minRank];
}