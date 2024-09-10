function solution(array, commands) {
    let answer = [];
    for (let t = 0; t < commands.length; t++) {
        let i = commands[t][0] - 1;
        let j = commands[t][1];
        let k = commands[t][2] - 1;
        
        answer.push(array.slice(i, j).sort((a, b) => a - b)[k]);
    }
    return answer;
}