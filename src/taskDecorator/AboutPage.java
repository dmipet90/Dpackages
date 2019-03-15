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
public class AboutPage extends WebsiteDecorator {

    public AboutPage(Website website) {
        super(website);
    }

    public String showAbout() {
        return "...shows paragraphs...";
    }

    @Override
    public String showContent() {
        return super.showContent() + showAbout();
    }
}
