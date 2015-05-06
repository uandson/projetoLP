/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetolp;

/**
 *
 * @author nalva
 */
public class Course {
    private String code;
    private String title;
    private int numCredits;
    private int maxStudenst;
    
    public Course(String code, String title, int numCredits, int maxStudents){
        this.code=code;
        this.title=title;
        this.numCredits=numCredits;
        this.maxStudenst=maxStudenst;
    }
}
