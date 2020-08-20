/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author apple
 */
public class MenuUtil {

    public static void processMenu(int select_menu) {
        switch (select_menu) {
            case 1:
                StudentUtil.registerStudents();
                break;
            case 2:
                StudentUtil.ShowAllRegisteredStudents();
                break;
            case 3:
                StudentUtil.findStudentsAndPrint();
                break;
            case 4:
                StudentUtil.updateStudents();
                break;
            case 5:
                System.exit(0);
              
            default:
                break;
        }
    }
}
