package creator.builder.product;

import creator.builder.component.Engine;
import creator.builder.component.Seat;
import creator.builder.component.Tyre;

/**
 * Created by chenbinbin on 2018/2/7.
 */
public class Aodi extends AbstractCar {
    public Aodi(Engine engine, Seat seat, Tyre tyre) {
        super(engine, seat, tyre);
    }

    @Override
    public void run() {
        System.out.println("奥迪------》》》》");
    }
}
