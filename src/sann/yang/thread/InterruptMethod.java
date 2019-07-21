package sann.yang.thread;

/**
 * @Author: 杨强
 * @Date: 2019/7/19 17:43
 * @Version 1.0
 * @Discription 线程的Interrupt()方法:
 * 线程的interrupt方法会改变线程的阻塞状态,但是线程仍然会执行,参考线程的六种状态
 * 如果在被调用的线程对象处于为阻塞的状态,则interrupt没有任何效果,被调用的线程
 *
 */
public class InterruptMethod {


    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行线程任务啦");
                    long l = System.currentTimeMillis();
                try {

                    Thread.sleep(10000);
                    long result = System.currentTimeMillis() - l;
                    System.out.println("耗时要"+result/1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                    long result = System.currentTimeMillis() - l;
                    System.out.println("耗时要"+result/1000);
                }
            }
        });
        t.start();
        t.interrupt();
        System.out.println("哈哈哈,调用中断方法后子线程执行要多久呢");
    }
}
