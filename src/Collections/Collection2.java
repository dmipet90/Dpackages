/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class Collection2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        measureTime(arrayList, "Array List: ");
        measureTime(linkedList, "Linked list: ");
    }
    
    private static void measureTime(List<Integer> list, String describe) {
        // add method
        long start = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            list.add(i);
            //list.add(0, i);
        }
        
        long end = System.currentTimeMillis();
        System.out.println(describe);
        System.out.println("");
        System.out.println("add method difference:  " + (end - start) + " mileseconds");
        
        // get method
        
        long start2 = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        
        long end2 = System.currentTimeMillis();
        System.out.println("get method difference:  " + (end2 - start2) + " mileseconds");
        System.out.println("");
    }
}
