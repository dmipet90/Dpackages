/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CleaningFactory;

/**
 *
 * @author User
 */
public class CleaningCompany extends Company{
    
    @Override
    Employee[] getEmployees(){
        System.out.println("");
        System.out.println("Starting company activity " +CleaningCompany.class.getSimpleName() + "\n");
        Employee[] employee = new Employee[4];
        for (int i = 1; i < employee.length; i++){
            employee[0] = new Manager();
            employee[i] = new Cleaner();
        }
        return employee;
    }
}
