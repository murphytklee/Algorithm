function solution(name, yearning, photo) {
    const map = Object.fromEntries(name.map((key, i) => [key, yearning[i]]));

    return photo.map(row => 
        row.reduce((acc, key) => acc + (map[key] || 0), 0)
    );
}