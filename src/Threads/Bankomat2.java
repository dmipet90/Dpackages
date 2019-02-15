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
public class Bankomat2 {

    static int money = 100;

    synchronized static void getMoney(int amount) {
        if (amount <= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bankomat2.class.getName()).log(Level.SEVERE, null, ex);
            }
            money -= amount;
            System.out.println("Congrat! new amount: " + money);
        } else {
            System.err.println("Not enough money!");
        }
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Vasya: ");
            Bankomat2.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Petya: ");
            Bankomat2.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Gavrilla: ");
            Bankomat2.getMoney(50);
        }).start();
    }

}
