/*
 * @author Sravani Murakonda
 * */
package Numbers;

public class SumOfNNumbers {

    public static int sumOfNNumbers(int n, int sum) {
        if (n == 0)
            return sum;
        else
            return sumOfNNumbers(n - 1, sum + n);

    }

    public static int sumOfNNumbers1(int n) {
        if (n == 0)
            return 0;
        else
            return n + sumOfNNumbers1(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNNumbers(10, 0));
        System.out.println(sumOfNNumbers1(10));

    }

}
