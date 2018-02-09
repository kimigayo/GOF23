package factory.simplefactory.factory;

import factory.simplefactory.component.*;

/**
 * Created by chenbinbin on 2018/2/8.
 */
public class AodiCarFactory extends AbstractCarFactory {

    @Override
    public Engine createEngine() {
        return new AodiEngine();
    }

    @Override
    public Seat createSeat() {
        return new AodiSeat();
    }

    @Override
    public Tyre createTyre() {
        return new AodiTyre();
    }
}
