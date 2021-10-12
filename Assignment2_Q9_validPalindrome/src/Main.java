import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(a));
        String s = "race a car";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s){
        s = s.toLowerCase();
        int front = 0;
        int back = s.length()-1;
        while(front>=0 && back <=s.length()-1 && front < back){
            char frontChar;
            char backChar;
            while(!(s.charAt(front) >= 'a' && s.charAt(front) < 'z')){
                front ++;
            }
            frontChar = s.charAt(front);

            while(!(s.charAt(back) >= 'a' && s.charAt(back) < 'z')){
                back --;
            }
            backChar = s.charAt(back);

            if(frontChar != backChar)
                return false;
            else{
                front ++;
                back --;
            }
        }

        return true;
    }


}
