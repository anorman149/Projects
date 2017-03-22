import java.util.List;

/**
 * Created by Adam on 3/22/2017.
 */
public abstract class RemoteControl {
    public TV implementor;
    public int numberofPreviousChannelsToRetrieve = 25;

    public void on()   {
        implementor.on();
    }

    public void off()   {
        implementor.off();
    }

    public abstract void changeChannel(int channel) throws Exception;
    public abstract List<Integer> getPreviousChannels() throws Exception;

    public TV getImplementor() {
        return implementor;
    }

    public void setImplementor(TV implementor) {
        this.implementor = implementor;
    }
}
