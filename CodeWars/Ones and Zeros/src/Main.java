import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> binary = new ArrayList<>(Arrays.asList(1,1,1,1));
        System.out.println(ConvertBinaryArrayToInt(binary));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();

        for (Integer number : binary) {
            sb.append(number);
        }

        return Integer.parseInt(sb.toString(),2);
    }
}
