package creator.builder.product;

import creator.builder.component.Engine;
import creator.builder.component.Seat;
import creator.builder.component.Tyre;

/**
 * Created by chenbinbin on 2018/2/7.
 */
public class Aotuo extends AbstractCar {
    public Aotuo(Engine engine, Seat seat, Tyre tyre) {
        super(engine, seat, tyre);
    }

    @Override
    public void run() {
        System.out.println("奥拓-----》》》。");
    }
}
