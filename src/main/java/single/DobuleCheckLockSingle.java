package single;

/**
 * 双重检测锁单例
 * 由于编译器优化原因和jvm底层内部模型原因，偶尔会出问题。不建议使用
 * Created by chenbinbin on 2018/1/30.
 */
public class DobuleCheckLockSingle {
    //延时加载
    private static DobuleCheckLockSingle dobuleCheckLockSingle;
    private DobuleCheckLockSingle(){}

    //同步内容降低大if内部，相比懒汉式提高了效率，不必每次获取对象都进行同步，只有第一次才进行同步创建以后就没必要了
    public static DobuleCheckLockSingle getInstance(){
        if(dobuleCheckLockSingle==null){
            DobuleCheckLockSingle single;
            synchronized (DobuleCheckLockSingle.class){
                single = dobuleCheckLockSingle;
                if(single==null){
                    synchronized (DobuleCheckLockSingle.class) {
                        if(single==null)
                            single = new DobuleCheckLockSingle();
                    }
                    dobuleCheckLockSingle=single;
                }
            }
        }
        return dobuleCheckLockSingle;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
