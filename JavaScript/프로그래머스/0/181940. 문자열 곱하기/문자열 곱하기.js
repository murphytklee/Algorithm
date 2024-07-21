// Js에서 StringBuilder를 사용하지 않는 이유 : https://tech-monster.tistory.com/178

function solution(my_string, k) {
    let answer = '';
    for (let i = 0; i < k; i++){
        answer += my_string;
    }
    return answer;
}