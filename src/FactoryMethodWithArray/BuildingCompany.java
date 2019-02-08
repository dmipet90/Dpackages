/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodWithArray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class BuildingCompany extends Company{

    @Override
    List getEmployees(){
        System.out.println("");
        System.out.println("Starting company activity " +BuildingCompany.class.getSimpleName() + "\n" );
        List employee = new ArrayList();
        for (int i = 0; i < 10; i++){
            employee.add(new Builder());
        }
        employee.add(new Electric());
        employee.add(new Master());
        employee.add(new Director());
        
        return employee;
    }
}
