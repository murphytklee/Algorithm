function solution(cards1, cards2, goal) {
    let cards1NextIndex = 0;
    let cards2NextIndex = 0;

    for (let word of goal) {
        if (word === cards1[cards1NextIndex]) {
            cards1NextIndex++;
        } else if (word === cards2[cards2NextIndex]) {
            cards2NextIndex++;
        } else {
            return 'No';
        }
    }
    return 'Yes';
}