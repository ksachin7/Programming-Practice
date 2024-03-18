"use strict";
//! variables:
var name, Name, $name, $$$, _name; // '$' is treated as letters in JS.
let x = 7;
let x; // will cause error: variables declared with let keyword can't be redeclared
const y = 2; // varibles with 'const' keyword must be assigned at the time of declaration
const y = 4; // will cause error: variables declared with 'let' keyword can't be redeclared or reassigned.

//? It does not define a constant value. It defines a constant reference to a value.
const cars = ["Saab", "Volvo", "BMW"];
cars[0] = "Toyota";
cars.push("Audi"); // array elements can be change
cars = ["ferrari", "Volvo", "BMW"]; // this will cause error

let x; // Now x is undefined
x = 5; // Now x is a Number
x = "John"; // Now x is a String

let x = 16 + 4 + "Volvo"; // 20Volvo: numbers will add up and
let x = "Volvo" + 16 + 4; // Volvo164: both 16 and 4 will be treated as strings

//! Bitwise operator:
let [n, k] = [600, 656];
console.log((k | (k - 1)) > n ? k - 2 : k - 1);
console.log(`k=${k} ${k.toString(2)} | (k-1)=${k - 1} ${(k - 1).toString(
  2
)} | (k-2)=${k - 2} ${(k - 2).toString(2)}
k | (k-1)= ${k | (k - 1)}`);

//! strings:
let txt = "It's alright";

// let txt1= "Hello
// world";  This will cause error.
let txt3 = "Hello \
  world"; //string break can be use by backslash.
//? The \ method is not the preferred method. It might not have universal support.
//? Some browsers do not allow spaces behind the \ character.

let txt4 = "Hello" + "world"; //A safer way to break up a string, is to use string addition:

let x = new String("John");
let y = new String("John");
//Comparing two JavaScript objects always returns false.

//! string methods:
//? All string methods return a new string. They don't modify the original string.
//Formally said: Strings are immutable: Strings cannot be changed, only replaced.

let txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
let length = txt.length; //returns length of the string

// slice() , substring() & substr() Method:
let str = "Apple, Banana, Kiwi";
let part = str.slice(7, 13); // Banana  //? slice(start, end)
let part1 = str.slice(-12, -6); // Banana
let part2 = str.slice(7); // Banana, Kiwi
let part3 = str.slice(-12); // Banana, Kiwi
let part4 = str.substring(7, 13); // Banana //? substring() can't take negative indexes.
let part5 = str.substr(7, 6); // Banana //? second parameter is length

// The replace() Method:
let text = "Please visit Microsoft and Microsoft!";
let newText = text.replace("Microsoft", "W3Schools"); // replaces only first match
let newText = text.replace(/Microsoft/g, "W3Schools"); // replaces all matched string
let newText = text.replace(/MICROSOFT/i, "W3Schools"); // case insensitive replace
//? replce is case sensitive

// Converting to Upper and Lower Case:
let text1 = "Hello World!";
let text2 = text1.toUpperCase();
let text2 = text1.toLowerCase();

// concat() method:
let text1 = "Hello";
let text2 = "World";
let text3 = text1.concat(" ", text2);

// trim(): it removes whitepaces
let text = "      Hello World!      ";
console.log(text.trim()); // Returns "Hello World!"

// padding:
let text = "5";
let padded = text.padStart(4, 0); //0005
let padded = text.padEnd(4, "!");

// property access, charAt() & charCodeAt():
let text = "HELLO WORLD";
let char = text.charAt(0); // H
let char = txt[0]; // H
let char = text.charCodeAt(0); // returns a UTF-16 code (an integer between 0 and 65535).

// Converting a String to an Array: split()
let text = "a,b,c,d,e,f";
const myArray = text.split(",");

let txt = "a|b|c";
let arr = txt.split("|"); // [a, b, c]

txt = "";
for (let i = 0; i < txt.length; i++) {
  txt += arr[i];
}
console.log(txt); //abc

//! JavaScript methods for searching strings:
let str = "Please locate where 'locate' occurs!";
str.indexOf("locate"); // returns first occurance
str.lastIndexOf("locate"); // returns last occurance
str.lastIndexOf("John"); // return -1
str.indexOf("locate", 15); // starting from index position 15
str.search("locate"); // can't take second start position

let text = "The rain in SPAIN stays mainly in the plain";
text.match(/ain/gi); //ain, AIN, ain, ain
text.includes("world"); // return false
text.startsWith("Hello", 6); // return false
text.endsWith("Doe"); // return false

//! Template literals:
let firstName = "John";
let lastName = "Doe";

let text = `Welcome ${firstName}, ${lastName}!`; //string interpolation.

//  ex:2
let price = 10;
let VAT = 0.25;

