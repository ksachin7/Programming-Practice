package interviewPractice.comparator;

import java.util.Comparator;

// comparing using multiple fields
class namePhoneComparator implements Comparator<Compare> {

    @Override
    public int compare(Compare o1, Compare o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        int phoneCompare = o1.getPhone() - o2.getPhone();
        return (phoneCompare == 0) ? nameCompare : phoneCompare;
    }
}
