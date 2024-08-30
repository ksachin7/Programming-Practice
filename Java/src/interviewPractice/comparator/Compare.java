package interviewPractice.comparator;

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

