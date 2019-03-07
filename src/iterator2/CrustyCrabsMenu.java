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
public class CrustyCrabsMenu implements Menu {

    ArrayList<MenuItem> menuItems;

    public CrustyCrabsMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("Crabsburger",
                "The best burger in Bikini Bottom",
                true,
                2.99);

        addItem("Hot Dog",
                "Tasty hot dog with garlic souce",
                false,
                2.99);

        addItem("Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);

    }

    public void addItem(String name, String description,
            boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

}