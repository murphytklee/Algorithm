function solution(my_string) {
    const answer = [];
    
    my_string.split("").forEach(element => {
        if (/\d/.test(element)) {  // 정규식으로 숫자 판별
            answer.push(parseInt(element, 10)); // 숫자를 정수로 변환하여 배열에 추가
        }
    });

    return answer.sort();
}