package itssachin.interviewPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compare{
//    public class Comparable implements java.lang.Comparable<itssachin.practice.Comparable> {
    private String name;
    private int phone;
    private int id;

    public Compare(String name, int phone, int id) {
        this.name= name;
        this.phone= phone;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", id=" + id +
                '}';
    }

//    @Override
//    public int compareTo(Compare o) {
//        return this.id-o.id;
//    }

}
class IdComparator implements java.util.Comparator<Compare> {
    @Override
    public int compare(Compare o1, Compare o2) {
        return o1.getId()-o2.getId();
    }
}

// comparing using multiple fields
class namePhoneComparator implements Comparator<Compare>{

    @Override
    public int compare(Compare o1, Compare o2) {
        int nameCompare=  o1.getName().compareTo(o2.getName());
        int phoneCompare=  o1.getPhone()-o2.getPhone();
        return (phoneCompare==0)?nameCompare: phoneCompare;
    }
}

class TestCompare{
    public static void main(String[] args) {
        ArrayList<Compare> al= new ArrayList<>();
        al.add(new Compare("xyz", 1234, 3));
        al.add(new Compare("abc", 543, 2));
        al.add(new Compare("aac", 523, 1));
        al.add(new Compare("aacc", 5233, 4));

        System.out.println(al);
//        Collections.sort(al);
        Collections.sort(al, new IdComparator());
        System.out.println(al);

        // using List.sort()
        al.sort(new namePhoneComparator());
        System.out.println(al);
    }
}