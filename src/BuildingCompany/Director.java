/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingCompany;

/**
 *
 * @author User
 */
public class Director implements Employee{

    @Override
    public void doWork() {
        System.out.println("I'm director. I'm the header of the company!");
    }
    
}
