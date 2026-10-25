public class TextCompare {

   public static int CountWords (String text, String target) {
       int count = 0;
       int index = 0;

       while ((index = text.indexOf(target, index)) != -1) {
            count ++;
            index += target.length();

       }

       return count;
   }

    public static boolean WarAndPeace (String text) {
        boolean result = false;
        int countWar = CountWords(text, "war");
        int countPeace = CountWords(text, "peace");

        if (countPeace == countWar) {
            result = true;
        }

        return result;
    }
    public static void main (String[] args) {

    }
}
