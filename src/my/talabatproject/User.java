/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.talabatproject;

/**
 *
 * @author yasmi
 */
public abstract class User {

    private String name, Password;

    public User(String Name, String Password) {
        this.name = Name;
        this.Password = Password;
    }
public User(){ //for customer inhertiance
    
}
    

    public abstract int login(String Name, String Password) ; // abstract method to override in two classes
        
    
   
 public void setName(String Name) {
        this.name = Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return Password;
    }
}
