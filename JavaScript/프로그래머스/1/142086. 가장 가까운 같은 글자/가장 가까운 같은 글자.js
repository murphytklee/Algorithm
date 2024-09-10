function solution(s) {
    let answer = [];
    let lastSeen = {};
    
    for (let i = 0; i < s.length; i++) {
        const char = s[i];

        if (lastSeen[char] === undefined) {
            answer.push(-1);
        } else {
            answer.push(i - lastSeen[char]);
        }
        
        lastSeen[char] = i;
    }
    
    return answer;
}
