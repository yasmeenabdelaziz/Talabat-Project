/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.talabatproject;

public class Customer extends User {

    private int phoneNumber;
    private String adress;

    public Customer() {

    }

    public Customer(String Name, String Password) {
        super(Name, Password);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
 public static String getCustomername()
 {
     return my.talabatproject.Db.getcust();
 
 }
    @Override
    public int login(String name, String password) { //function retrive from database
        int i = my.talabatproject.Db.CheckUser(name, password);
        return i;
    }

    public int register(String name, String password, int num, String street, String city) {
        int i = my.talabatproject.Db.Register(name, password, num, street, city);
        return i;
    }

}