let total = `Total: ${(price * (1 + VAT)).toFixed(2)}`; //expression evaluation

//! Tagged string literals:
let str = "Tagged Literal";
let exp = 100;
function tag(literals, ...expressions) {
  return `Sachin${literals[1]}${expressions[1] * 10}${literals[2]}`;
}
let tl = tag`This ${str} is ${exp} times amazing. `;
console.log(tl);

//! Reversing String by using split() reverse() and join() methods:
var s = "Sachin";
console.log(s.split("").reverse().join(""));

//! Numbers:
// JS floating point numbers are always (64-bit) stored as double.
// Integers (numbers without a period or exponent notation) are accurate up to 15 digits.
let y = 9999999999999999; // y will be 10000000000000000

let x = "100";
let y = "10";
let z = x / y; // JavaScript will try to convert strings to numbers in all numeric operations:
let z = x - y; //90
let z = x + y; // 10010: concatnated as string

let x = 100 / "Apple";
isNaN(x);

let x = NaN;
let y = "5";
let z = x + y; // NaN5

let x = 0xff; // JavaScript interprets numeric constants as hexadecimal if they are preceded by 0x.

let myNumber = 32;
myNumber.toString(10); // decimal value
myNumber.toString(16); // hexadecimal value
myNumber.toString(8); // octal value
myNumber.toString(2); // binary value

//! type conversion:
String(123); // returns a string from a number literal 123
String(100 + 23); // returns a string from a number from an expression
(123).toString(); // 123
(100 + 23).toString(); // 123

//! Number methods:
let x = 123;
x.toString();
(123).toString();
(100 + 23).toString();

let x = 9.656;
x.toExponential(2); //9.66e+0
x.toFixed(2); //9.66
x.toPrecision(2); //9.7

(123).valueOf();
(100 + 23).valueOf();

parseInt("10.33"); // 10
parseInt("10 20 30"); // 10
parseInt("10 years"); // 10
parseInt("years 10"); // NaN

parseFloat("10"); // 10
parseFloat("10.33"); // 10.33
parseFloat("10 20 30"); // 10
parseFloat("10 years"); // 10
parseFloat("years 10"); // NaN

let x = Number.MAX_VALUE; //returns the largest number possible in JavaScript
let x = Number.MIN_VALUE; // returns the smallest number possible in JavaScript

//! math object:
//math properties:
Math.E; // returns Euler's number
Math.PI; // returns PI
Math.SQRT2; // returns the square root of 2
Math.SQRT1_2; // returns the square root of 1/2
Math.LN2; // returns the natural logarithm of 2
Math.LN10; // returns the natural logarithm of 10
Math.LOG2E; // returns base 2 logarithm of E
Math.LOG10E; // returns base 10 logarithm of E

//
Math.round(4.6); // 5: Returns x rounded to its nearest integer
Math.ceil(4.6); // 5: Returns x rounded up to its nearest integer
Math.floor(4.6); // 4: Returns x rounded down to its nearest integer
Math.trunc(4.6); // 4: Returns the integer part of x (new in ES6)
Math.sign(-4); // Math.sign(x) returns if x is negative, null or positive

Math.pow(8, 2); // 64
Math.sqrt(64); // 8
Math.abs(-4.7); // 4.7: returns the positive value
Math.sin((90 * Math.PI) / 180); // returns 1 (the sine of 90 degrees)
Math.cos((0 * Math.PI) / 180); // returns 1 (the cos of 0 degrees)
Math.min(0, 150, 30, 20, -8, -200);
Math.max(0, 150, 30, 20, -8, -200);
Math.log(10); // How many times must we multiply Math.E to get 10?
Math.log2(8); // How many times must we multiply 2 to get 8?
Math.log10(1000); // How many times must we multiply 10 to get 1000?

//! Math.random():
// Returns a random integer from 0 to 99:
Math.floor(Math.random() * 100);

// Returns a random integer from 1 to 10:
Math.floor(Math.random() * 10) + 1;

//? Random no. generator between min-max value:
function minmaxRandom(min, max) {
  return Math.floor(Math.random() * (max - min + 1) + min);
}
var f = minmaxRandom(2, 7);
console.log(f);

//! typeof:
typeof "John"; // Returns "string"
typeof 3.14; // Returns "number"
typeof NaN; // Returns "number"
typeof false; // Returns "boolean"
typeof [1, 2, 3, 4]; // Returns "object"
typeof { name: "John", age: 34 }; // Returns "object"
typeof new Date(); // Returns "object"
typeof function () {}; // Returns "function"
typeof myCar; // Returns "undefined" *
typeof null; // Returns "object"

//! Array:
const cars = ["Saab", "Volvo", "BMW"];
console.log(cars); // printing full array.

