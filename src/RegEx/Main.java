/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Check IP 217.159.202.100
        System.out.println("Enter IP");
        String strIp = br.readLine();
        System.out.println(MyRegex.checkIP(strIp));  
        
        // Check Email
        System.out.println("Enter Email");
        String strEmail = br.readLine();
        System.out.println(MyRegex.checkEmail(strEmail));
        
        // Check Pass
        System.out.println("Enter password");
        String strPass = br.readLine();
        boolean result = MyRegex.checkPass(strPass);
        while (!result) {
            System.out.println("password is NOT checked");
            System.out.println("Enter new password");
            strPass = br.readLine();
            result = MyRegex.checkPass(strPass);
        }
        System.out.println("Password checked!");
    }

}
