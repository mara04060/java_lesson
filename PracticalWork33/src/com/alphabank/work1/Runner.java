package com.alphabank.work1;

import java.util.*;

public class Runner {
    Integer[] array;
    List<String> list;


    public void run(){
//        Init Array
        arrayInt(20);
        System.out.println( Arrays.toString(array) );
//        sortByInteger(array);
//        или через Лямбда выражение
//       Arrays.sort(array, (a, b)->(b-a) );
//       или через встроенный
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println( Arrays.toString(array) );

//        Init List String
        listString(10);
        System.out.println( list );
//        Класический метод
        Collections.sort(list, (String l1, String l2) -> {
            return -(l1.compareTo(l2)); });
//        Через компоратор
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println( list );
    }

    private int generateArray(){
        return 50 - ( new Random().nextInt(100));
    }

    private void arrayInt(int size){
        this.array = new Integer[size];
        for (int i=0; i<size; i++) {
            this.array[i] = generateArray();
        }
    }

///       как вариант:Генератор случайных чисел до 50
//        list.add(Integer.toString(random.nextInt(50)));

    private void sortByInteger(Integer[] arrays){
//        Сортировка от большего к меньшему
        Arrays.sort(arrays, (a, b) ->  b - a );
    }

    private void listString(int size){
        this.list = new ArrayList<>(size);
        for (int i=0; i< size; i++){
            int randomInt = new Random().nextInt(size+100);
            this.list.add(""+randomInt+"_Element");
        }
    }

    private void sortByString(List<String> lists){
        Collections.sort(lists, (String l1, String l2) -> {
            return -(l1.compareTo(l2)); });
    }



//    @Override
    public String toIntString() {
        StringBuilder text = new StringBuilder("MyArray {");

        for (int i=0; i< array.length; i++) {
            text.append(array[i]);
            if ( i != array.length-1 ) {
                text.append(", ");
            }
        }
        return text.toString().trim() + "}";
    }


    private String toListString() {
        StringBuilder text = new StringBuilder("MyList [" );

        for (int i=0; i< list.size(); i++) {
            text.append(list.get(i));
            if ( i != list.size()-1 ) {
                text.append(", ");
            }
        }
        return text.toString().trim() + "]";
    }

}
