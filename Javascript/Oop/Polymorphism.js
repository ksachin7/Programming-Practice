class Shape {
    constructor() {
        // Empty constructor for the base class
    }

    area() {
        // This method will be overridden by derived classes
        return 0;
    }

    // method overloading isn't directly supported like in some other programming languages.
}

class Circle extends Shape {
    constructor(radius) {
        super();
        this.radius = radius;
    }

    // overriding area method
    area() {
        return Math.PI * this.radius ** 2;
    }
}

class Square extends Shape {
    constructor(sideLength) {
        super();
        this.sideLength = sideLength;
    }

    // overriding area method
    area() {
        return this.sideLength ** 2;
    }
}

// Create instances of different shapes
const circle = new Circle(5);
const square = new Square(4);

// Call the area method on each shape
console.log("Circle area:", circle.area());      // Output: Circle area: 78.53981633974483
console.log("Square area:", square.area());      // Output: Square area: 16

// Polymorphic behavior: Same method, different implementation based on the actual object type
