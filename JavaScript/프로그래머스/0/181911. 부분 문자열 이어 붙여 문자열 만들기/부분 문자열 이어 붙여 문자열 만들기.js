function solution(my_strings, parts) {
    let answer = '';

    for (let i = 0; i < my_strings.length; i++) {
        let [s, e] = parts[i];
        let substring = my_strings[i].slice(s, e + 1);

        answer += substring;
    }

    return answer;
}