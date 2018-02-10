package structure.adapter;

/**
 * Created by chenbinbin on 2018/2/10.
 */
public class Computer {
    public static void main(String[] args) {
        IKeyboardAdapter iKeyboardAdapter = new KeyboardAdapterObject(new Keyboard());
        iKeyboardAdapter.play();
    }
}
