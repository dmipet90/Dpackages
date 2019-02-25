/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade1;

import Facade0.*;

/**
 *
 * @author User
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is working on project...");
        } else {
            System.out.println("Developer is reading Oracle docs...");
        }
    }
}
