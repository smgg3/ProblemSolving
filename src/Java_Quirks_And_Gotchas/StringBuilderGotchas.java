/*
 * Why StringBuilder is important to do String Manipulations and it is drop in replacement for StringBuffer introduced in Java 1.5.
 * The two are identical except the StringBuffer synchronizes all the operations that we dont need always.
 *
 * */
public class StringBuilderGotchas {

    public String concatenation() {
        // Concatenation without StringBuilder it actually creates a string and
        // copies the values every time when it creates s+i and it runs in
        // O(n^2) time
        String s = "";
        for (int i = 0; i < 100; i++)
            s += i;

        // Concatenation with StringBuilder it adds the concatenations values at
        // the end of the char buffer and it is creating string at the end so it
        // will run in O(n) time
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++)
            sb.append(i);
        String result = sb.toString();
        System.out.println(result);

        return result;
    }

    public void diffBwtweenHashMapAndHashSet() {

        // HashMap is unsynchronized and faster. and permits null values and a
        // frequent source of bugs
        /*
         * how key/value pairs get stored (i.e., the key gets hashed to an int,
         * which is mod’d to the size of the array and used as an index, then
         * the key/value pair is stored in a linked list pointed to from the
         * indexed cell in the array), and why you have to store the key along
         * with the value (i.e., multiple values may be stored in a particular
         * bucket, so you need to be able to differentiate between them).
         *
         * Know Chaining and Open addressing
         *
         * LinkedHAshMap Garbage collection, concurrency, and Java 8 lambda
         * expressions
         */
    }

    public static void main(String[] args) {

    }
}
