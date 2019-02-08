/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Test3 {
    public static void main(String[] args) {
        Map<Integer, Person> persons = new HashMap<>();
        persons.put(121212, new Person("Sergei", "Petrov"));
        persons.put(232323, new Person("Alexey", "Smirnov"));
        persons.put(343434, new Person("Petr", "Green"));
        
        for (Map.Entry<Integer, Person> entry: persons.entrySet()) {
            entry.getValue().sayHello();
            entry.getValue().sayBye();
        }
    }
}
