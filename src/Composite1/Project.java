/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite1;

/**
 *
 * @author ivkhk
 */
public class Project {

    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDeveloper = new JavaDeveloper();
        Developer phpDeveloper = new PhpDeveloper();
        Developer cPlusPlusDeveloper = new CPlusPlusDeveloper();
        Developer pythonDeveloper = new PythonDeveloper();

        team.addDeveloper(javaDeveloper);
        team.addDeveloper(phpDeveloper);
        team.addDeveloper(cPlusPlusDeveloper);
        team.addDeveloper(pythonDeveloper);

        team.createProject();

    }
}
