package structure.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        new DecorateSofa(new DecorateDesk(new DecorateAirconditioned(new Room()))).decorate();
    }
}
