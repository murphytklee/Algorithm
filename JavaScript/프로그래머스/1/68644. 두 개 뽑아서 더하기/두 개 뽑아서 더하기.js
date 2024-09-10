function solution(numbers) {
    const answer = numbers.flatMap((num, i) => 
        numbers.slice(i + 1).map(otherNum => num + otherNum)
    );

    return Array.from(new Set(answer)).sort((a, b) => a - b);
}