// JSON.stringify method
let obj = {
    func: function () {
        console.log('Original function');
    },
    date: new Date(),
    nestedObj: { a: 1 }
};

let copiedObj = JSON.parse(JSON.stringify(obj));

console.log(copiedObj);             // Output: { date: '2022-03-14T12:00:00.000Z', nestedObj: { a: 1 } }
console.log(typeof copiedObj.func); // Output: undefined

obj.nestedObj.a = 7;
console.log(obj.nestedObj.a);       // 7
console.log(copiedObj);             // { date: '2024-03-26T09:22:48.913Z', nestedObj: { a: 1 } }

// deep copy method-1
function deepCopyObject(obj) {
    // Check if the input is a primitive value or if it has been already cloned
    if (obj === null || typeof obj !== 'object' || 'isActiveClone' in obj)
        return obj;

    // Handle Date objects separately to create a new instance
    if (obj instanceof Date)
        var temp = new obj.constructor(); // Or new Date(obj);
    // Handle RegExp objects separately to create a new instance
    else if (obj instanceof RegExp)
        var temp = new RegExp(obj);
    // For all other objects, create a new instance using the constructor
    else
        var temp = obj.constructor();

    // Iterate over the object's properties
    for (var key in obj) {
        // Check if the property belongs to the object itself (not inherited)
        if (Object.prototype.hasOwnProperty.call(obj, key)) {

            // Mark the current object to prevent circular references
            obj['isActiveClone'] = null;

            // Recursively deep copy the property value
            temp[key] = deepCopyObject(obj[key]);
            
            // Remove the mark after copying
            delete obj['isActiveClone'];
        }
    }

    // Return the deep copied object
    return temp;
}

const originalObj = {
    a: 1, b: {
        c: 2, d: {
            e: function() {
                console.log('Original function');
            },
        }, f: [0, 1], g: /abc/
    }
};
const deepCopyObj = deepCopyObject(originalObj);
originalObj.b.c = 5;
originalObj.b.f[0] = 1;

console.log(originalObj);   // { a: 1, b: { c: 5, d: { e: [Function: e] }, f: [ 1, 1 ], g: /abc/ } }
console.log(deepCopyObj);   // { a: 1, b: { c: 2, d: { e: [Function: e] }, f: [ 0, 1 ], g: /abc/ } }

// deep-copy method-2
function deepCopy(obj, visited = new WeakMap()) {
    // Handle non-object types and null
    if (typeof obj !== 'object' || obj === null) {
        return obj;
    }

    // Handle circular references
    if (visited.has(obj)) {
        return visited.get(obj);
    }

    // Handle functions
    if (obj instanceof Function) {
        return obj;
    }

    // Handle RegExp objects
    if (obj instanceof RegExp) {
        return new RegExp(obj);
    }

    let newObj = Array.isArray(obj) ? [] : Object.create(Object.getPrototypeOf(obj));

    // Register the object in the visited map to handle circular references
    visited.set(obj, newObj);

    for (let key in obj) {
        newObj[key] = deepCopy(obj[key], visited);
    }

    return newObj;
}

// Test with an example object
let originalObject = {
    a: 1,
    b: {
        c: [2, 3],
        d: function () {
            console.log('Original function');
        },
        e: /abc/
    }
};
originalObject.b.f = originalObject;    // Circular reference

let copiedObject = deepCopy(originalObject);

console.log(copiedObject);