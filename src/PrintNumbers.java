
/*
 * @author Sravani Murakonda
 * */
import java.util.Arrays;

public class PrintNumbers {

    public static int fact(int n) {
        int output = 1;
        for (int i = 1; i <= n; i++) {
            output *= i;
        }
        return output;
    }

    public static int solution(int N) {
        if (N == 0)
            return 1;
        else if (N < 0)
            return -1;
        else {
            String n = Integer.toString(N);
            char[] arr = n.toCharArray();
            Arrays.sort(arr);
            int output = fact(n.length());
            int start = 0;
            for (int i = 1; i < n.length(); i++) {
                while (i < n.length() && arr[i] == arr[i - 1]) {
                    i++;
                }

                output = output / fact(i - start);
                start = i;
            }
            if (arr[0] == '0')
                output = output - fact(n.length() - 1);
            return output;

        }

    }

    public static void main(String[] args) {
        System.out.println(solution(123));

    }

}
