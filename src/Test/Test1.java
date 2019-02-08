/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Sergei");
//        System.out.println("Sergei");
//        System.out.println("Sergei");
//        System.out.println("------");
//
//        String name = "Sergei";
//        System.out.println(name);
//        System.out.println(name);
//        System.out.println(name);
//        System.out.println("------");
//        
//        String myName = "Sergei";
//        String myLastName = "Petrov";
//
//        System.out.print(myName + " ");
//        System.out.println(myLastName);
//        System.out.println("-------");

//        String[] persons = new String[1];
//        persons[0] = "Sergei Petrov";
//        System.out.println(Arrays.toString(persons));
//        System.out.println("-------");

//        Map<String, String> map = new HashMap<>();
//        map.put("Sergei", "Petrov");
//        System.out.println(map);
        
        
//        Map<String, String> map = new HashMap<>();
//        map.put("Sergei", "Petrov");
//        System.out.println(map);
//        
//        System.out.println("Hello!");
//        System.out.println("Bye!");

        Person myPersons = new Person("Sergei", "Petrov");
        System.out.println(myPersons.toString());
        myPersons.sayHello();
        myPersons.sayBye();
    }

}