const fruits = ["Banana", "Orange", "Apple"];
fruits.push("Lemon"); // Adds a new element (Lemon) to fruits
fruits[fruits.length] = "Lemon"; // Adds "Lemon" to fruits

const fruits = ["Banana", "Orange", "Apple"];
fruits[6] = "Lemon"; // Creates undefined "holes" in fruits

const fruits = ["Banana", "Orange", "Apple"];
fruits instanceof Array;

//! Array methods:
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.toString(); // Banana,Orange,Apple,Mango
fruits.join(" * "); // Banana * Orange * Apple * Mango
fruits.pop(); // removes the last element from an array
fruits.push("Kiwi"); // adds a new element to an array (at the end)
fruits.shift(); // removes the first array element and "shifts" all other elements to a lower index.
fruits.unshift("Lemon"); // adds a new element to an array (at the beginning), and "unshifts" older elements
fruits.splice(2, 2, "Lemon", "Kiwi"); // The first parameter (2) defines the position where new elements should be added (spliced in). The second parameter (0) defines how many elements should be removed.
const citrus = fruits.slice(1); // slices out a piece of an array into a new array: [Orange,Apple,Mango]
const citrus = fruits.slice(1, 3); // slices out from 1st element to 3rd(3rd not included): Orange, Apple

fruits.sort(); // sorting the array alphabatically
fruits.reverse(); // eversing the array
// merging array:
const myGirls = ["Cecilie", "Lone"];
const myBoys = ["Emil", "Tobias", "Linus"];
const myChildren = myGirls.concat(myBoys); // [Cecilie,Lone,Emil,Tobias,Linus]

//? sorting Numbers:
var nums = [0, 1, 2, 5, 10, 11, 100, 20];
// console.log(nums.sort());  // sorting array as string so 2 >100
console.log(nums.sort((a, b) => a - b)); // sorting in ascending order
console.log(nums.sort((a, b) => b - a)); // sorting in descending order

function arrayMin(arr) {
  return Math.min.apply(null, arr); // works similar as Math.min(0, 1, 2, 5, 10, 11, 100, 20)
}

//* map(): It creates a new array by performing a function on each array element.
const numbers1 = [45, 4, 9, 16, 25];
const numbers2 = numbers1.map(myFunction);

function myFunction(value, index, array) {
  return value * 2;
}
console.log(numbers2);

//*  filter(): method creates a new array with array elements that passes a test.
const numbers = [45, 4, 9, 16, 25];
const over18 = numbers.filter(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}

//* reduce(): method runs a function on each array element to produce (reduce it to) a single value.
const numbers = [45, 4, 9, 16, 25];
let sum = numbers.reduce(myFunction);

function myFunction(total, value, index, array) {
  return total + value;
}
//* reduce() can accept initial value:
const numbers = [45, 4, 9, 16, 25];
let sum = numbers.reduce(myFunction, 100);

function myFunction(total, value) {
  return total + value;
}
//*  reduceRight(): works from right-to-left in the array. See also reduce().
const numbers = [45, 4, 9, 16, 25];
let sum = numbers1.reduceRight(myFunction);

function myFunction(total, value) {
  return total + value;
}

//* every(): method check if all array values pass a test.
//* some(): method check if some array values pass a test.
const numbers = [45, 4, 9, 16, 25];
let allOver18 = numbers.every(myFunction);
let someOver18 = numbers.some(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}

//*  indexOf(): method searches an array for an element value and returns its position.
//*  Array.lastIndexOf(): is the same as Array.indexOf(), but returns the position of the last occurrence of the specified element.
const fruits = ["Apple", "Orange", "Apple", "Mango"];
let position = fruits.indexOf("Apple") + 1; // 1
let position = fruits.lastIndexOf("Apple") + 1; // 3

//*  Array.includes(): This allows us to check if an element is present in an array (including NaN, unlike indexOf).
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.includes("Mango"); // is true

//*  find(): method returns the value of the first array element that passes a test function.
//*  findIndex(): method returns the index of the first array element that passes a test function.
const numbers = [4, 9, 16, 25, 29];
let first = numbers.find(myFunction);
let first = numbers.findIndex(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}

//*  The Array.from() method returns an Array object from any object with a length property or any iterable object.
Array.from("ABCDEFG"); // Returns [A,B,C,D,E,F,G]

//! For loop:
//* forEach():
const numbers = [45, 4, 9, 16, 25];
numbers.forEach((x, i, a) => {
  console.log(`${i}: ${x}`);
});

//* for in: statement loops through the properties of an Object:
const person = { fname: "John", lname: "Doe", age: 25 };
let text = "";
for (let x in person) {
  text += person[x] + " ";
}
console.log(text);
// Ex-2
const numbers = [45, 4, 9, 16, 25];

let txt = "";
for (let x in numbers) {
  txt += numbers[x];
}

