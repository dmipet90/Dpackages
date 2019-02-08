/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Lesson6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern reg = Pattern.compile("(?<=(^|;)).*?(?=(;|$|\\r\\n))");
        Matcher str = reg.matcher("Lorem ipsum;dolor sit amet;consectetur adipiscing elit;");
        while (str.find()) {
                System.out.println(str.group());
        }
    }
    
}
