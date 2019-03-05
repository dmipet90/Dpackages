/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template2;

/**
 *
 * @author user
 */
public class Cofee extends PrepareRecipe {


    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    
    @Override
    public void addIngredients() {
        System.out.println("Adding Sugar and Milk");
    }

}
