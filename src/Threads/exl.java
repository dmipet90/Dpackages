/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author User
 */
public class exl {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread();
        
        thread.start();
        
        System.out.println(thread.getName());
    }
}
