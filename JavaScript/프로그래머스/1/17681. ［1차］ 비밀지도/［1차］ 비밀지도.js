function solution(n, arr1, arr2) {
    let answer = [];

    for (let i = 0; i < n; i++) {
        let str1 = arr1[i].toString(2).padStart(n, '0');
        let str2 = arr2[i].toString(2).padStart(n, '0');
        let row = '';

        for (let j = 0; j < n; j++) {
            row += str1[j] == '1' || str2[j] == '1' ? '#' : ' ';    
        }
        answer.push(row);
    }
    return answer;
}