/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class TestMassive {
    public static void main (String[] args){
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = i;
        }
        System.out.println(Arrays.toString(x));
    }
}
