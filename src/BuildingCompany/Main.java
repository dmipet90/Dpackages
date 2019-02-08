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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Company buildingCompany = new BuildingCompany();
        Employee[] buildingCompanyWorkers = buildingCompany.getEmployees();
        buildingCompany.startWorking(buildingCompanyWorkers);
    }
    
}
