function solution(park, routes) {
    let pos = [0, 0];

    for (let i = 0; i < park.length; i++) {
        for (let j = 0; j < park[i].length; j++) {
            if (park[i][j] === 'S') {
                pos = [i, j];
                break;
            }
        }
    }

    routes.forEach(command => {
        const [op, steps] = command.split(" ");
        move(pos, op, parseInt(steps), park);
    });

    return pos;
}

function move(pos, op, n, park) {
    let [dx, dy] = pos;

    for (let i = 0; i < n; i++) {
        switch (op) {
            case "E": dy++; break;
            case "W": dy--; break;
            case "N": dx--; break;
            case "S": dx++; break;
        }

        if (dx < 0 || dx >= park.length || dy < 0 || dy >= park[0].length || park[dx][dy] === 'X') {
            return;
        }
    }

    pos[0] = dx;
    pos[1] = dy;
}