/*
 * @author Sravani Murakonda
 * */
package Sortings;

public class SelectionSort {

    public <T extends Comparable<T>> T[] selectionSort(T[] A) {
        int min;
        for (int i = 0; i < A.length; i++) {
            min = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[min].compareTo(A[j]) > 0) {
                    min = j;
                }
            }
            T swap = A[min];
            A[min] = A[i];
            A[i] = swap;
        }
        return A;
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        Integer[] A = { 3, 2, 4 };
        obj.selectionSort(A);
        for (Integer value : A)
            System.out.println(value);
        String[] B = { "Padma", "sravani", "sai" };
        obj.selectionSort(B);
        for (String value : B)
            System.out.println(value);
        System.out.println("End");

    }

}
