/*
 * @author Sravani Murakonda
 * */
package Sortings;

public class BubbleSort {

    public <T extends Comparable<T>> T[] bubbleSort(T[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j].compareTo(A[j + 1]) > 0) {
                    T swap = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = swap;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        Integer[] A = { 3, 2, 4 };
        obj.bubbleSort(A);
        for (Integer value : A)
            System.out.println(value);
        String[] B = { "Padma", "sravani", "sai" };
        obj.bubbleSort(B);
        for (String value : B)
            System.out.println(value);
        System.out.println("End");
    }

}
