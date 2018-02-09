package factory.simplefactory.factory;

import factory.simplefactory.component.Engine;
import factory.simplefactory.component.Seat;
import factory.simplefactory.component.Tyre;

/**
 * Created by chenbinbin on 2018/2/8.
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
