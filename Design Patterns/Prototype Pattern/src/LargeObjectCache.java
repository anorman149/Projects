import java.util.HashMap;

/**
 * Created by Adam on 3/22/2017.
 */
public class LargeObjectCache {

    private static HashMap<Integer, LargeObject> largeObjects = new HashMap<>();

    public static LargeObject getLargeObject(int id){
        return (LargeObject) largeObjects.get(id).clone();
    }

    public static void loadCache(){
        for(int x=0;x<4;x++){
            LargeObject largeObject = new LargeObject(x);
            largeObjects.put(x, largeObject);
        }
    }
}
