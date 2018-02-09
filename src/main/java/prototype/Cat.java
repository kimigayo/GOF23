package prototype;

import java.sql.Time;
import java.util.Date;

/**
 * Created by chenbinbin on 2018/2/9.
 */
public class Cat implements Cloneable {
    private String name;
    private Date birthDay;

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Cat(String name, Date birthDay, Integer height) {

        this.name = name;
        this.birthDay = birthDay;
        this.height = height;
    }

    public Cat(String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    private Integer height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cat o = (Cat) super.clone();
        //克隆其中的对象属性
        o.setBirthDay((Date) this.getBirthDay().clone());
        return o;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


    public static class test{
        public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
            Date date = new Date();
            System.out.println(date);
            Cat cat = new Cat("mick",date,175000);
            Cat cat1 = cat;
            Cat cat2 = (Cat) cat.clone();
            System.out.println(cat);
            System.out.println(cat1);
            System.out.println(cat2);
            cat1.setName("jack");
            cat1.setHeight(1720);
            Thread.currentThread().sleep(1000);
            date.setTime(System.currentTimeMillis());
            System.out.println(cat.getName()+":"+cat.getHeight()+":"+cat.getBirthDay());
            System.out.println(cat1.getName()+":"+cat1.getHeight()+":"+cat1.getBirthDay());
            System.out.println(cat2.getName()+":"+cat2.getHeight()+":"+cat2.getBirthDay());
        }
    }
}
