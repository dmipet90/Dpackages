/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

/**
 *
 * @author User
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new PhpDeveloper();
        Developer tester = new TesterPHPDeveloper(new PhpDeveloper());
        Developer manager = new ManagerPHPDeveloper(new PhpDeveloper());
        Developer support = new SupportPHPDeveloper(new PhpDeveloper());
        Developer testerManager = new ManagerPHPDeveloper(new TesterPHPDeveloper(new PhpDeveloper()));
        Developer testerManagerSupport = new SupportPHPDeveloper(new ManagerPHPDeveloper(new TesterPHPDeveloper(new PhpDeveloper())));
        
        System.out.println(developer.makeJob());
        System.out.println(tester.makeJob());
        //System.out.println(manager.makeJob());
        //System.out.println(support.makeJob());
        System.out.println(testerManager.makeJob());
        System.out.println(testerManagerSupport.makeJob());
    }
}
