/*
 * @author Sravani Murakonda
 * */
package JavaFeatures;

public class LambdaExpressions {

    public static void main(String[] args) {

        Person name = () -> {
            System.out.println("Sravani");
        };

        name.getName();

    }

}

interface Person {
    public void getName();
}
