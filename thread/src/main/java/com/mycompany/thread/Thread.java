/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.thread;

import java.util.Scanner;
public class Thread {

    public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
System.out.print("Inserisci n: ");
int n = scanner.nextInt();
System.out.print("Inserisci k: ");
int k = scanner.nextInt();

    Fattoriale t1 = new Fattoriale(n);
    Fattoriale t2 = new Fattoriale(k);
    Fattoriale t3 = new Fattoriale(n-k);

    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();

    int fattN = t1.getVal();
    int fattK = t2.getVal();
    int fattNK = t3.getVal();

    double risultato = (double) fattN / (double) (fattK * fattNK);

    System.out.printf("Il risultato è %.2f", risultato);
}

    }

