package com.alphabank.work3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public void run(){
        List<String> list = Arrays.asList("qwerty", "abraCadabRa", "xyz", "     ", "WORD");
//        list = updateList(list, str -> {
//            if (MyConverter.isNull(str)) {
//                return str;
//            }
//            return str.toUpperCase();
//        });
//        System.out.println(list);
//
//        list = updateList(list, str -> {
//            if (MyConverter.isNull(str)) {
//                return str;
//            }
//            return str.toLowerCase();
//        });
//        System.out.println(list);

//      Все тоже но стримами
        list = list.stream().map( ss -> ss.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);
    }

    public List<String> updateList(List<String> list, MyConverter converter) {
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            str = converter.convertStr(str);
            newList.add(str);
        }
        return newList;
    }
}
