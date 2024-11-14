function solution(keymap, targets) {
    let answer = [];
    let map = {};

    for (let key of keymap) {
        for (let i = 0; i < key.length; i++) {
            if (map[key[i]] === undefined || i < map[key[i]]) {
                map[key[i]] = i;
            }
        }
    }
    
    for (target of targets) {
        let count = 0;
        for (let i = 0; i < target.length; i++) {
            if (map[target[i]] !== undefined) {
                count += map[target[i]] + 1;
            } else {
                count = -1;
                break;
            }
        }
        answer.push(count);
    }

    return answer;
}