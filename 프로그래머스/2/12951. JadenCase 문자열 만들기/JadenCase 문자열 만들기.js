function solution(s) {
    var answer = '';
    let arr = s.split(' ');
    
    for (let i = 0; i < arr.length; i++) {
        arr[i] = arr[i].charAt(0).toUpperCase() + arr[i].slice(1).toLowerCase();
    }
    
    answer = arr.join(' ');
    return answer;
}
