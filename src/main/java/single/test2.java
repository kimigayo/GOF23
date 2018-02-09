package single;

import java.util.concurrent.CountDownLatch;

/**
 * Created by chenbinbin on 2018/2/7.
 */
public class test2
{
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10000);
        long start = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<1000000000;i++) {
//                        StaticInnerClassSingle single = StaticInnerClassSingle.getInstance();
//                        HungryManSingle single = HungryManSingle.getInstance();

//                        LazyManSingle single = LazyManSingle.getInstance();
                        EnumSingle single = EnumSingle.instance;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"ms");
    }
}
