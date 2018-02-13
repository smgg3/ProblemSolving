/*
 * @author Sravani Murakonda
 * */
package Sortings;

public class InsertionSort {
    public <T extends Comparable<T>> T[] insertionSort(T[] A) {
        int i = 1;
        while (i < A.length) {
            int j = i - 1;
            while (j >= 0 && A[j + 1].compareTo(A[j]) < 0) {
                T value = A[j + 1];
                A[j + 1] = A[j];
                A[j] = value;
                j = j - 1;
            }
            i = i + 1;
        }
        return A;

    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        Integer[] A = { 3, 2, 4 };
        is.insertionSort(A);
        for (Integer value : A)
            System.out.println(value);
        String[] B = { "Padma", "sravani", "sai" };
        is.insertionSort(B);
        for (String value : B)
            System.out.println(value);
        System.out.println("End");

    }

}
