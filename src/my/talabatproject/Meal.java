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
public class Meal {

    public String Mname;
    public int Mprice;
    public String Mdescription;
    public int quantityReq = 0;
    String path;

    public Meal(String Mname, int Mprice, String Mdescription) {  //  for adding a new meal
        this.Mname = Mname;
        this.Mprice = Mprice;
        this.Mdescription = Mdescription;
    }

  
    public Meal() {
        this.Mdescription = null;
        this.Mname = null;
        this.Mprice = 0;
        this.quantityReq = 0;
        this.path = null;
    }
}
