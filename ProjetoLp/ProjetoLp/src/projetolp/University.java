/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetolp;

import java.util.ArrayList;

/**
 *
 * @author nalva
 */
public class University {
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Registration> registrations;
    
    public University(String name){
        this.name=name; 
    }
    public void addCourse(String code, String title, int numCredits, int maxStudents){
        courses.add(new Course(code, title, numCredits, maxStudents));
    }
//    public Course updateCourse(String code, String title, int numCredits, int maxStudents){   
//    }
    public void addUnderGraduateStudent(long ID, String name, String address, String phone, String email, String major,String minor){
       students.add(new UnderGraduateStudent(ID,name,address,phone,email,major,minor));
        
    }
//    public UnderGraduateStudent updateUnderGraduateStudent(long ID, String name, String address, String phone, String email, String major,String minor){
//        
//    }
    public void addPostGraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle,String supervisor){
         students.add(new PostGraduateStudent(ID,name,address,phone,email,thesisTitle,supervisor));
    }
//    public PostGraduateStudent updatePostGraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle,String supervisor){
//        
//    }
    public Course getCourse(String code){
        return null ;
    }
    public Student getStudent(long ID){
        return null;
    }
    public ArrayList<Course> getCourses(long studentID){
      return null;  
    }
    public ArrayList<Student> getStudents(String course){
      return null;  
    }
    public Registration getRegistration(long studentID, String courseCode){
        for(Registration registro : registrations){
            if(registro.getStudent().getID()== studentID && registro.getCourse().getCode()== courseCode){
                return registro;
            }
        }
        return null;
    }
    public boolean RegisterStudent(long studentID, String courseCode){
        return false;
    }
//    public boolean deRegisterStudent(long studentID, String courseCode){
//        for(Registration resgister : registrations){
//            if()
//        }
//        return ;
//    }
    public String getCourses(){
        
        for(Course curso : courses){
           return curso.toString();
        }
        return null;
    }
    public String getStudents(){
      for(Student estudante : students){
           return estudante.toString();
        }
        return null;
    }
}
