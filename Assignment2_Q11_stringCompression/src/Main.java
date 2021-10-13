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
        int count = 0;
        int node = 0;
        int num = 1;

        if(chars.length == 1)
            return 1;

        for(int i = 0; i < chars.length; i ++){
            if(chars[node] == chars[i]){
                count ++;
            }
            else{
                node = i;

                if(count > 1){
                    if(count < 10){
                        chars[num] = (char)(count + '0');
                        num += 2;
                        count = 1;
                    }
                    else{
                        chars[num] = (char)(count / 10 + '0');
                        chars[num + 1] = (char)(count%10 + '0');
                        num += 3;
                        count = 1;
                    }


                }
                else{
                    num += 1;
                    count = 1;
                }


            }
            if(i == chars.length - 1){
                if(count < 10){
                    chars[num] = (char)(count + '0');
                }
                else{
                    chars[num] = (char)(count / 10 + '0');
                    chars[num + 1] = (char)(count%10 + '0');
                    num ++;
                }
            }
        }

        return num + 1;
    }

}
