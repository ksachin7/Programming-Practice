// Map Object
const map1 = new Map();

map1.set('a', 1);
map1.set('b', 2);
map1.set('c', 3);

console.log(map1.get('a')); // output: 1

map1.set('a', 97);
console.log(map1.get('a')); // output: 97

console.log(map1.size);     // output: 3
map1.delete('b');
console.log(map1.size);     // output: 2

// creating new Map
const myMap = new Map([
    [1, "one"],
    [2, "two"],
    [3, "three"],
]);

// Iteration using for...of loop
const myMap1 = new Map();
myMap1.set("0", "foo");
myMap1.set(1, "bar");
myMap1.set({}, "baz");

for (const entry of myMap1) {
    console.log(entry);
}
// ["0", "foo"]
// [1, "bar"]
// [{}, "baz"]

for (const [key, value] of myMap1) {
    console.log(`${key}: ${value}`);
}
  // 0: foo
  // 1: bar
  // [Object]: baz


// Map.prototype[@@iterator]()
const map2 = new Map();

map2.set('0', 'foo');
map2.set(1, 'bar');

const iterator1 = map2[Symbol.iterator]();

for (const item of iterator1) {
  console.log(item);
}
// output: Array ["0", "foo"]
// output: Array [1, "bar"]

// Manually hand-rolling the iterator
const myMap3 = new Map();
myMap3.set("0", "foo");
myMap3.set(1, "bar");
myMap3.set({}, "baz");

const mapIter = myMap3[Symbol.iterator]();

console.log(mapIter.next().value); // ["0", "foo"]
console.log(mapIter.next().value); // [1, "bar"]
console.log(mapIter.next().value); // [Object, "baz"]

// Using delete()
const myMap4 = new Map();
myMap.set("bar", "foo");

console.log(myMap.delete("bar"));   // Returns true. Successfully removed.
console.log(myMap.has("bar"));      // Returns false. The "bar" element is no longer present.

// Using clear()
map1.clear();
console.log(map1.size); // output: 0

// Map.prototype.entries()
const map5 = new Map(); 
map5.set('0', 'foo');
map5.set(1, 'bar');

const iterator5 = map5.entries();

console.log(iterator5.next().value); // output: Array ["0", "foo"]
console.log(iterator5.next().value); // output: Array [1, "bar"]

// Map.prototype.forEach()
function logMapElements(value, key, map) {
    console.log(`m[${key}] = ${value}`);
  }
  
  new Map([
    ['foo', 3],
    ['bar', {}],
    ['baz', undefined],
  ]).forEach(logMapElements);
  
  // output: "m[foo] = 3"
  // output: "m[bar] = [object Object]"
  // output: "m[baz] = undefined"
  
// Map.prototype.keys()
const map6 = new Map();
map1.set('0', 'foo');
map1.set(1, 'bar');

const iterator6 = map6.keys();

console.log(iterator6.next().value);   // output: "0"
console.log(iterator6.next().value);   // output: 1


// Map.prototype.values()
const map7 = new Map();
map1.set('0', 'foo');
map1.set(1, 'bar');

const iterator7 = map1.values();
console.log(iterator1.next().value);    // output: "foo"  
console.log(iterator1.next().value);    // output: "bar"
