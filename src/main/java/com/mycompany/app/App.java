package com.mycompany.app;

import org.joda.time.DateTime;
import java.util.ArrayList;


public class App 
{
    public static void main( String[] args )
    {


        DateTime courseStart = new DateTime(2020, 01, 02, 20, 12);
        DateTime courseEnd = new DateTime(2020, 12, 30, 20, 12);
        Course course0 = new Course("CSIT", courseStart, courseEnd);

        Module module0 = new Module("Software Enginering III", "CT417");

        DateTime studentDob = new DateTime(2020, 01, 02, 20, 12);
        Student student0 = new Student("Jack Lynch", 22, studentDob, 17370591,  "jlynch25");


        Module module1 = new Module("Final Year Project", "CT413");

        studentDob = new DateTime(2000, 01, 02, 20, 12);
        Student student1 = new Student("nick sam", 22, studentDob, 25239316,  "nick");


        courseStart = new DateTime(1910, 02, 02, 20, 15);
        courseEnd = new DateTime(1920, 06, 30, 10, 6);
        Course course1 = new Course("BCS", courseStart, courseEnd);

        Module module2 = new Module("Machine Learning", "CT4101");

        studentDob = new DateTime(1998, 01, 02, 20, 12);
        Student student2 = new Student("steve man", 22, studentDob, 25239316,  "waz");

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course0);
        courses.add(course1);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student0);
        students.add(student1);
        students.add(student2);

//  This could be done far better

        course0.addModule(module0);
        course0.addModule(module1);
        module0.addCourse(course0);
        module1.addCourse(course0);

        course0.addStudent(student0);
        course0.addStudent(student1);
        student0.addCourse(course0);
        student1.addCourse(course0);

        module0.addStudent(student0);
        student0.addModule(module0);
        module1.addStudent(student0);
        student1.addModule(module0);
        module0.addStudent(student1);
        student0.addModule(module1);
        module1.addStudent(student1);
        student1.addModule(module1);


        course1.addModule(module2);
        module2.addCourse(course1);

        course1.addStudent(student2);
        student2.addCourse(course1);

        module2.addStudent(student2);
        student2.addModule(module2);

        System.out.println( "\n\nCourses: ");

        for (Course course : courses) {
            System.out.println( "\nCourse name: " +course.getName());
            
            System.out.println( "Modules: " );
            for (Module module : course.getModules()) {
                System.out.print("name: " +module.getName()+ "\n");
            }

            System.out.println( "Student: ");
            for (Student student : course.getStudents() ) {
                System.out.print("name: " +student.getName()+ ", nickname: " +student.getUsername()+ "\n");
            }

        }
        

        System.out.println( "\n\nStudents: ");

        for (Student student : students) {
            System.out.println( "\nStudent name: " +student.getName());
            
            System.out.println( "Modules: " );
            for (Module module : student.getModules()) {
                System.out.print("name: " +module.getName()+ "\n");
            }

            System.out.println( "Student: ");
            for (Course course : student.getCourses() ) {
                System.out.print("name: " +course.getName()+ "\n");
            }

        }
    }
}
