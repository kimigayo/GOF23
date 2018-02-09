package factory.simplefactory.director;

import factory.simplefactory.component.Engine;
import factory.simplefactory.component.Seat;
import factory.simplefactory.component.Tyre;
import factory.simplefactory.factory.CarFactory;
import factory.simplefactory.product.Car;

/**
 * Created by chenbinbin on 2018/2/8.
 */
public abstract class AbstractCarDirector implements CarDirector {
    private CarFactory factory;

    public AbstractCarDirector(CarFactory factory) {
        this.factory = factory;
    }

    public Car createCar(){
        Engine engine = factory.createEngine();
        Seat seat = factory.createSeat();
        Tyre tyre = factory.createTyre();
        return directorCar(seat,tyre,engine);
    }

    protected abstract Car directorCar(Seat seat, Tyre tyre, Engine engine);
}
