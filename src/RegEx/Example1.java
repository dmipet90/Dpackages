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
public class Example1 {
    public static boolean checkText (String str) {
        Pattern pattern = Pattern.compile("^Java$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    
    public static boolean checkText2 (String str) {
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
        System.out.println(checkText("Java"));
        System.out.println(checkText2(""));
        String a = "Выхожу адин я на дорогу";
        System.out.println(a.replaceAll("[ао]дин", "вдвоём"));
                
    }
}
