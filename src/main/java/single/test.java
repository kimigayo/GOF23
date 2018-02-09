package single;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/**单例模式选择：
 * 实例占用内存较小可以选用：枚举式、饿汉式（不延时加载）
 * 实例占用内存较大可以选用：静态内部类式、懒汉式（延时加载）
 * 双重检测锁不建议使用
 * Created by chenbinbin on 2018/2/7.
 */
public class test {

    public static void main(String[] args) throws Exception {
        EnumSingle enumSingle = EnumSingle.instance;
        EnumSingle[] enumSingle1 = enumSingle.getClass().getEnumConstants();
        System.out.println(Arrays.asList(enumSingle1));
        //通过反射直接创建实例
//        Class<HungryManSingle> s1 = (Class<HungryManSingle>) Class.forName("single.HungryManSingle");
        HungryManSingle single = HungryManSingle.getInstance();
        HungryManSingle single0 = HungryManSingle.getInstance();
        System.out.println(single);
        System.out.println(single0);
        Class s1 = single.getClass();
        Constructor constructor = s1.getDeclaredConstructor();
        constructor.setAccessible(true);
//        System.out.println(constructor.newInstance());
//        System.out.println(constructor.newInstance());
        //通过反序列化创建实例
        FileOutputStream fileOutputStream = new FileOutputStream("d:/a.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(single);
        objectOutputStream.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("d:/a.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        HungryManSingle single1 = (HungryManSingle) objectInputStream.readObject();
        System.out.println(single1);
    }
}
