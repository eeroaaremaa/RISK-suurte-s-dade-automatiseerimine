/**
 *  LAUAMÄNG RISK SUURTE SÕDADE PIDAMISE AUTOMATISEERIMINE
 *
 *  Eero Ääremaa
 *
 */

import java.util.Random;
import java.util.Scanner;

public class Peamine {

    public static void main(String[] args) {

        // ALgväärtuste andmine
        System.out.println("Ründaja: ");
        Scanner ryndajaScanner = new Scanner(System.in);
        int ryndajaAlg = ryndajaScanner.nextInt();

        System.out.println("Kaitsja: ");
        Scanner kaitsjaScanner = new Scanner(System.in);
        int kaitsjaAlg = kaitsjaScanner.nextInt();


        /**
         * kaitsjaMax -> Kaitsja maksimaalne täringuvise
         * ryndajaMax - > Ründaja ---II---
         * vise -> iga individuaalne vise
         */
        int kaitsjaMax = 0;
        int ryndajaMax = 0;
        int vise = 0;

        Random random = new Random();

        // Peamine loop
        while(kaitsjaAlg > 0 && ryndajaAlg > 0){

            // Kaitsja visked
            for (int i = 0; i < 2; i++) {
                vise = random.nextInt(6) + 1;
                if(vise > kaitsjaMax){
                    kaitsjaMax = vise;
                }
            }

            // Ründaja visked
            for (int i = 0; i < 3; i++) {
                vise = random.nextInt(6) + 1;
                if(vise > ryndajaMax){
                    ryndajaMax = vise;
                }
            }


            // Kontrollime kumb sai suurema
            // Kui kaitsja sai vähemalt sama palju või suurema siis kaitsja võidab

            if(kaitsjaMax >= ryndajaMax){
                ryndajaAlg-=1;
            }else{
                //System.out.println("Ründaja võit");
                kaitsjaAlg-=1;
            }

            kaitsjaMax = 0;
            ryndajaMax = 0;
        }

        System.out.println("Ründajal alles: " + ryndajaAlg);
        System.out.println("Kaitsjal alles: " + kaitsjaAlg);
    }
}
