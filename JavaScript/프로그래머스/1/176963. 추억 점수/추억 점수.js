function solution(name, yearning, photo) {
    var answer = [];
    let map = {};
    
    name.forEach((key, i) => {
        map[key] = yearning[i];
    });
    
    photo.forEach(row => {
        let point = 0;

        row.forEach(key => {
            point += map[key] == undefined ? 0 : map[key];
        })
        answer.push(point);
    });

    return answer;
}