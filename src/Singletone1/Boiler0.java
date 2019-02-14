/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone1;

/**
 *
 * @author User
 */
public class Boiler0 {

    public static Boiler0 uniqueInstance;
    private boolean empty;
    private boolean boiled;

    public static Boiler0 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Boiler0();
            System.out.println("new Boiler created");
        } else
        System.out.println("Can't create new boiler");
        return uniqueInstance;
    }

    private Boiler0() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;

            System.out.println("Boiler is filled");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Boiler is empty");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("boiling...");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
