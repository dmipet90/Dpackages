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
public class WebPage implements Website{
    @Override
    public String showContent() {
        return "Shows website content";
    }
}
