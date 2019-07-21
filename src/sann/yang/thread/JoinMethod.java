package sann.yang.thread;

/**
 * @Author: 杨强
 * @Date: 2019/7/19 17:18
 * @Version 1.0
 * @Discription join()方法
 * 1,join方法和sleep方法的相同与不同
 * 相同:都是Thread类中的方法,都会使当前线程阻塞;
 * 不同:join方法在底层仍然是调用的wait(0)方法,阻塞时会释放锁资源
 *     sleep不会放弃锁资源;
 *
 */
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("join方法的作用");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        //t1.join();
        //在主线程内调用子线程t1对象的join方法,此时 主线程会被挂起,直到子线程执行完毕,即执行下面这段话
        System.out.println("哈哈哈哈哈,主线程真的已经执行了吗");


    }
}
