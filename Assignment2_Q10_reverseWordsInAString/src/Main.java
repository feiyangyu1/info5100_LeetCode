import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(reverseString(s));
        String s2 = "the sky is blue";
        System.out.println(reverseString(s2));
        String s3 = "a good     example";
        System.out.println(reverseString(s3));
        String s4 = "   Bob    Loves Alice";
        System.out.println(reverseString(s4));
        String s5 = "Alice does not even like bob";
        System.out.println(reverseString(s5));
    }

    public static String reverseString(String s) {
        String result = "";
        String[] arr = s.trim().split(" +");
        Collections.reverse(Arrays.asList(arr));
        String.join(" ", arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = result + " " + arr[i];
            } else if (i == 0) {
                result = arr[i];
            } else {
                result = result + " " + arr[i];
            }
        }

            return result;
    }
    }


