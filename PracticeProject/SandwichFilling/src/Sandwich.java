public class Sandwich {

    public static String sandwichFillings (String input) {
        if (input.length() < 5){
            return "none";
        }
        int FirstBreadIndex = input.indexOf("bread");
        int LastBreadIndex = input.lastIndexOf("bread");
        if (FirstBreadIndex == -1 || LastBreadIndex == -1 || FirstBreadIndex == LastBreadIndex) {
            return "none";
        }
        else {
            return input.substring(FirstBreadIndex + 5, LastBreadIndex);
        }
    }

    public static void main (String[] args) {

    }

}
