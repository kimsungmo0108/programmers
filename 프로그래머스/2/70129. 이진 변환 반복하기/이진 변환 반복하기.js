function solution(s) {
    let count = 0;
    let removedZeros = 0;
    
    while (s !== "1") {
        let zeroCount = (s.match(/0/g) || []).length;
        removedZeros += zeroCount;
        
        s = s.replace(/0/g, "");
        s = s.length.toString(2);
        
        count++;
    }
    
    return [count, removedZeros];
}