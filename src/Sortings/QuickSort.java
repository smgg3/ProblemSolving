/*
 * @author Sravani Murakonda
 * */
package Sortings;

//O(nlogn) time best and average cases
//O(n^2) time worst case

import java.util.Scanner;

//When you are doing in place algorithms and swapping any two elements within the array without using any new variable then you should be careful with the same indexes.
//IF you are swaping in the same index then it will result in 0. So keep a condition before swapping also.
public class QuickSort<T> {
    public <T extends Comparable<T>> int partition(T[] a, int p, int r) {
        T pivot = a[r];
        int i = p - 1; // wall
        for (int j = p; j <= r - 1; j++) {
            if (a[j].compareTo(pivot) < 0) {
                i = i + 1;
                T swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }
        }
        T swap = a[i + 1];
        a[i + 1] = a[r];
        a[r] = swap;
        return i + 1;
    }

    public <T extends Comparable<T>> T[] quickSort(T[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array :");
        QuickSort obj = new QuickSort();
        int n = s.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        obj.quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
        String[] b = { "Padma", "sravani", "sai" };
        obj.quickSort(b, 0, 2);
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
    }

}
