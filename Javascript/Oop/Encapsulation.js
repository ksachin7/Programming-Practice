// Encapsulation involves bundling data and methods within an object, and controlling access to them. 
// In JavaScript, this is typically achieved through closures.
class Counter {
    constructor() {
        let count = 0;

        this.increment = function () {
            count++;
        };

        this.getCount = function () {
            return count;
        };
    }
}

const countr = new Counter();
countr.increment();
console.log(countr.getCount());


// Another example
function createCounter() {
    // Private variable
    let count = 0;

    // Private method
    function increment() {
        count++;
        console.log('Count:', count);
    }

    // Public interface
    return {
        increment: increment
    };
}

// Usage
const counter = createCounter();
counter.increment();    // Output: Count: 1
counter.increment();    // Output: Count: 2
