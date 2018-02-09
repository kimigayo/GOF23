package single;

import java.io.Serializable;

/**饿汉式单例
 * Created by chenbinbin on 2018/1/26.
 */
public class HungryManSingle implements Serializable{
    private final static HungryManSingle SINGLE = new HungryManSingle();//类初始化，就马上加载，线程安全，无延时加载
    private HungryManSingle(){}

    /**
     * 方法无同步，加载效率高
     * @return
     */
    public static HungryManSingle getInstance(){
        return SINGLE;
    }

    public static void main(String[] args) {
        System.out.println(HungryManSingle.getInstance());
        System.out.println(HungryManSingle.getInstance());
        System.out.println(HungryManSingle.getInstance());
    }
}
