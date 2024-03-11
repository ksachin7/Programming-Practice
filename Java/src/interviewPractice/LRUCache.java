package interviewPractice;
/**
 * Problem Statement:
 * Design an LRU (Least Recently Used) cache data structure to store key-value pairs.
 * The cache should have a fixed capacity, and if the cache exceeds this
 * capacity, it should remove the least recently used item before adding a new item.
 *
 * Java LRU Cache:
 * Create a class LRUCache in Java with the following methods:
 * public LRUCache(int capacity): Initializes the LRU cache with a given capacity.
 * public int get(int key): Retrieves the value associated with the given key
 * from the cache. If the key is not present in the cache, return -1.
 * public void put(int key, int value): Inserts the given key and value into the
 * cache. If the cache is already at its capacity, remove the least recently
 * used item before adding the new key-value pair.
 *
 * Note:
 * The get() operation should update the order of accessed items, moving the
 * accessed item to the front of the cache to represent that it is the most recently used.
 * When using a hashmap to store the key-value pairs in both JavaScript and Java
 * implementations, consider using a LinkedHashMap in Java to maintain the insertion order and simplify LRU cache management.
 * Ensure your implementations are efficient and handle edge cases properly.
 * Test your implementations with various scenarios to verify the correctness of
 * the LRU cache behavior in both JavaScript and Java.
 **/
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache(int capacity) {
        // Set accessOrder to true to maintain access order (LRU behavior)
        super(capacity, 0.75f, true);
        // The super(capacity, 0.75f, true) line calls the constructor of the superclass
        // (LinkedHashMap) with the provided capacity, load factor (0.75f), and access
        // order set to true. Setting the access order to true ensures that elements are
        // maintained in the order they were accessed, allowing us to achieve LRU behavior.

        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }
    // It utilizes the super.put method, inherited from LinkedHashMap, to add the
    // key-value pair to the cache. If the key already exists, it will update the
    // value for the existing key.

    public void printCache(){
        for(Map.Entry<Integer, Integer> entry: entrySet()){
            int key= entry.getKey();
            int value= entry.getValue();
            System.out.println(key+": "+value);
        }
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}

// Test the Java implementation
class LRUMain {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.printCache();
        System.out.println(cache.get(1)); // Output: 1

        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2)); // Output: -1 (key 2 is evicted)

        cache.put(4, 4); // evicts key 1
        System.out.println(cache.get(1)); // Output: -1 (key 1 is evicted)

        System.out.println(cache.get(3)); // Output: 3
        System.out.println(cache.get(4)); // Output: 4
    }
}
