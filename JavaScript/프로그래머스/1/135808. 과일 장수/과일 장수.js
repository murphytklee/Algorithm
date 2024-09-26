function solution(k, m, score) {
	let boxSize = score.length;
	let answer = 0;

	score.sort();

	while (boxSize >= m) {
		answer += score[boxSize - m] * m;
		boxSize -= m;
	}
	
	return answer;
}