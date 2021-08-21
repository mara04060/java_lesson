package com.alphabank.work3;

public class TrainSchedule {
    private Train[] trains;
    private int indexArr = 0;

    public TrainSchedule(int amount) {
        this.trains = new Train[amount];
    }

    public Train[] getTrains() {
        return trains;
    }

    public int getIndexArr(){
        return indexArr;
    }

    public void addTrain(Train train){
        if( indexArr < trains.length ) {
            this.trains[indexArr++] = train;
        }
    }

    public void printAllTrains() {
        for (Train train: this.trains) {
            System.out.println(train);
        }
    }

    public void printTrains(Train[] trains) {
        for (Train train: trains) {
            if(train!=null) System.out.println(train);
        }
    }

    public Train[] searchTrains(String station, DaysOfWeek day) {
        int i =0;
        Train[] searchTrain = new Train[indexArr];

        for (Train train: this.trains) {
            if(train != null &&
                    train.getStationArrival().equals(station)
                    && train.searchDay(day) ) {
                searchTrain[i++] = train;
            }
        }
        return searchTrain;
    }




}
