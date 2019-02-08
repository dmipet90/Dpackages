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
public class BuildingCompany extends Company{
    
    @Override
    Employee[] getEmployees(){
        System.out.println("");
        System.out.println("Starting company activity " +BuildingCompany.class.getSimpleName() + "\n");
        Employee[] employee = new Employee[13];
        for (int i = 0; i < employee.length; i++){
            employee[i] = new Builder();
        }
        employee[10] = new Electric();
        employee[11] = new Master();
        employee[12] = new Director();
        return employee;
    }
}
