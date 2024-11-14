function solution(keymap, targets) {
    let answer = [];
    let map = {};

    for (const key of keymap) {
        key.split('').map((key, index) => map[key] = (map[key] < index + 1 ? map[key] : index + 1));
    }

    for (const target of targets) {
        answer.push(target.split('').reduce((cur, target) => cur += map[target], 0) || -1);
    }
    
    return answer;
}