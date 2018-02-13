/*
 * @author Sravani Murakonda
 * */
package Searches;

//For primitive type arrays
//O(lgn) if array is sorted
//O(nlgn) if array is unsorted

//if it Strings or anything multiply the timecomplexity with length of the longest String O(slogn)

public class BinarySearch {

    public static int binarySearch(int[] arr, int element, int p, int r) {
        int mid = (p + r) / 2;
        if (arr[mid] == element)
            return mid;
        else if (p >= r)
            return -1;
        else if (arr[mid] < element)
            return binarySearch(arr, element, mid + 1, r);
        else
            return binarySearch(arr, element, p, mid - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(arr[binarySearch(arr, 9, 0, 9)]);
        System.out.println("index of 9 is:" + binarySearch(arr, 9, 0, 9));

    }

}
