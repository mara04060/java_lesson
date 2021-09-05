package com.alphabank.work1;
import java.util.*;

public class Runner {
    public static void run() {

        // По умолчанию на 10 элементов
        int numberArrElement = 10;
        List<String> listArray = new ArrayList<>();
        for (int i=0; i<10; i++) {
            listArray.add("number_"+i);
        }

//        System.out.println(listArray);


        List<String> listLink = new LinkedList<>();
        Random random = new Random();
        for (int i=0; i<10; i++) {
            int position = random.nextInt(i+1);
            listLink.add(position, "num_"+i);
        }

//        System.out.println(listLink);
//                                                                Размер листа listLink.size()
        ListIterator<String> newlistArray = listArray.listIterator();
        int i=0;
        while (newlistArray.hasNext()) {
            listLink.add(i, newlistArray.next());
            i+=2;
        }
        System.out.println(listLink);

    }
}
