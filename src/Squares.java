/*
 * @author Sravani Murakonda
 * */
public class Squares {

    public static int solution(int A, int B) {
        if (A < 0)
            A = 0;
        if (A == B)
            if (Math.pow((int) Math.sqrt(A), 2) == A)
                return 1;
            else
                return 0;
        else {
            return (int) Math.sqrt(B) - (int) Math.sqrt(A) + 1;
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(0, 0));

    }

}
