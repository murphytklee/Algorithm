function solution(s, n) {
    let result = '';

    for (let i = 0; i < s.length; i++) {
        const char = s[i];
        const ascii = char.charCodeAt(0);
s
        if (ascii >= 65 && ascii <= 90) {
            result += String.fromCharCode(((ascii - 65 + n) % 26) + 65);
        }
        else if (ascii >= 97 && ascii <= 122) {
            result += String.fromCharCode(((ascii - 97 + n) % 26) + 97);
        }
        else {
            result += char;
        }
    }

    return result;
}