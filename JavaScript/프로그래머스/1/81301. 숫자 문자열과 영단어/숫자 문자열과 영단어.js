function solution(s) {
    let answer = s;
    const regexMap = [/zero/g, /one/g, /two/g, /three/g, /four/g, /five/g, /six/g, /seven/g, /eight/g, /nine/g];
    
    for (let i = 0; i < regexMap.length; i++) {
        answer = answer.replace(regexMap[i], i);
    }
    
    return parseInt(answer, 10);
}