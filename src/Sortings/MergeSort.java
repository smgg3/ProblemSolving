package Sortings;

import java.util.Arrays;

public class MergeSort {

    public <T extends Comparable<T>> T[] mergeSort(T[] A, int p, int r) {
        if (p < r) {
            int mid = (p + r) / 2;
            mergeSort(A, p, mid);
            mergeSort(A, mid + 1, r);
            merge(A, p, mid, r);
        }
        return A;
    }

    public <T extends Comparable<T>> T[] merge(T[] A, int p, int mid, int r) {

        T[] leftA = Arrays.copyOfRange(A, p, mid + 1);
        T[] rightA = Arrays.copyOfRange(A, mid + 1, r + 1);
        int left = 0, right = 0;
        int index = p;
        while ((p + left) <= mid && (right + mid + 1) <= r) {

            if (leftA[left].compareTo(rightA[right]) <= 0) {

                A[index++] = leftA[left++];
            } else {
                A[index++] = rightA[right++];
            }
        }
        while ((p + left) <= mid) {
            A[index++] = leftA[left++];
        }
        return A;
    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        Integer[] A = { 3, 2, 4 };
        obj.mergeSort(A, 0, 2);
        for (Integer value : A)
            System.out.println(value);
        String[] B = { "Padma", "sravani", "sai" };
        obj.mergeSort(B, 0, 2);
        for (String value : B)
            System.out.println(value);

    }

}
