package factory.simplefactory;

import factory.simplefactory.director.AodiCarDirector;
import factory.simplefactory.director.CarDirector;
import factory.simplefactory.factory.AotuoCarFactory;
import factory.simplefactory.product.Car;

/**
 * Created by chenbinbin on 2018/2/7.
 */
public class test {
    public static void main(String[] args) {
        CarDirector carDirector = new AodiCarDirector(new AotuoCarFactory());
        Car car = carDirector.createCar();
        car.run();
    }
}
