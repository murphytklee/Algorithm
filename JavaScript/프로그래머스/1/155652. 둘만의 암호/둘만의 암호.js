function solution(s, skip, index) {
    const skipAsciiCode = [...skip].map(char => char.charCodeAt(0));
    const answer = [...s].map(char => {
        let newAscii = char.charCodeAt(0);

        for (let i = 0; i < index; i++) {
            newAscii++;
            if (newAscii > 122) newAscii = 97;
    
            while (skipAsciiCode.includes(newAscii)) {
                newAscii++;
                if (newAscii > 122) newAscii = 97;
            }
        }
        return String.fromCharCode(newAscii);
    }).join('');

    return answer;
}