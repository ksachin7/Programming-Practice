package interviewPractice.practiced_programs;

// Compute total size of data and find min. required storage card which is in 2^n sizes that can store total data.
class MemoryCards {

    static int findStorageCard(int[] data) {
        int cardSize = 0, dataSize = 0;
        for (int e : data) {
            dataSize += e;
        }
        System.out.println("Data size: " + dataSize);

        if (data.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                cardSize = (int) Math.pow(2, i);
                if (cardSize >= dataSize)
                    break;
            }
        }
        return cardSize;
    }

    public static void main(String[] args) {

        // given audio, video files of data in mb.
        int[] data = {23, 45, 56, 5, 40, 21, 33, 7};

        System.out.println("Minimum size card required is: " + findStorageCard(data));

    }
}
