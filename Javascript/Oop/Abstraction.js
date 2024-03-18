// es6 class with private data & methods
class Counter {
    #count = 0; // Private field

    // Private method
    #increment() { 
        this.#count++;
    }

    // Public method to access the private field
    getCount() { 
        return this.#count;
    }

    // Public method to increment the private method
    incrementCount() { 
        this.#increment();
    }
}

const counter = new Counter();
console.log(counter.getCount()); // Output: 0
counter.incrementCount();
console.log(counter.getCount()); // Output: 1
