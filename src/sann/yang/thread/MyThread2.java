package sann.yang.thread;

/**
 * @Author: 杨强
 * @Date: 2019/7/19 17:01
 * @Version 1.0
 * @Discription 多线程的实现方式二: 实现Runnable接口
 */
public class MyThread2  implements Runnable{
    @Override
    public void run() {
        System.err.println(Thread.currentThread().getName()+"多线程的实现方式二:" +
                "实现Runable接口    ");
    }
}

class ThreadTest{
    public static void main(String[] args) {
        new Thread(new MyThread2()).start();
    }
}
