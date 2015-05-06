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
public class PostGraduateStudent extends Student {
    private String thesisTitle;
    private String supervisor;
    
    public PostGraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle, String supervisor){
        super(ID,name,address,phone,email);
        this.supervisor=supervisor;
        this.thesisTitle=thesisTitle;
    }
    public String getThesisTitle(){
        return thesisTitle;
    }
    public String getSupervisor(){
        return supervisor;
    }
}
