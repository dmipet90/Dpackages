/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Test2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sergei", "Petrov"));
        persons.add(new Person("Alexey", "Smirnov"));
        persons.add(new Person("Petr", "Green"));
        
        for (Person person : persons) {
            person.sayHello();
            person.sayBye();
        }
    }
}
