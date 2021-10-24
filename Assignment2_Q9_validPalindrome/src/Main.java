import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(a));
        String s = "race a car";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]","");
        s = s.toLowerCase();

        int start = 0;
        int end = s.length()-1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end))
                return false;
            else{
                start ++;
                end --;
            }
        }


        return true;


    }


}
