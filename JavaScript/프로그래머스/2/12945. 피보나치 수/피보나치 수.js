function solution(n) {
    let a = 0, b = 1, fib;

    for (let i = 2; i <= n; i++) {
        fib = (a + b) % 1234567;
        a = b;
        b = fib;
    }

    return fib;
}