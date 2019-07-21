package sann.yang.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: 杨强
 * @Date: 2019/7/19 17:05
 * @Version 1.0
 * @Discription 多线程实现的方式三:实现callable接口 重写call方法
 * call方法允许抛出异常并且有返回值
 */
public class MyThread3 implements Callable {

    @Override
    public String call() throws Exception {
        System.out.println("1111");
        System.out.println("2222");
        System.out.println("3333");
        System.out.println("4444");
        System.out.println("5555");
        return Thread.currentThread().getName()+"多线程的实现方式三:" +
                "实现callable接口,重写call方法";
    }
}

class ThreadTest3{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    FutureTask<String> ft =new FutureTask<>(new MyThread3());
    new Thread(ft).start();
        System.out.println(ft.get());

    }
}