// Problem Statement:

// Design an LRU (Least Recently Used) cache data structure to store key-value pairs. 
// The cache should have a fixed capacity, and if the cache exceeds this capacity, 
// it should remove the least recently used item before adding a new item.

// JavaScript LRU Cache:
// Create a class LRUCache in JavaScript with the following methods:
// constructor(capacity): Initializes the LRU cache with a given capacity.
// get(key): Retrieves the value associated with the given key from the cache. If the key is not present in the cache, return -1.
// put(key, value): Inserts the given key and value into the cache. If the cache is already at its capacity, remove the least recently used item before adding the new key-value pair.

class LRUCache {
    constructor(capacity) {
        this.capacity = capacity;
        this.cache = new Map();
    }

    get(key) {
        if (this.cache.has(key)) {
            const value = this.cache.get(key);
            this.cache.delete(key); // Move accessed item to the front
            this.cache.set(key, value);
            return value;
        }
        return -1;
    }

    put(key, value) {
        if (this.cache.has(key)) {
            this.cache.delete(key); // If key exists, move to front (to update as most recently used)
        } else if (this.cache.size >= this.capacity) {
            const leastRecentlyUsedKey = this.cache.keys().next().value;
            this.cache.delete(leastRecentlyUsedKey); // Remove least recently used item (first item in the map)
        }

        this.cache.set(key, value); // Add new key-value pair
    }
}

// Test the JavaScript implementation
const cache = new LRUCache(2);
cache.put(1, 1);
cache.put(2, 2);
console.log(cache.get(1)); // Output: 1
cache.put(3, 3); // evicts key 2
console.log(cache.get(2)); // Output: -1 (key 2 is evicted)
cache.put(4, 4); // evicts key 1
console.log(cache.get(1)); // Output: -1 (key 1 is evicted)
console.log(cache.get(3)); // Output: 3
console.log(cache.get(4)); // Output: 4
