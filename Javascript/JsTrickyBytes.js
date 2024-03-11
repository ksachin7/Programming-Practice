// hoisting
(function hoisting() {
    name = 'abc';
    num = 21;
    console.log(name);
    console.log(num);

    var name;
    var num;
}())

// Block-scoped let and const variables
{
    console.log(myVariable);    // Throws a ReferenceError: Cannot access 'myVariable' before initialization(TDZ)
    let myVariable = 'Hello, block-scoped hoisting with let!';

    console.log(myConstant);    // Throws a ReferenceError: Cannot access 'myConstant' before initialization(TDZ)
    const myConstant = 'Hello, block-scoped hoisting with const!';
}

// Hoisting with Functions
sayHello(); // Outputs: "Hello!"

function sayHello() {
    console.log("Hello!");
}

// Function Expression and Hoisting
sayHello(); // Second

var sayHello = function () {
    console.log("first!");
};
sayHello();     // First

function sayHello() {
    console.log("second!");
};
sayHello();     // First

/*
In JavaScript, variable declarations (using var, let, or const) and function declarations are hoisted to the top of their containing scope. 
This means that regardless of where variables and functions are declared within their scope, they are effectively "moved" to the top, conceptually.

However, it's important to note that only the declarations are hoisted, not the initializations or assignments. 
Variable assignments and function expressions are not hoisted.
*/

// what will be the output?
for (let i = 0; i < 10; i++) {
    setTimeout(function () {
        console.log('The number is: ' + i);
    })
}

for (var i = 0; i <= 10; i++) {
    setTimeout(function () {
        console.log('The number is: ' + i);
    })
}
console.log(i);

// with IIFE
var variable = 10;
(() => {
    console.log(variable);

    variable = 20;
    console.log(variable);
})()
console.log(variable);
variable = 30;

// IIFE-example-2
for (var i = 0; i < 10; i++) {
    (function (num) {
        setTimeout(function () {
            console.log('The number is: ' + num);
        }, 1000);
    })(i);
}

// what will be the output()
for (var i = 0; i < 10; i++) {
    setTimeout(() => { console.log('The number is: ' + i) }, 0);
}
// In this code snippet, you have a loop that runs 10 times, and for each iteration, it schedules a setTimeout function to be executed after 0 milliseconds (effectively immediately). 
// However, due to the asynchronous nature of JavaScript and the event loop, by the time the setTimeout function is executed, the loop would have completed, and the value of i would be 10 for all the scheduled functions.
// In each log statement, the value of i is 10 because that is the final value of i after the loop has completed. 
// The closure inside setTimeout captures the reference to the variable i, not its value at the time the function is created. 
// If you want each setTimeout function to log the correct value of i, you can use a block-scoped variable using let instead of var.

// what will be the output
(() => {
    let x = y = 10;

})();
console.log(typeof x);  // undefind: x has functional scope
console.log(typeof y);  // number : y has global scope

// strings
let String = "abc";
let String1 = String;
console.log(String1)

String = "xyz"
console.log(String1);

(function jsArithmaticOperations() {
    console.log(1 + '2')
    console.log('5' - 3)
    console.log(1 + '2' + 3)
    console.log(1 * '2')
    console.log(1 / '2')
    console.log('2' / 2)
    console.log('2' ** 2)
    console.log(Math.sqrt('2'))
    console.log(eval("1*10+5**2/5-3"))
    console.log(typeof (+'10'));    // + converts string into number
    console.log(+'10++');           // NaN but type will be number
    console.log(+'10shavhk');       // NaN but type will be number
}());

// Numbers
(function incrementOps() {
    let number = 0;
    console.log(number++)
    console.log(++number)
    console.log(number)
    console.log(number++)
    console.log(number++)
}());

// number methods
let xy = 123;
console.log(xy.toString(),
    (123).toString(),
    (100 + 23).toString()
);

let x = 9.656;
console.log(
    x.toExponential(2), // 9.66e+0
    x.toFixed(2), // 9.66
    x.toPrecision(2)
);


// Check if a number is an integer using various methods. Here are a few ways:
let num = 42;

// The `Number.isInteger()` method was introduced in ES6 and directly checks if a value is an integer:
(Number.isInteger(num)) ? console.log(`${num} is an integer.`) : console.log(`${num} is not an integer.`);

// You can also use the modulus operator to check if the remainder is 0 when dividing the number by 1:
(num % 1 === 0) ? console.log(`${num} is an integer.`) : console.log(`${num} is not an integer.`);

// Another common way to check if a number is an integer is by comparing it to its `Math.floor()` value:
let num1 = 42.5;
if (num1 === Math.floor(num1)) {
    console.log(`${num1} is an integer.`);
} else {
    console.log(`${num1} is not an integer.`);
}


// Array
// Empty an array
let myArray = [1, 2, 3, 4, 5];

// Setting the length property of the array to 0 effectively empties the array.
myArray.length = 0;
console.log(myArray);   // Output: []

// Assigning a new empty array to the variable also empties the existing array.
myArray = [];
console.log(myArray);   // Output: []

// Duplicate/Copy an array 
let originalArray = [1, 2, 3, 4, 5];

// Using the Spread Operator (...)
let duplicateArray = [...originalArray];

