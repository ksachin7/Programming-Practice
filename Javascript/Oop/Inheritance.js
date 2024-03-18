// Hierarchical Inheritance
class Animal {
    constructor(name) {
        this.name = name;
    }

    makeSound() {
        console.log("Some generic sound");
    }
}

class Dog extends Animal {
    constructor(name) {
        super(name);    // Call the parent constructor
    }

    bark() {
        console.log(this.name + " barks!");
    }
}

const myDog = new Dog("Buddy");
myDog.makeSound();
myDog.bark();


class Cat extends Animal {
    constructor(name) {
        super(name);
    }

    meow() {
        console.log(this.name + " meows!");
    }
}

const myCat = new Cat('Tom');
myCat.makeSound();
myCat.meow();