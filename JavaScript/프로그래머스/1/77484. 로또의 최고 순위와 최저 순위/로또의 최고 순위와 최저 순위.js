function solution(lottos, win_nums) {
    const matches = lottos.filter(num => win_nums.includes(num) && num !== 0).length;
    const unknowns = lottos.filter(num => num === 0).length;
    const maxRank = Math.min(7 - (matches + unknowns), 6);
    const minRank = Math.min(7 - matches, 6);
    return [maxRank, minRank];
}