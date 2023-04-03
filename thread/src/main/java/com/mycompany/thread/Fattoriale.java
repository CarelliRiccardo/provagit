/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thread;



class Fattoriale extends Thread {
private int val;

public Fattoriale(int val) {
    this.val = val;
}

public int getVal() {
    return val;
}

public void run() {
    int result = 1;
    for (int i = 1; i <= val; i++) {
        result *= i;
    }
    val = result;
}
}



