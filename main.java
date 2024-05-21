//! esercizio 1 

//Scrivi un programma Java per stampare numeri da 1 a 100 che sono divisibili per 3, 5 ed entrambi

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        for (int i = 1; i<100; i++){
            if(i % 3 == 0 ){
                System.out.println("i numeri divisibili per 3 sono: " + i );
            }

            if(i % 5 == 0){
                System.out.println("i numeri divisibili per 5 sono: " + i);
            }

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("i numeri divisibili per entrambi sono: " + i);
            }
        }
    }
}