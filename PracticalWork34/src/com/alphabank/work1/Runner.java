package com.alphabank.work1;

public class Runner {
    public void run() {
//        new MyTimeBomb_1().start();
//        new Thread(new MyTimeBomb_2()).start();
//        System.out.println("main ended");

        new Thread( () -> {
            for (int i = 10; i > 0 ; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
//                    Имя очереди (но она увы одна)
//                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException exp) { }
            }
            System.out.println("BoomBoom!\n Thread on Run");

        }).start();
    }
}
