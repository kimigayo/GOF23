package single;

import java.io.Serializable;

/**枚举式单例
 * 线程安全，调用效率高，不支持延时加载
 * Created by chenbinbin on 2018/2/7.
 */
public enum EnumSingle implements Serializable{
    instance,mybe;

    public void opertion(){}
}
