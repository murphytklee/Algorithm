function solution(array, commands) {
    return commands.map( command => {
        const [start, end, position] = command;
        return array.slice(start - 1, end)
                    .sort((a, b) => a - b)[position - 1];
    })
}