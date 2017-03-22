import org.omg.CORBA.SystemException;

/**
 * Created by Adam on 3/22/2017.
 */
public class TVFactory {

    public static TV getTVManufacturer(Manufacturer manufacturer){
        switch (manufacturer){
            case SONY : return new Sony();
            case SAMSUNG : return new Samsung();
            default : return null;
        }
    }
}
