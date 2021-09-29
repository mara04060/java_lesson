package com.alphabank.work3;



public class Runner {
    public void run() throws InterruptedException {

        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        for (int i = 1; i <= 1000; i++) {
            Thread threadCounter = new Thread(counter);
            threadCounter.start();
            Thread printTheard = new Thread(printer);

            synchronized (threadCounter){
                threadCounter.join(); // Обьединяю поток счетчика
                printTheard.start();  // Запускаю поток печати
                printTheard.join();   // Обьединяю поток печати
            }
        }

    }


}
