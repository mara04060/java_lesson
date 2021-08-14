package com.alphabank.work3;

import java.util.Scanner;

public class Runner {

    private String day;
    private String station;

    public void run(){

        Train train = new Train(5);
        TrainSchedule trainSchedule = new TrainSchedule(5);

        System.out.println(" Пустых элементов = " + trainSchedule.getTrains().length);

        train.setStationArrival("NewStation");
        train.setStationDispatch("MoveStation");
        train.setTimeArrival(Train.days.WEDNESDAY.toString());
        trainSchedule.addTrain(train);

        Train train2 = new Train(12);
        train2.setStationArrival("NewStation");
        train2.setStationDispatch("MoveStation");
        train2.setTimeArrival(Train.days.MONDAY.toString());
        trainSchedule.addTrain(train2);

        Train train3 = new Train(109);
        train3.setStationArrival("EndStation");
        train3.setStationDispatch("StartStation");
        train3.setTimeArrival(Train.days.SUNDAY.toString());
        trainSchedule.addTrain(train3);


        Train train4 = new Train(83);
        train4.setStationArrival("EndStation");
        train4.setStationDispatch("StartStation");
        train4.setTimeArrival(Train.days.SUNDAY.toString());
        trainSchedule.addTrain(train4);

        Train train5 = new Train(223);
        train5.setStationArrival("EndStation");
        train5.setStationDispatch("StartStation");
        train5.setTimeArrival(Train.days.WEDNESDAY.toString());
        trainSchedule.addTrain(train5);
        System.out.println("--- ArrIndex ="+train.getNumber());

//          6 Элемент не даст создать - выкинет исключение!!!
//          Но мы это проигнорим и вообще не создадим обьект более положенного
        Train train6 = new Train(121);
        train6.setStationArrival("EndStation");
        train6.setStationDispatch("StartStation");
        train6.setTimeArrival(Train.days.THURSDAY.toString());
        trainSchedule.addTrain(train6);

        trainSchedule.printAllTrains();

        Scanner scanner = new Scanner(System.in);
        station = inpText("Конечную станцию", scanner);
        day = inpText("День недели", scanner);

        System.out.println("Search Train in " + day + " Station = "+station);
        System.out.println("--------------------------------");
        Train[] searchTrain = trainSchedule.searchTrains(station, day);

        if( searchTrain[0]!=null ) {
            System.out.println("---"+ANSI_GREEN+"Найдены поезда :"+ANSI_RESET+"---------");
            trainSchedule.printTrains(searchTrain);
        } else {
            System.out.println("---"+ANSI_RED+"Нет найденных составов :"+ANSI_RESET+"---------");
        }


    }

    public String inpText(String text, Scanner scanner){
        System.out.println(" Введите "+text+ " :");
        return scanner.nextLine();
    }

    /*
Изменить расцветку консоли, выделить найденные элементы
*/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

}
