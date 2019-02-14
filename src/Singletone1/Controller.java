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
public class Controller {

    public static void main(String[] args) {
        Boiler0 boiler = Boiler0.getInstance();
        Boiler0 boiler2 = Boiler0.getInstance();
        Boiler0 boiler3 = Boiler0.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
