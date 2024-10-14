package binarysearch;

public class Main {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        Integer[] number = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println(binarySearch.binarySearch(number, 1));
        System.out.println(binarySearch.binarySearch(number, 3));
        System.out.println(binarySearch.binarySearch(number, -5));
        System.out.println(binarySearch.binarySearch(number, 13));
        System.out.println(binarySearch.binarySearch(number, 15));
    }
}
