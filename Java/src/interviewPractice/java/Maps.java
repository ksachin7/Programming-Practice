package interviewPractice.java;

import java.util.*;

class Maps {

    public static void main(String[] args) {
//        Map<Object, Object> map=new HashMap<>();
        Map<Integer, String> map = new HashMap<Integer, String>();

        //Adding elements to map
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Jai"));
        map.remove(6);
        map.putIfAbsent(6, "xyz");
        map.replace(5, "Shubham");
        System.out.println(map);

        // Traversing Map with for-each loop
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Traversing Map
        Set<Map.Entry<Integer, String>> set = map.entrySet();//Converting to Set so that we can traverse

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()

                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))

                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}
