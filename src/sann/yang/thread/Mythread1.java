package sann.yang.thread;

/**
 * @Author: 杨强
 * @Date: 2019/7/19 16:53
 * @Version 1.0
 * @Discription 实现多线程的方式一 : 继承Thread类
 */
public class Mythread1 extends Thread{

    @Override
    public void run() {
        System.out.println(this.getName()+"多线程实现的方式一:继承Thread类,重写run方法   ");
    }
}

class ThreadTest1{

    public static void main(String[] args) {
        Mythread1 mt =new Mythread1();
        mt.start();

    }


}
