/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String regex = "^([4-6][0-9][0-9])$";
        Pattern pattern = Pattern.compile(regex);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 400-699");
        String str = br.readLine();
        boolean result = pattern.matcher(str).matches();
        while (!result) {
            System.out.println("Wrong Number");
            System.out.println("Enter number 400-699");
            str = br.readLine();
            result = pattern.matcher(str).matches();
        }
        System.out.println("Bingo!");
    }
}
