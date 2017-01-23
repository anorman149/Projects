
public class Main {

    public static void main(String[] args) {
        String delimiter = " ";
        System.out.println(toJadenCase("yay, we are in business", delimiter));
    }

    public static String toJadenCase(String phrase, String delimiter) {
        //Fail Fast
        if(phrase == null || phrase.equalsIgnoreCase("")){
            return null;
        }

        String[] tokens = phrase.split(delimiter);
        for (int x=0; x<tokens.length; x++){
            tokens[x] = tokens[x].substring(0, 1).toUpperCase() + tokens[x].substring(1);
        }

        return String.join(delimiter, tokens);
    }
}
