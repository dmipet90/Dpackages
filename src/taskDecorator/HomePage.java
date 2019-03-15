/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskDecorator;


/**
 *
 * @author User
 */
public class HomePage extends WebsiteDecorator {
    public HomePage (Website website) {
        super(website);
    }
    public String implForClient() {
        return "...includes styles and scripts";
    }
    
    @Override
    public String showContent() {
        return super.showContent() + implForClient();
    }
}
