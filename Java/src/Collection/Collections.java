package Collection;

import java.util.*;

public class Collections {

 /***
  ** Collection methods **
  *  int size()
  *  boolean isEmpty()
  *  boolean contains(Object element)
  *  boolean containsAll(Collection c)
  *  boolean add(Object element)
  *  boolean addAll(Collection c)
  *  boolean remove(Object element)
  *  boolean removeAll(Collection c)
  *  void clear()
  *  Object[] toArray()
  *  Iterator iterator()
  *  default Spliterator<E> spliterator()
  *  public int hashCode()
  *  public boolean equals(Object element)

  Set, List, Map, SortedSet, SortedMap, HashSet, TreeSet, ArrayList, LinkedList, Vector, Collections, Arrays, AbstractCollection
***/
     public static void main(String[] args) {

//          --------------- List ----------------
         System.out.println("----- Creating List and adding elements -----");
//         Serialization in Java is a mechanism of writing the state of an object into a byte-stream.
//         It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
//         List<java.io.Serializable> al= new ArrayList<>();
//         ArrayList al= new ArrayList();
//         List al= new LinkedList();
         Vector al= new Vector();
         al.add(5);
         al.add("String");
         al.add(5.3);
         al.add(true);
         al.set(3, "abcd");

         System.out.println("size: "+ al.size());
         System.out.println("contains(\"String\"): "+al.contains("String"));
         System.out.println("get(1): "+al.get(1));
         System.out.println("indexOf(5.3)"+al.indexOf(5.3));
         System.out.println("spliterator: "+al.spliterator());
         System.out.println("hashcode: "+al.hashCode());
         System.out.println("sublist(1, 3): "+al.subList(1, 3));
         System.out.println("getClass: "+al.getClass());
//         al.clear();

         // printing the ArrayList
         System.out.println(al);

         // The forEach() method is a new feature, introduced in Java 8.
         al.forEach(e->{
             System.out.println(e);
         });

         // printing with method reference
         al.forEach(System.out::println);

         System.out.println("---- Iterating Forward with iterator ----");
         Iterator itr= al.iterator();
         while (itr.hasNext())
             System.out.println(itr.next());

         System.out.println("---- Iterating Backward with ListIterator ----");
         ListIterator litr= al.listIterator(al.size());
         while (litr.hasPrevious())
             System.out.println(litr.previousIndex()+": "+litr.previous());

         // --------------- Stack ----------------
         System.out.println("----- Creating Stack and adding elements -----");
         Stack<String> stack = new Stack<String>();
         stack.push("Aniket");
         stack.push("Garvit");
         stack.push("Amit");
         stack.push("Aman");
         stack.push("Garima");
         System.out.println(stack);
         stack.pop();
         System.out.println(stack);

         stack.add(3,"Shubham");
         ListIterator<String> itr1=stack.listIterator();
         while(itr1.hasNext()){
             System.out.println(itr1.next());
         }
         System.out.println();
         while (itr1.hasPrevious())
             System.out.println(itr1.previous());



         System.out.println("----- Creating Queue and adding elements -----");
//         PriorityQueue<String> queue=new PriorityQueue<>();
         Queue<String> queue = new ArrayDeque<>();
         queue.add("Amit Sharma");
         queue.add("Vijay Raj");
         queue.add("JaiShankar");
         queue.add("Raj");
         System.out.println("head:"+queue.element());
         System.out.println("head:"+queue.peek());
         System.out.println("iterating the queue elements:");
         Iterator<String> itr3=queue.iterator();
         while(itr3.hasNext()){
             System.out.println(itr3.next());
         }
         queue.remove();
         queue.poll();
         System.out.println("after removing two elements:");
         Iterator<String> itr4=queue.iterator();
         while(itr4.hasNext()){
             System.out.println(itr4.next());
         }


         System.out.println("----- Creating Set and adding elements -----");
         // Creating HashSet and adding elements
//         HashSet<String> set=new HashSet<String>();
//         Set<String> set = new LinkedHashSet<>();
         Set<String> set = new TreeSet<>();
         set.add("Ravi");
         set.add("Vijay");
         set.add("Ravi");
         set.add("Ajay");

         // Traversing elements
         Iterator<String> itr5=set.iterator();
         while(itr5.hasNext()){
             System.out.println(itr5.next());
         }
     }
}

class Maps{

    public static void main(String[] args) {
//        Map<Object, Object> map=new HashMap<>();
        Map<Integer,String> map=new HashMap<Integer,String>();

        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        map.get(2);
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Jai"));
        map.remove(6);
        map.putIfAbsent(6, "xyz");
        map.replace(5, "Shubham");
        System.out.println(map);

        // Traversing Map with for-each loop
        for(Map.Entry<Integer, String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //Traversing Map
        Set<Map.Entry<Integer, String>> set=map.entrySet();//Converting to Set so that we can traverse

        Iterator<Map.Entry<Integer, String>> itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry<Integer, String> entry= itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
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

