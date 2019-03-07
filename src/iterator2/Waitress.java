/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ivkhk
 */
public class Waitress {
   ArrayList<Menu> menus;
   
   public Waitress(ArrayList<Menu> menus) {
       this.menus = menus;
   }
   
   public void printMenu() {
       Iterator<?> menuIterator = menus.iterator();
       while (menuIterator.hasNext()) {
           Menu menu = (Menu)menuIterator.next();
           printMenu(menu.createIterator());
           
       }
   }
   
   void printMenu(Iterator<?> iterator){
       while (iterator.hasNext()) {
           MenuItem menuItem = (MenuItem)iterator.next();
           System.out.println(menuItem.getName() + ", ");
           System.out.println(menuItem.getPrice() + " -- ");
           System.out.println(menuItem.getDescription());
       }
   }
}
