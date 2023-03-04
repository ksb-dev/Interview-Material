import java.util.*;
import java.lang.*;

public class ComplexNumbers2{
    public static String complexNumberMultiply(String a, String b) {

        // Spiting the real and imaginary parts
        // of the given complex strings based on '+'
        // and 'i' symbols.
        String x[] = a.split("\\+|i");
        String y[] = b.split("\\+|i");

        // Storing the real part of complex string a
        int a_real = Integer.parseInt(x[0]);

        // Storing the imaginary part of complex string a
        int a_img = Integer.parseInt(x[1]);

        // Storing the real part of complex string b
        int b_real = Integer.parseInt(y[0]);

        // Storing the imaginary part of complex string b
        int b_img = Integer.parseInt(y[1]);

        // Returns the product.
        return (a_real * b_real - a_img * b_img) + "+" +
              (a_real * b_img + a_img * b_real) + "i";
    }

    // Driver function
    public static void main(String argc[]){
        String str1 = "3+6i";
        String str2 = "7+9i";
        System.out.println(complexNumberMultiply(str1, str2));
    }
}