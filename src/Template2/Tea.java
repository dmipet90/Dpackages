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
public class Tea extends PrepareRecipe {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding Lemon");
    }
}
