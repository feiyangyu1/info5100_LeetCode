public class Main {

    public static void main(String[] args) {
        String[] wordDict1 = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestDistance(wordDict1,"coding","practice"));
        System.out.println(shortestDistance(wordDict1,"makes","coding"));

    }

    public static int shortestDistance(String[] wordDict, String word1, String word2){
        int position1 = -1;
        int position2 = -1;

        for(int i = 0; i < wordDict.length; i++){
            if(wordDict[i].equals(word1))
                position1 = i;
            if(wordDict[i].equals(word2))
                position2 = i;
        }

        if(position1 != -1 && position2 != -1)
            return Math.abs(position1 - position2);
        else
            throw new IllegalArgumentException("No result found");

    }
}
