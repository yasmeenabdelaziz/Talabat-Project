/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.talabatproject;

import java.sql.SQLException;

/**
 *
 * @author yasmi
 */
public class RestaurantOwner extends User {

    String restaurant_name;

    RestaurantOwner() {
    }

    RestaurantOwner(String RestaurantName) {
        this.restaurant_name = RestaurantName;
    }

    public RestaurantOwner(String RestaurantName, String UserName, String Password) {
        super(UserName, Password);
        this.restaurant_name = RestaurantName;
    }

    public int login(String name, String password) {

        int exist = my.talabatproject.Db.CheckOwner(name, password);
        return exist;
    }

    public int register(String res_name, String name, String password) {
        int regist = my.talabatproject.Db.O_Register(res_name, name, password);
        return regist;
    }

    public void delete(String meal_name) throws SQLException {
        my.talabatproject.Db.delete(meal_name);

    }

    public void update(int meal_price, String meal_descreption, String meal_name) {
        my.talabatproject.Db.Update(meal_price, meal_descreption, meal_name);
    }

    public void update(int meal_price, String meal_descreption, String meal_name, String meal_image) {
        my.talabatproject.Db.Update(meal_price, meal_descreption, meal_name, meal_image);
    }

    public static void AddMeal(String meal_name, int meal_price, String meal_descreption, String restaurant_name, String meal_image) {
        my.talabatproject.Db.AddMeal(meal_name, meal_price, meal_descreption, restaurant_name, meal_image);
    }

    public static int chooseRestaurant(String restaurant_name) { // leeeeh??
        int choosed_restaurant = my.talabatproject.Db.chooseRestaurant(restaurant_name);
        return choosed_restaurant;
    }

    public static String restaurant_logo_path() {
        return my.talabatproject.Db.Resturant_logo();
    }

    public static String getRestaurantname() {
return my.talabatproject.Db.getres();
    }
}
