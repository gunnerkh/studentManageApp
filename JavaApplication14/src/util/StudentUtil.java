/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Student;
import main.Config;

/**
 *
 * @author apple
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requiredText("enter name");
        String surname = InputUtil.requiredText("enter surname");
        String className = InputUtil.requiredText("enter classname");
        int age = InputUtil.requiredNumber("enter age");
        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void ShowAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        System.out.println("Student list\n1");
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i+1+".")+ st.getFullListInfo());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requiredNumber("How many students will you register?");
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".register");
            Config.students[i] = StudentUtil.fillStudent();

        }
        System.out.println("Registration compeleted succesfully. ");
        StudentUtil.ShowAllRegisteredStudents();
    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requiredText("type name,surname or classname.");
       Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullListInfo());
            
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i<Config.students.length ; i++) {
            Student st;
            st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }

        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i<Config.students.length ; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found++] = st;
            }

        }
        return result;
    }
    public static void updateStudents(){
     StudentUtil.ShowAllRegisteredStudents();
             int i=   InputUtil.requiredNumber("What number of student you would like to update?");
                System.out.println("Enter new data");
                Student s=StudentUtil.fillStudent();
                Config.students[i-1]=s;
                        
                   
            
    }

}
