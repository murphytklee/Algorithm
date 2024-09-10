function solution(sizes) {
    let answer = 0;
    let maxW = 0;
    let maxH = 0;
    sizes.forEach(size => {
        let w = Math.max(size[0],size[1]);
        let h = Math.min(size[0],size[1]);

        maxW = Math.max(maxW, w);
        maxH = Math.max(maxH, h);
    });
    answer = maxW * maxH;
    return answer;
}