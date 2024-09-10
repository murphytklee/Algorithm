function solution(sizes) {
    const sortedArr = sizes.map(([w, h]) => w < h ? [h, w] : [w, h]);
    let maxW = 0;
    let maxH = 0;

    sortedArr.forEach(([w, h]) => {
        maxW = Math.max(maxW, w);
        maxH = Math.max(maxH, h);
    });
    
    return maxW * maxH;
}