//! esercizio 1 

//Scrivi un programma Java per stampare numeri da 1 a 100 che sono divisibili per 3, 5 ed entrambi

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         for (int i = 1; i < 100; i++) {
//             if (i % 3 == 0) {
//                 System.out.println("i numeri divisibili per 3 sono: " + i);
//             }

//             if (i % 5 == 0) {
//                 System.out.println("i numeri divisibili per 5 sono: " + i);
//             }

//             if (i % 3 == 0 && i % 5 == 0) {
//                 System.out.println("i numeri divisibili per entrambi sono: " + i);
//             }
//         }
//     }
// }

//!esercizio 2

//scrivere un programma Java per trovare tutte le terzine uniche in modo tale che la somma di tutti e tre gli elementi 
// [x, y, z (x<= y <=z)] sia ugusale a numero specificato 

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("inserisci numero");
    int num = scan.nextInt();

    for(int i = 0; i<num;i++){
        for (int y = i+1; y<num; y++) {
            for(int z = y+1; z < num; z++){
                if(i+y+z == num){
                    System.out.println(i+ "+" + y+ "+" + z + "=" + num);
                }
            }
            
        }
    }


    }
}