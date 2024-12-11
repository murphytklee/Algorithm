function solution(want, number, discount) {
    var answer = 0;
    let totalAmt = number.reduce((acc, cur) => {return acc + cur;}, 0);
    
    for (let i = 0; i <= discount.length - totalAmt; i++) {
        let test = discount.slice(i, i + totalAmt);
        let temp = number.slice();

        for (let j = 0; j < test.length; j++) {
            let index = want.indexOf(test[j]);
            temp[index] -= 1;
        }
        
        if (temp.every(el => el === 0)) {
            answer++;
        }
    }
    return answer;
}