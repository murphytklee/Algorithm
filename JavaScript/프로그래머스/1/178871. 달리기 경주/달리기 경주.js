function solution(players, callings) {
    const playerIndices = new Map();

    players.forEach((player, index) => {
        playerIndices.set(player, index);
    });

    callings.forEach(call => {
        const index = playerIndices.get(call);
        [players[index-1], players[index]] = [players[index], players[index-1]];
        playerIndices.set(players[index - 1], index - 1);
        playerIndices.set(players[index], index);
    });

    return players;
}