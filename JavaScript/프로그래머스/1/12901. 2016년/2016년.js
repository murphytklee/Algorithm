function solution(a, b) {
    const week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
    const day = '2016-' + a + '-' + b;
    
    return week[new Date(day).getDay()];
}