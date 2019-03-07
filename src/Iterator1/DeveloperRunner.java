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
        String[] phpSkills = {"PHP", "MySQL", "Laravel", "CodeIgniter", "Symfony", "CakePHP"};

        Developer javaDeveloper = new Developer("Nikolai Smirnov", javaSkills);
        Developer phpDeveloper = new Developer("Ivan Ivanov", phpSkills);
        Iterator iterator = javaDeveloper.getIterator();
        Iterator iterator2 = phpDeveloper.getIterator();
        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }

        System.out.println("\n==============================================\n");
        System.out.println("Developer " + phpDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next().toString() + " ");
        }
    }
}
