/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testFactory3;

import FactoryMethodWithArray.Employee;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Company gameCompany = new GameDevCompany();
        Employee[] computerWorkers = gameCompany.getEmployees();
        gameCompany.startWorking(computerWorkers);
    }
    
}
