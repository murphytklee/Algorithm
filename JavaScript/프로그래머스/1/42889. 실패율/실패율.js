function solution(N, stages) {
	let stageCounts = {};
	let playerCount = stages.length;
	let failureRates = [];
	
	for (let i = 1; i <= N; i++) {
	  stageCounts[i] = 0;
	}
	
	stages.forEach(stage => {
		if (stage in stageCounts) {
			stageCounts[stage]++;
		}
	});
	
    for (let i = 1; i <= N; i++) {
        if (playerCount === 0) {
            failureRates.push([i, 0]);
        } else {
            let failureRate = stageCounts[i] / playerCount;
            failureRates.push([i, failureRate]);
            playerCount -= stageCounts[i];
        }
    }
	
    return failureRates.sort((a, b) => b[1] - a[1] || a[0] - b[0]).map(item => item[0]);
}