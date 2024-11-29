function solution(brown, yellow) {
    for (let i = 1; i <= Math.sqrt(yellow); i++) {
        if (yellow % i === 0) {
            let yx = yellow / i;
            let yy = i;

            if ((((yx + yy) * 2) + 4) == brown) {
                return [yx + 2, yy + 2];
            }
        }
    }
}