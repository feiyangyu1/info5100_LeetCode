public class Main {

    public static void main(String[] args) {
        String t = "add";
        String s = "egg";
       System.out.println(isomorphicStrings(s,t));
         t = "foo";
         s = "bar";
        System.out.println(isomorphicStrings(s,t));
         t = "paper";
         s = "title";
        System.out.println(isomorphicStrings(s,t));



    }

    public static boolean isomorphicStrings(String str1, String str2){
        if(str1 == null && str2 == null)
            return true;
        if(str2.length() != str1.length())
            return false;

        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        for(int i=0; i< str1.length(); i++){
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if(arr1[char1] == 0 && arr2[char2] == 0){
                arr1[char1] = char1;
                arr2[char2] = char2;
            }

            else if(arr1[char1] == char1 && arr2[char2] == char2){
                arr1[char1] = char1;
                arr2[char2] = char2;
            }
            else
                return false;
        }

        return true;
    }


}
