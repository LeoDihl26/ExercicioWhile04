package com.mycompany.exerciciowhile04;

import java.util.Scanner;

public class ExercicioWhile04 {

    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
      System.out.printf("TABUADA DO ");
      int x = teclado.nextInt();
      while (x != 0){
          System.out.printf("\n%d * 1 = %d \n", x, x * 1); 
          System.out.printf("%d * 2 = %d \n", x, x * 2);
          System.out.printf("%d * 3 = %d \n", x, x * 3);
          System.out.printf("%d * 4 = %d \n", x, x * 4);
          System.out.printf("%d * 5 = %d \n", x, x * 5);
          System.out.printf("%d * 6 = %d \n", x, x * 6);
          System.out.printf("%d * 7 = %d \n", x, x * 7);
          System.out.printf("%d * 8 = %d \n", x, x * 8);
          System.out.printf("%d * 9 = %d \n", x, x * 9);
          System.out.printf("%d * 10= %d \n", x, x * 10);
          break;
        } 
          teclado.close();{}  
          System.out.printf("\nEssa é a tabuada do %d.", x); 
    }
}
