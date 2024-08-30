package interviewPractice.comparator;

class IdComparator implements java.util.Comparator<Compare> {
    @Override
    public int compare(Compare o1, Compare o2) {
        return o1.getId() - o2.getId();
    }
}
