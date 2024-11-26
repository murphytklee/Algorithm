function solution(s) {
    arr = s.split(' ').map(n => parseInt(n)).sort((a, b) => a - b);
    return arr[0] + ' ' + arr[arr.length - 1]; 
}