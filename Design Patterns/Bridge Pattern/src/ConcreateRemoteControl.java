import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Adam on 3/22/2017.
 */
public class ConcreateRemoteControl extends RemoteControl implements Serializable {

    private LinkedList<Integer> previousChannels = new LinkedList<>();

    private int currentChannel;

    public ConcreateRemoteControl(LinkedList<Integer> previousChannels, int currentChannel, TV implementor) {
        this.previousChannels = previousChannels;
        this.currentChannel = currentChannel;
        this.implementor = implementor;
    }

    public ConcreateRemoteControl(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public ConcreateRemoteControl() {

    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    @Override
    public List<Integer> getPreviousChannels() throws Exception {
        return previousChannels.stream().limit(numberofPreviousChannelsToRetrieve).collect(Collectors.toList());
    }

    @Override
    public void changeChannel(int channel) throws Exception{
        previousChannels.add(currentChannel);

        currentChannel = channel;
    }
}
