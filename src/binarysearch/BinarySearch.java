package binarysearch;

public class BinarySearch {

    public <T extends Comparable<T>> int binarySearch(T[] array, T value) {
        int head = 0;
        int tail = array.length - 1;

        while (head <= tail) {

            int middle = (head + tail) / 2;
            T middleValue = array[middle];

            if (value.compareTo(middleValue) == 0) {
                return middle;
            } else if (middleValue.compareTo(value) > 0) {
                tail = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        return -1;
    }
}
