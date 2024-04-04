// Example-1
// const originalArray = [1, 2, 3, {a: 'a', b: 'b', c: [4, 5,]}, [0, 1]];
const originalArray = [1, 2, 3, [0, 1, [5, 6]]];
const shallowCopy = originalArray.slice();

originalArray[0] = 10;
originalArray[3][1]= 7;
console.log(originalArray);     // Output: [ 10, 2, 3, [ 0, 7, [ 5, 6 ] ] ]
console.log(shallowCopy);       // Output: [ 1, 2, 3, [ 0, 7, [ 5, 6 ] ] ]
console.log(...originalArray);  // Output: 10 2 3 [ 0, 7, [ 5, 6 ] ]
