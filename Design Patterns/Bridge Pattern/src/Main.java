import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        TV samsung = TVFactory.getTVManufacturer(Manufacturer.SAMSUNG);

        ConcreateRemoteControl remote = new ConcreateRemoteControl(new LinkedList<>(Arrays.asList(1, 3, 5, 6, 30, 50, 6, 32)), 1, samsung);

        try{
            StringBuilder print = new StringBuilder();
            print.append("Previous Channels: ");
            print.append(Arrays.toString(remote.getPreviousChannels().toArray()));
            print.append(" TV Manufacturer: ");
            print.append(remote.getImplementor());
            System.out.println(print.toString());
        }catch (Exception e){
            //Do nothing
        }

    }
}
