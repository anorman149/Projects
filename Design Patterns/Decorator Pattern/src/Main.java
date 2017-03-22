public class Main {

    public static void main(String[] args) {
        SmartTVDecorator samsung = new SmartTVDecorator(TVFactory.getTVManufacturer(Manufacturer.SAMSUNG));

        System.out.println("TV is Samsung");
    }
}
