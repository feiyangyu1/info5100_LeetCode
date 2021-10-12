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

    public static String reverseString(String s){
        String result = "";
        String[] arr = s.split(" ");

        for(int i = arr.length - 1 ; i >= 0; i --){
            if(i > 0 && !arr[i].equals(""))
                result = result + arr[i] + " ";
            else if(!arr[i].equals(""))
                result = result + arr[i];
        }

        return result;
    }

}
