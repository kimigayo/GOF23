package factory.simplefactory.director;

import factory.simplefactory.component.Engine;
import factory.simplefactory.component.Seat;
import factory.simplefactory.component.Tyre;
import factory.simplefactory.factory.CarFactory;
import factory.simplefactory.product.Aodi;
import factory.simplefactory.product.Car;

/**
 * Created by chenbinbin on 2018/2/8.
 */
public class AodiCarDirector extends AbstractCarDirector {
    public AodiCarDirector(CarFactory factory) {
        super(factory);
    }

    @Override
    protected Car directorCar(Seat seat, Tyre tyre, Engine engine) {
        return new Aodi(engine,seat,tyre);
    }
}
