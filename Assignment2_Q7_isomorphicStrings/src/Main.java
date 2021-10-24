import java.util.HashMap;

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

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i<str1.length(); i++){
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            if(map.containsKey(char1)){
                if(map.get(char1) != char2)
                    return false;
            }
            else {
                if(!map.containsValue(char2))
                    map.put(char1,char2);
                else
                    return false;
            }
        }
        return true;
    }


}
