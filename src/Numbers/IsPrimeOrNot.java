/*
 * @author Sravani Murakonda
 * */
package Numbers;

//O(sqrt(n)) time complexity

public class IsPrimeOrNot {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(7));
    }

}
