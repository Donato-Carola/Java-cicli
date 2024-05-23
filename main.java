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

// import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);

//     System.out.println("inserisci numero");
//     int num = scan.nextInt();

//     for(int i = 0; i<num;i++){
//         for (int y = i+1; y<num; y++) {
//             for(int z = y+1; z < num; z++){
//                 if(i+y+z == num){
//                     System.out.println(i+ "+" + y+ "+" + z + "=" + num);
//                 }
//             }
            
//         }
//     }


//     }
// }

//!esercizio 3

//Scrivere un programma in Java per visualizzare il modello come un triangolo ad angolo retto con un numero
// import java.util.Scanner;


// public class main {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("inserisci numero");
//         int num= scan.nextInt();

//         for(int i = 1; i<=num;i++){
//             for(int j = 1; j<=i; j++)
//             System.out.print(j);
//          System.out.println();

//         }
    
//     }
// }

//!esercizio 4

//scrivere un programma Java per visualizzare la struttura del rombo numerico
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci numero");
        int num = 7;

        for(int i = 1; i<= num;i++){
            for(int j = i; j>0; j--){
                 System.out.print(j);
            }
            for(int k = 2; k<=i; k++){
                System.out.print(k);
           }
           System.out.println("");
        }
        for(int i = num-1; i>0;i--){
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            for(int k = 2; k<=i; k++){
                System.out.print(k);
           }
           System.out.println("");
        }



    
    }
}