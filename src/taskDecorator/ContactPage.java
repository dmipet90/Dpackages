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
public class ContactPage extends WebsiteDecorator{
    public ContactPage(Website website) {
        super(website);
    }
    
    public String showContact() {
        return "...comunicate with user...";
    }
    
    @Override
    public String showContent() {
        return super.showContent() + showContact();
    }
}
