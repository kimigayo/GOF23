package single;

/**
 * 懒汉式单例
 * Created by chenbinbin on 2018/1/30.
 */
public class LazyManSingle {
    //类加载时，不初始化实例
    private static LazyManSingle lazyManSingle;

    private LazyManSingle() {
    }
    //方法同步，调用效率低
    public static synchronized LazyManSingle getInstance() {
        if (lazyManSingle == null) {
            lazyManSingle = new LazyManSingle();
        }
        return lazyManSingle;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
