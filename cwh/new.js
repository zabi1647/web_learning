
function sum(a) {
    if (a == 1) {
        return 1;
    }
    return a * sum(a - 1);
}
let a = 5;
console.log(sum(a)) ;