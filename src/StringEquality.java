import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        System.out.println("Enter first String --> ");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        System.out.println("Enter second String --> ");
        String string2 = scanner.next();
        System.out.println("string 1 --> "+string1);
        System.out.println("string 2 --> "+string2);
        if(string2.equals(string1))
            System.out.println("Both strings are equal");
        else
            System.out.println("Both strings are not equal");
    }
}
