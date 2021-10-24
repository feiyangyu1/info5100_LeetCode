public class Main {

    public static void main(String[] args) {
        char[] chars1 = {'a','a','b','b','c','c','c'};
        System.out.println(stringCompression(chars1));
        char[] chars2 = {'a'};
        System.out.println(stringCompression(chars2));
        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(stringCompression(chars3));
        char[] chars4 = {'a','a','b','b','a','a'};
        System.out.println(stringCompression(chars4));
    }

    public static int stringCompression(char[] chars){
        int i = 0;
        int index = 0;

        while(i < chars.length){
            char letter = chars[i];
            int count = 0;

            while(i<chars.length && letter == chars[i]){
                count ++;
                i++;
            }
            if(i<chars.length && letter != chars[i]){
                chars[index] = letter;
                index ++;}

                if(count != 1){
                    for(char chara : Integer.toString(count).toCharArray()){
                        chars[index] = chara;
                        index ++;
                    }
                }

        }
        return index + 1;
    }

}
