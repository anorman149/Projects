/**
 * Created by Adam on 3/22/2017.
 */
public abstract class TVDecorator implements TV {
    protected TV decoratedTV;

    public TVDecorator(TV decoratedTV) {
        this.decoratedTV = decoratedTV;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void tuneToChannel(int channel) {

    }
}
