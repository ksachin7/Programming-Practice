package interviewPractice;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUMRU {

    public static class LRUCache<K, V> extends LinkedHashMap<K, V> {
        private int capacity;

        public LRUCache(int capacity) {
            // Set the access order to true, so that LinkedHashMap maintains the access order
            // instead of the insertion order.
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            // Override this method to control the removal of the eldest entry when the cache
            // reaches its capacity. In LRU, we remove the least recently used entry (oldest entry).
            // In MRU, we remove the most recently used entry (newest entry).
            return size() > capacity;
        }
    }

    public static class MRUCache<K, V> extends LinkedHashMap<K, V> {
        private int capacity;

        public MRUCache(int capacity) {
            // Set the access order to true, so that LinkedHashMap maintains the access order
            // instead of the insertion order.
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            // Override this method to control the removal of the eldest entry when the cache
            // reaches its capacity. In MRU, we remove the most recently used entry (newest entry).
            // In LRU, we remove the least recently used entry (oldest entry).
            return size() > capacity;
        }
    }

    public static void main(String[] args) {
        int cacheCapacity = 3;

        // LRU Cache example
        LRUCache<String, Integer> lruCache = new LRUCache<>(cacheCapacity);
        lruCache.put("A", 1);
        lruCache.put("B", 2);
        lruCache.put("C", 3);

        System.out.println("LRU Cache: " + lruCache); // Output: LRU Cache: {A=1, B=2, C=3}

        lruCache.get("A"); // Accessing "A" to make it the most recently used item.

        lruCache.put("D", 4); // Adding "D", the least recently used item "B" will be evicted.

        System.out.println("LRU Cache after eviction: " + lruCache); // Output: LRU Cache after eviction: {A=1, C=3, D=4}


        // MRU Cache example
        MRUCache<String, Integer> mruCache = new MRUCache<>(cacheCapacity);
        mruCache.put("A", 1);
        mruCache.put("B", 2);
        mruCache.put("C", 3);

        System.out.println("MRU Cache: " + mruCache); // Output: MRU Cache: {A=1, B=2, C=3}

        mruCache.get("A"); // Accessing "A" to make it the most recently used item.

        mruCache.put("D", 4); // Adding "D", the most recently used item "A" will be evicted.

        System.out.println("MRU Cache after eviction: " + mruCache); // Output: MRU Cache after eviction: {B=2, C=3, D=4}
    }
}
