import file.Declar;
import file.Stax;
import file.StaxWrite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(" Введите название файла @F0xxxxx :");
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        Stax staxExample = new Stax();
        Declar readXML = staxExample.readConfig(".\\" + file);
        StaxWrite configFile = new StaxWrite();
        configFile.setFile(".\\" + readXML.getDeclarBody().getcDocFName().replace("F0", "F1"));
        configFile.setDeclar(readXML);

        try {
            configFile.saveF1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        configFile.setFile(".\\" + readXML.getDeclarBody().getcDocFName().replace("F0", "F2"));
        configFile.setDeclar(readXML);

        try {
            configFile.saveF2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        configFile.setFile(".\\" + readXML.getDeclarBody().getcDocFName().replace("F0", "R0"));
        configFile.setDeclar(readXML);

        try {
            configFile.saveR1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
