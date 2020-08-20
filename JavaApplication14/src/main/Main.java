/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Student;
import java.util.Scanner;
import util.InputUtil;
import util.MenuUtil;
import util.StudentUtil;

/**
 *
 * @author apple
 */
public class Main {

    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requiredNumber("What do you want to do?"
                    + "\n1.Register student"
                    + "\n2.Show all students"
                    + "\n3.Search student"
                    + "\n4.Update student"
                    + "\n5.Exit");
            MenuUtil.processMenu(menu);
        }

    }
}
