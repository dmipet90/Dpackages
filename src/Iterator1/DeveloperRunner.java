/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator1;

/**
 *
 * @author user
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        String[] javaSkills = {"Java basic", "Spring", "Hibernate", "Maven", "PosgreSQL", "Docker"};
        
        Developer javaDeveloper = new Developer("Nikolai Smirnov", javaSkills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("Skills: ");
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
