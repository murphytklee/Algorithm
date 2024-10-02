function solution(n, m, section) {
    var answer = 1;
	let index = section.pop();
	if (m == 1) {
		return section.length + 1;
	}

	while (section.length > 0) {
		let current = section.pop();

		if (current >= index - (m - 1)) {
			continue;
		}
		answer++;
		index = current;
	}

    return answer;
}