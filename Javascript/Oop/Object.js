// Creating an object using an object literal
const person = {
    firstName: "John",
    lastName: "Doe",
    greet: function () {
      console.log(`Hello, ${this.firstName} ${this.lastName}!`);
    },
  };
  
  // Accessing object properties and methods
  console.log(person.firstName);      // John
  person.greet();         // Hello, John Doe!