// Using the slice() method
let duplicateArraySlice = originalArray.slice();

// Using Array.from()
let duplicateArrayFrom = Array.from(originalArray);

// Using concat()
let duplicateArrayConcat = originalArray.concat();

console.log(duplicateArray);
console.log(duplicateArraySlice);
console.log(duplicateArrayFrom);
console.log(duplicateArrayConcat);

// remove duplicate elements from an array
const arrayWithDuplicates = [1, 2, 2, 3, 4, 4, 5];

// Using Set
const uniqueArray = [...new Set(arrayWithDuplicates)];
console.log(uniqueArray);

// Using Filter
const uniqueArray2 = arrayWithDuplicates.filter((value, index, self) => self.indexOf(value) === index);
console.log(uniqueArray2);

// Using Reduce
const uniqueArray3 = arrayWithDuplicates.reduce((acc, value) => {
    if (!acc.includes(value)) {
        acc.push(value);
    }
    return acc;
}, []);
console.log(uniqueArray3);

// Using `indexOf` and `forEach`
const uniqueArray4 = [];
arrayWithDuplicates.forEach((value) => {
    if (uniqueArray4.indexOf(value) === -1) {
        uniqueArray4.push(value);
    }
});
console.log(uniqueArray4);

// array problem-1
const arr = [1, 2, 3];
arr[6] = 7;
console.log(arr);
arr[7] = arr;
console.log(arr);   // <ref *1> [ 1, 2, 3, <3 empty items>, 7, [Circular *1] ]

// array problem-2
let data = [1, 2, 3].map((num) => {
    if (typeof num == 'number') return;
    return num * 2;
})
console.log(data);  // [ undefined, undefined, undefined ]

// objects
const obj = { a: "one", b: "two", a: "repeat" }
console.log(obj);

// Object problem-2
var fullName = "Sachin Kumar";

var object = {
    fullName: "Hacked fullname!",
    prop: {
        fullName: "prop fullname",
        getFullName: function () {
            return this.fullName;
        }
    },
    getFullName: function () {
        return this.fullName;
    },
    getFullNameV2: () => this.fullName,
    getFullNameV3: (function () {
        return this.fullName;
    })()
};
console.log(object.getFullName());      // Hacked fullname!
console.log(object.prop.getFullName()); // prop fullname
console.log(object.getFullNameV2());    // undefined(arrow functions do not have their own this context; they inherit it from the surrounding scope. In this case, this.fullName refers to the global fullName variable. It is undefined because this.fullName is not defined in the current scope.)
// console.log(object.getFullNameV3()); // TypeError: object.getFullNameV3 is not a function, it's the result of the IIFE.
console.log(object.getFullName());      // Hacked fullname!

// obj reference
fruits = { name: "banana" }
fruits1 = fruits;
console.log(fruits1);
fruits1.name = "abc";
console.log(fruits);


// map vs forEach
const numbers = [1, 2, 3, 4];

// Map(): it creates a new array and also modifies each elements
const doubledNumbers = numbers.map((num) => {
    return num * 2; // Create a new array with modified values
});
console.log(numbers);        // Output: [1, 2, 3, 4];
console.log(doubledNumbers); // Output: [2, 4, 6, 8]

// forEach(): it doesn't create a new array and also doesn't modify elements
const doubledNumbersForEach = numbers.forEach((num) => num * 2);
console.log(numbers);               // Output: [1, 2, 3, 4];
console.log(doubledNumbersForEach); // Output: undefined

// Closures
function init() {
    var name = "Mozilla"; // name is a local variable created by init
    function displayName() {
        // displayName() is the inner function, that forms the closure
        console.log(name); // use variable declared in the parent function
    }
    displayName();
}
init();

// boolean
console.log(!true - true);  // (0 - 1 = -1)

// Call
const Sachin = {
    name: "Sachin Kumar",
    sayName: function () {
        console.log(this.name);
    }
}
const John = {
    name: "John Doe",
    sayName: function () {
        console.log(this.name);
    }
}
John.sayName.call(Sachin);
// John.sayName.call(Sachin); invokes the sayName method of the John object but with the this context set to the Sachin object.
// The call method allows you to explicitly set the value of this within a function.

const sayFunc = John.sayName.bind(Sachin);
sayFunc();  // bind returns a function

// Bind
const someone = {
    name: "Sachin Kumar",
    sayName: function () {
        console.log(this.name);
    }
}
setTimeout(someone.sayName, 0)  // a method is passed directly like this, the context (this) may not be what you expect. In this case, it might log undefined or an error, depending on the JavaScript environment. 
setTimeout(someone.sayName.bind(someone), 0)    // Using bind ensures that the sayName method is called in the context of the someone object.

// delete
const obj1 = Object.create({
    height: 30,
});
console.log(obj1.height);   // 30
delete obj1.height;
console.log(obj1.height);   // 30
// obj1 is created using Object.create(), and its prototype is set to an object with a property height set to 30.
// delete obj1.height; attempts to delete the height property from obj1, the property is not actually deleted from the prototype. Therefore, it still logs 30 to the console.

// Session

// How long it will be accessible?
sessionStorage.setItem('secret_key', '123');

