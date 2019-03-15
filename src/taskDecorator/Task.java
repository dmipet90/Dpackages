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
public class Task {
    public static void main(String[] args) {
        Website page = new WebPage();
        Website home = new HomePage(new WebPage());
        Website about = new AboutPage(new HomePage(new WebPage()));
        Website contact = new ContactPage(new AboutPage(new HomePage(new WebPage())));

        System.out.println(page.showContent());
        System.out.println(home.showContent());
        System.out.println(about.showContent());
        System.out.println(contact.showContent());

    }
}
