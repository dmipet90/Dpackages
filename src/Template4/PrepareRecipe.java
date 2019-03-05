/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template4;

import Template2.*;

/**
 *
 * @author user
 */
public abstract class PrepareRecipe {

    final void showRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsIngridients()){
            addIngredients();
        };
    }

    public abstract void brew();

    public abstract void addIngredients();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    boolean customerWantsIngridients(){
        return true;
    }
}
