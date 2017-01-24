public class Main {

    public static void main(String[] args) {
        int x = 493193;
        System.out.println(digital_root(x));
    }

    public static int digital_root(int n) {
        String number = String.valueOf(n);
        int x = 0;

        if(number.length() == 1){
            return n;
        }

        for(int y=0; y < number.length(); y++){
            x = x + Integer.parseInt(number.substring(y, y+1));
        }

        return digital_root(x);
    }
}
