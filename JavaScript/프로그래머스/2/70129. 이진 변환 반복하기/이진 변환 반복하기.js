function solution(s) {
    let removeCount = 0;
    let transCount = 0;

    while (s != '1') {
        removeCount += s.split('0').length - 1;
        s = s.replaceAll("0", '').length.toString(2);
        transCount++;
    }

    return [transCount, removeCount];
}
