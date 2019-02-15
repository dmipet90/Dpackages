/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Bankomat3 {

    static int money = 100;
    static Object key = new Object();

    static void getMoney(int amount) {
        synchronized (key) {
            if (amount <= money) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Bankomat3.class.getName()).log(Level.SEVERE, null, ex);
                }
                money -= amount;
                System.out.println("Congrat! new amount: " + money);
            } else {
                System.err.println("Not enough money!");
            }
        }
        System.out.println("...done...");
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Vasya: ");
            Bankomat3.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Petya: ");
            Bankomat3.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Gavrilla: ");
            Bankomat3.getMoney(50);
        }).start();
    }

}
