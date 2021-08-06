package com.alphabank.work1;

public class Runner {
    public static void run(){
//        Device device = new Device("EtT-45694769235", "ASUS", 198.30);
////        System.out.println(device.toString());
//        System.out.println(device);
//        Monitor monitor = new Monitor("SFX-0987323", "SAMSUNG", 200.0, 1080, 1920);
////        System.out.println(monitor.toString());
//        System.out.println(monitor);
//        EthernetAdapter ethernetAdapter = new EthernetAdapter("Atheros-FG093456", "Atheros", 12.9, 100, "FC:DF:CF:09:81:67");
//        System.out.println(ethernetAdapter);

        Device[] arrDevice = {
                new Device("EtT-45694769235", "ASUS", 199.30),
                new Device("SA-4569LF567085675", "SAMSUNG", 201.00),
                new Device("EtT-45694769235", "ASUS", 198.30),
                new Monitor("LS-098FDA-123423", "LG", 200.0, 1080, 1920),
                new Monitor("SFX-0987323", "SAMSUNG", 209.0, 1080, 1920),
                new Monitor("LS-098FDA-123423", "LG", 220.0, 1080, 1920),
                new Monitor("LK-004560546-000498", "LG", 210.0, 1080, 1920),
                new EthernetAdapter("Atheros-FG093456", "Atheros", 12.9, 100, "FC:DF:CF:09:81:67"),
                new EthernetAdapter("KLY-FG093456", "Mastec", 15.9, 100, "AF:0F:CF:09:76:58"),
                new EthernetAdapter("KFC-FGGJF56", "DRAGON", 18.9, 100, "0F:0F:C0:10:84:47")
        };


        for (Device d: arrDevice) {
            System.out.println(d +" " + d.hashCode());
        }

    }

}
