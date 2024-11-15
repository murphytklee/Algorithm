function solution(numbers, hand) {
    const keypad = {
        1: [0,0], 2: [0,1], 3: [0,2],
        4: [1,0], 5: [1,1], 6: [1,2],
        7: [2,0], 8: [2,1], 9: [2,2],
        10: [3,0], 0: [3,1], 11: [3,2]
    };
    
    let answer = [];
    let curL = 10;
    let curR = 11;

    function calculateDistance(from, to) {
        return Math.abs(keypad[from][0] - keypad[to][0]) + Math.abs(keypad[from][1] - keypad[to][1]);
    }

    for (let num of numbers) {
        if (num == 1 || num == 4 || num == 7) {
            curL = num;
            answer.push('L');
        } else if (num == 3 || num == 6 || num == 9) {
            curR = num;
            answer.push('R');
        } else {
            let dtL = calculateDistance(curL, num);
            let dtR = calculateDistance(curR, num);
            
            if (dtL < dtR || (dtL === dtR && hand === 'left')) {
                curL = num;
                answer.push('L');
            } else {
                curR = num;
                answer.push('R');
            }
        }
    }
    
    return answer.join('');
}