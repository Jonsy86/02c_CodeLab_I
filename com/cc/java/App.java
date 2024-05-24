package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
<<<<<<< HEAD














=======
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        output("Konto1: " + konto1.getKontostand());
        output("Konto2: " + konto2.getKontostand());
        output("Konto3: " + konto3.getKontostand());  
        
        output("-----------------------------");

        konto1.setKontostand(konto1.getKontostand()*2);
        konto2.setKontostand(konto2.getKontostand()*3);
        konto3.setKontostand(konto3.getKontostand()*10);

        output("Konto1: " + konto1.getKontostand());
        output("Konto2: " + konto2.getKontostand());
        output("Konto3: " + konto3.getKontostand());  
>>>>>>> b65b5cb44198ee2b89fec3ecec026c78dd85f370
    }


    public static void output(String outputStr) {
        System.out.println(outputStr);
    } 


}

