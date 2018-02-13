/*
 * @author Sravani Murakonda
 * */
package Strings;

import java.util.ArrayList;
import java.util.Calendar;

//O(n^2*n!) time complexity
public class PermutationsOfAString {
    public static void permutation(String s) {
        permutation(s, "");
    }

    public static void permutation(String s, String prefix) {
        if (s.length() == 0)
            System.out.println(prefix); // to print each char it takes O(n) time
        else
            for (int i = 0; i < s.length(); i++) {
                String rem = s.substring(0, i) + s.substring(i + 1); // it takes
                                                                     // O(n)
                                                                     // time to
                                                                     // get
                                                                     // substring()
                permutation(rem, prefix + s.charAt(i)); // no.of permuations n!
                                                        // to get each
                                                        // permutation we have n
                                                        // length tree till then
                                                        // i.e n*n!
            }

    }

    public static void main(String[] args) {
        // permutation("abc");
        ArrayList<StringBuilder> a = null;
        Calendar d = Calendar.getInstance();
        d.set(Calendar.HOUR, 34);
        System.out.println(d);

        final ArrayList<String> hello = new ArrayList<String>(1) {
            {

            }
        };
        System.out.println(hello.size());
        // System.out.println(hello.get(0));

        ArrayList<Integer> array = null;
        if (!array.isEmpty()) {
            System.out.println(array);
        }
    }

}
