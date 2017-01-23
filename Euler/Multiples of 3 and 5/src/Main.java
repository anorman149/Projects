public class Main {

    public static void main(String[] args) {
        int[] multiples = {3,5};
        int multipleCap = 999;

        System.out.println("Total from Multiples: " + addMultiples(multiples, multipleCap, 0));
    }

    public static int addMultiples(int[] multiples, int multipleCap, int addition){

        if(multipleCap <= 0){
            return addition;
        }

        for(Integer multiple : multiples){
            if(multipleCap % multiple == 0){
                addition = addition + multipleCap;
                break;
            }
        }

        return addMultiples(multiples, multipleCap - 1, addition);
    }
}
