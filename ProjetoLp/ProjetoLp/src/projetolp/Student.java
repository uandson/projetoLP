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
public abstract class Student {
  protected long ID;
  protected String name;
  protected String address;
  protected String phone;
  protected String email;
  
  public Student(long ID, String name, String address, String phone, String email){
      
  }
  @Override
  public boolean equals(Object o){
     return this == o;
  }
  @Override
  public String toString(){
     return ID+""+name+""+address+""+phone+""+email;
  }
}
