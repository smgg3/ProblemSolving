package Numbers;

import java.util.HashMap;

/**
 *
 * @author Sravani Murakonda
 *
 */
public class PowerFunction {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return x;
        else if (n == -1)
            return 1 / x;
        else if (x == 1)
            return 1;
        else if (x == -1) {
            if (n % 2 == 1)
                return -1;
            else
                return 1;
        } else if (n == Integer.MIN_VALUE)
            return 0;

        double pow = x;
        if (n < 0)
            pow = 1 / x;
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        map.put(1, pow);
        int i;
        for (i = 2; i <= Math.abs(n); i *= 2) {
            pow = pow * pow;
            map.put(i, pow);
            if (pow == 0)
                return 0;
        }
        i = i / 2;
        double sum = map.get(i);
        int power = i;

        while (power != n && i >= 1) {
            i = i / 2;
            if ((power + i) <= Math.abs(n))
                if (map.containsKey(i)) {
                    sum = sum * map.get(i);
                    power += i;
                }
        }

        return sum;
    }
}
