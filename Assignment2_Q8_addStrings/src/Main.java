public class Main {

    public static void main(String[] args) {
        System.out.println(addStrings("11","123"));
        System.out.println(addStrings("456","77"));
        System.out.println(addStrings("0","0"));
    }

    public static String addStrings(String str1, String str2){
        int int1 = 0;
        int int2 = 0;

        for(int i=0; i<str1.length(); i++){
            char str = str1.charAt(i);

            switch ((str)){
                case '0':
                    int1 = int1*10+0;
                    break;
                case '1':
                    int1 = int1*10+1;
                    break;
                case '2':
                    int1 = int1*10+2;
                    break;
                case '3':
                    int1 = int1*10+3;
                    break;
                case '4':
                    int1 = int1*10+4;
                    break;
                case '5':
                    int1 = int1*10+5;
                    break;
                case '6':
                    int1 = int1*10+6;
                    break;
                case '7':
                    int1 = int1*10+7;
                    break;
                case '8':
                    int1 = int1*10+8;
                    break;
                case '9':
                    int1 = int1*10+9;
                    break;
                default:
                    break;

            }
        }

        for(int i=0; i<str2.length(); i++){
            char str = str2.charAt(i);

            switch ((str)){
                case '0':
                    int2 = int2*10+0;
                    break;
                case '1':
                    int2 = int2*10+1;
                    break;
                case '2':
                    int2 = int2*10+2;
                    break;
                case '3':
                    int2 = int2*10+3;
                    break;
                case '4':
                    int2 = int2*10+4;
                    break;
                case '5':
                    int2 = int2*10+5;
                    break;
                case '6':
                    int2 = int2*10+6;
                    break;
                case '7':
                    int2 = int2*10+7;
                    break;
                case '8':
                    int2 = int2*10+8;
                    break;
                case '9':
                    int2 = int2*10+9;
                    break;
                default:
                    break;

            }
        }

        return Integer.toString(int1+int2);
    }

}
