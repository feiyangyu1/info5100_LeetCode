public class Main {

    public static void main(String[] args) {
        System.out.println(addStrings("11","123"));
        System.out.println(addStrings("456","77"));
        System.out.println(addStrings("0","0"));
    }

    public static String addStrings(String str1, String str2){
       StringBuilder result = new StringBuilder();

       int i = str1.length()-1;
       int j = str2.length()-1;

       int sum = 0;
       int carry = 0;

       while(i>=0 || j>=0){
           sum = carry;
           if(i>=0){
               sum += str1.charAt(i) - '0';
               i--;
           }

           if(j>=0){
               sum += str2.charAt(j) - '0';
               j--;
           }

           carry = sum / 10;
           result.append(sum%10);


       }

       if(carry!=0)
           result.append(carry);

       return result.reverse().toString();
    }

}
