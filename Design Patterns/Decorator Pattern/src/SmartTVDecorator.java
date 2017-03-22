import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 3/22/2017.
 */
public class SmartTVDecorator extends TVDecorator {

    private List<String> apps = new ArrayList<>();

    public SmartTVDecorator(TV decoratedTV) {
        super(decoratedTV);
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

    @Override
    public void tuneToChannel(int channel) {
        super.tuneToChannel(channel);
    }

    public List<String> getApps(){
        return apps;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }
}