//* for of:
let language = "JavaScript";
let text = "";
for (let x of language) {
  text += x; // notice the diffrence here
}
//!  sets: Set is a collection of unique values.
// Create a Set
const letters = new Set(["a", "b", "c"]);
letters.add("d");
let txt = "";
letters.forEach((value) => (txt += value + " "));
console.log(txt);
// List all Elements
for (const x of letters.values()) {
  txt += x;
}
console.log(txt); // abc

//! Map:
//A Map holds key-value pairs where the keys can be any datatype.
// A Map remembers the original insertion order of the keys.
// Create a Map
const fruits = new Map([
  ["apples", 500],
  ["bananas", 300],
  ["oranges", 200],
]);
fruits.set("Grapes", 100);
fruits.set("apples", 200);
fruits.get("apples"); // Returns 500
fruits.size; //returns the size of the map.
fruits.delete("apples");
fruits.has("apples");

// List all entries with forEach loop
let text = "";
fruits.forEach(function (value, key) {
  text += key + " = " + value + " ";
});
// List all entries with entries()
let text = "";
for (const x of fruits.entries()) {
  text += x;
}

//! Date:
const days = [
  "Sunday",
  "Monday",
  "Tuesday",
  "Wednesday",
  "Thursday",
  "Friday",
  "Saturday",
];
const d = new Date();
let day = days[d.getDay()];

d.getSeconds();
d.getDate();
d.getFullYear();
d.setFullYear(2020, 11, 3);

//! Errors: try, catch, throw, finally
// The try: statement allows you to define a block of code to be tested for errors while it is being executed.
// The catch: statement allows you to define a block of code to be executed, if an error occurs in the try block.
// The finally statement lets you execute code, after try and catch, regardless of the result.

try {
  aalert("error!");
} catch (err) {
  console.log(err.message);
}
throw 300;

// finally:
function myFunction() {
  const message = document.getElementById("p01");
  message.innerHTML = "";
  let x = document.getElementById("demo").value;

  try {
    if (x == "") throw "is empty";
    if (isNaN(x)) throw "is not a number";
    x = Number(x);
    if (x > 10) throw "is too high";
    if (x < 5) throw "is too low";
  } catch (err) {
    message.innerHTML = "Error: " + err + ".";
  } finally {
    document.getElementById("demo").value = "";
  }
}

// TypeError:
let num = 1;
try {
  num.toUpperCase(); // You cannot convert a number to upper case
} catch (err) {
  document.getElementById("demo").innerHTML = err.name;
}

//! RegExp:
// A regular expression is a sequence of characters that forms a search pattern.
/e/.test("The best things in life are free!");
// It searches a string for a pattern, and returns true or false, depending on the result.
/e/.exec("The best things in life are free!");
// It searches a string for a specified pattern, and returns the found text as an object.
let e = "abdbfia";
function regExp() {
  let re = new RegExp(/^([aeiou]).+\1$/);
  return re;
}
console.log(regExp().test(e));

//! This Keyword:
// It has different values depending on where it is used:
// In a method, this refers to the owner object.
// Alone, this refers to the global object.
// In a function, this refers to the global object.
// In a function, in strict mode, this is undefined.
// In an event, this refers to the element that received the event.
// Methods like call(), and apply() can refer this to any object.
const person = {
  firstName: "John",
  lastName: "Doe",
  id: 5566,
  myFunction: function () {
    return this; // [object Object]
  },
};

//! Arrow Function:
hello = (val) => "Hello " + val;

//*----------------------------------------------------------------------------------*//
//! Shift & Unshift methods:
var array = [["abc", 4], 6, "mvc"];
array.shift();
console.log(array);
array.unshift(7);
console.log(array);

//! Factorial:
function factorial(n) {
  if (n == 0) {
    return 1;
  } else {
    return n * factorial(n - 1);
  }
}

//! Prototype:
class Rectangle {
  constructor(w, h) {
    this.w = w;
    this.h = h;
  }
}

//? Write code that adds an 'area' method to the Rectangle class' prototype
Rectangle.prototype.area = function () {
  return this.w * this.h;
};

//! Create a Square class that inherits from Rectangle and implement its class constructor
class Square extends Rectangle {
  constructor(w, h) {
    super(w, h);
    this.h = w;
  }
}
//! incrementing array elements:
const myArray = [1, 2, 3, 4];
myArray.forEach((item, index) => {
  myArray[index] = ++item;
  console.log(`${index}: ${item}`);
});
console.log(myArray);

//! two's sum leetcode:
var nums = [2, 7, 11, 15];
var target = 9;
let a = [];

var twoSum = function (nums, target) {
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if ([i] + [j] == target) {
        a.push(i);
      }
    }
  }
  return a;
};
console.log(twoSum(nums, target));
