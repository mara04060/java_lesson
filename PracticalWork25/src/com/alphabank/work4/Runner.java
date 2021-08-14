package com.alphabank.work4;

public class Runner {

    public void run(){
        Integer smallA = new Integer(127);
        Integer smallB = 127;
        Integer smallC = smallB;
        Integer smallD = Integer.valueOf("127");

        Integer bigA = new Integer( 128);
        Integer bigB = 128;
        Integer bigC = bigA;
        Integer bigD = new Integer("128");


        System.out.println(" " + smallA +" == "+smallB+" => " + (smallA == smallB) );
        System.out.println(" " + smallA +" == "+smallC+" => " + (smallA == smallC) );
        System.out.println(" " + smallA +" == "+smallD+" => " + (smallA == smallD) );
        System.out.println(" " + smallB +" == "+smallC+" => " + (smallB == smallC) );
        System.out.println(" " + smallB +" == "+smallD+" => " + (smallB == smallD) );
        System.out.println(" " + smallD +" == "+smallC+" => " + (smallD == smallC) );
        System.out.println("--------------------");
        System.out.println(" " + smallA +" equils "+smallB+" => " + smallA.equals(smallB) );
        System.out.println(" " + smallA +" equils "+smallC+" => " + smallA.equals(smallC) );
        System.out.println(" " + smallA +" equils "+smallD+" => " + smallA.equals(smallD) );
        System.out.println(" " + smallB +" equils "+smallC+" => " + smallB.equals(smallC) );
        System.out.println(" " + smallB +" equils "+smallD+" => " + smallB.equals(smallD) );
        System.out.println(" " + smallC +" equils "+smallD+" => " + smallC.equals(smallD) );
        System.out.println("--------------------");
        System.out.println(" " + bigA +" == "+bigB+" => " + (bigA == bigB) );
        System.out.println(" " + bigA +" == "+bigC+" => " + (bigA == bigC) );
        System.out.println(" " + bigA +" == "+bigD+" => " + (bigA == bigD) );
        System.out.println(" " + bigB +" == "+bigC+" => " + (bigB == bigC) );
        System.out.println(" " + bigB +" == "+bigD+" => " + (bigB == bigD) );
        System.out.println(" " + bigD +" == "+bigC+" => " + (bigD == bigC) );
        System.out.println("--------------------");
        System.out.println(" " + bigA +" equils "+bigB+" => " + bigA.equals(bigB) );
        System.out.println(" " + bigA +" equils "+bigC+" => " + bigA.equals(bigC) );
        System.out.println(" " + bigA +" equils "+bigD+" => " + bigA.equals(bigD) );
        System.out.println(" " + bigB +" equils "+bigC+" => " + bigB.equals(bigC) );
        System.out.println(" " + bigB +" equils "+bigD+" => " + bigB.equals(bigD) );
        System.out.println(" " + bigC +" equils "+bigD+" => " + bigC.equals(bigD) );
    }

    public Double summa(Integer i, Float f) {
        Double aa  = i.doubleValue();
        double bb = f.doubleValue();
        return new Double( aa+bb);
    }
}
