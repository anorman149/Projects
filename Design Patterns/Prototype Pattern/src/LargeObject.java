/**
 * Created by Adam on 3/22/2017.
 */
public class LargeObject implements Cloneable{

    private int id;
    private String name;
    private String description;

    LargeObject(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    protected Object clone() {
        Object clone = null;

        try{
           clone = super.clone();
        }catch (CloneNotSupportedException e){
            //No need at the moment
        }

        return clone;
    }
}
