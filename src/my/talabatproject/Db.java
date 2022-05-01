package my.talabatproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;

/**
 *
 * @author yasmi
 */
public class Db {
   static   int   ordernumber;
static  Meal[] meals = new Meal[4];


    static String restaurant;
    static String username, restaurantName;
    static String timenow;

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:databasef.db");
    }

 public static Meal[] displayMeals(String res_name) throws SQLException {

        try {
            Connection con = my.talabatproject.Db.connect();
            try (PreparedStatement ps = con.prepareStatement("select * from Meals WHERE restaurant_name=?")) {
                ps.setString(1, res_name);
                System.out.println(res_name);
                ResultSet r = ps.executeQuery();
                int i = 0;
                while (true) {
                    if (r.next() == false) {
                        break;
                    } else {
                        meals[i].Mname = r.getString("meal_name");
                        meals[i].Mdescription = r.getString("meal_description");
                        meals[i].Mprice = r.getInt("meal_price");
                        meals[i].path = r.getString("meal_image");
                    }
                    i++;
                }

            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(meals[i].path + " dfsdfdf");
        }
        return meals;
    }
    public static ArrayList<Customer> getUser() {
        ArrayList<Customer> list = new ArrayList<>();

        try (Connection con = Db.connect();
                PreparedStatement ps = con.prepareStatement("select * from Customer");) {
            ResultSet r = ps.executeQuery();
            while (r.next()) {
                list.add(new Customer(r.getString("c_username"), r.getString("c_password")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    public static int CheckUser(String user, String password) {
        ArrayList<Customer> arr = getUser();
        int yes = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equalsIgnoreCase(user)) {
                if (arr.get(i).getPassword().equalsIgnoreCase(password)) {
                    yes = 1;
                    username = arr.get(i).getName();
                    break;
                } else {
                    yes = -1;
                }
            } else {
                yes = 0;
            }
        }
        return yes;
    }

    public static String getcust() {
        return username;
    }

    public static int Register(String name, String password, int num, String city, String street) {
        int x = 0;
        try {
            try (Connection con = DriverManager.getConnection("jdbc:sqlite:databasef.db")) {
                PreparedStatement ps = con.prepareStatement("insert into Customer values(?,?,?,?,?,NULL)");
                ps.setString(1, name);
                ps.setString(2, password);
                ps.setInt(3, num);
                ps.setString(4, city);
                ps.setString(5, street);
                ps.executeUpdate();
                x = 1;
                JOptionPane.showMessageDialog(null, "insertion Successful");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "insertion Fail");
            System.out.println(ex.getMessage());
        }
        return x;
    }

    ////////////////////////////////////////////////////////////
    public static ArrayList<RestaurantOwner> getRUser() {
        ArrayList<RestaurantOwner> list = new ArrayList<>();

        try {
            try (Connection con = Db.connect(); PreparedStatement ps = con.prepareStatement("select * from Restaurant_Owner")) {
                ResultSet r = ps.executeQuery();
                while (r.next()) {
                    list.add(new RestaurantOwner(r.getString("restaurant_name"), r.getString("r_username"), r.getString("r_password")));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    public static int CheckOwner(String username, String password) {
        ArrayList<RestaurantOwner> arr = getRUser();
        int yes = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equalsIgnoreCase(username)) {
                if (arr.get(i).getPassword().equalsIgnoreCase(password)) {
                    yes = 1;
                    restaurantName = arr.get(i).restaurant_name;
                    break;
                } else {
                    yes = -1;
                }
            } else {
                yes = 0;
            }
        }
        return yes;
    }

    public static String getres() {
        return restaurantName;
    }

    public static int O_Register(String name, String user_name, String password) {
        int x = 0;
        try {
            try (Connection con = DriverManager.getConnection("jdbc:sqlite:databasef.db")) {
                PreparedStatement ps = con.prepareStatement("insert into restaurant_owner values(?,?,? , ?)");
                ps.setString(1, name);
                ps.setString(2, user_name);
                ps.setString(3, password);
                ps.setString(4, name);
                ps.executeUpdate();
                x = 1;
                JOptionPane.showMessageDialog(null, "insertion Successful");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "insertion Fail");
            System.out.println(ex.getMessage());
        }
        return x;
    }

    //////////////////////////////////////////////////////////
    public static void AddMeal(String name, int price, String desc, String restaurantname, String mealImage) {

        try (Connection con = DriverManager.getConnection("jdbc:sqlite:databasef.db");
                PreparedStatement ps = con.prepareStatement("insert into Meals values(?,?,?,NULL,?,?)");) {

            ps.setString(1, name);
            ps.setInt(2, price);
            ps.setString(3, desc);
            ps.setString(4, restaurantname);
            ps.setString(5, mealImage);
            ps.execute();
            JOptionPane.showMessageDialog(null, "insertion Successful");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "insertion Fail");
            ex.getMessage();
        }

    }

    public static void delete(String meal_name) throws SQLException {
        String sql = "DELETE FROM Meals WHERE meal_name =?";
        PreparedStatement pstmt = null;
        try (Connection conn = connect()) {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, meal_name);
            pstmt.executeUpdate();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Done", "Delete", JOptionPane.OK_OPTION, null);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Update(int meal_price, String meal_desc, String mealn) {
        PreparedStatement pst2;
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:databasef.db")) {
            String sql = "update Meals set meal_price = ?, meal_description = ? where meal_name = ?";
            pst2 = con.prepareStatement(sql);
            pst2.setString(3, mealn);
            pst2.setInt(1, meal_price);
            pst2.setString(2, meal_desc);

            pst2.execute();
            pst2.close();
            JOptionPane.showMessageDialog(null, "Data Successfully Updated!");
            // String sql = "UPDATE Meals SET meal_price = '" + meal_price + " ' , meal_description = '" + meal_desc + "'";
//            ps = con.prepareStatement(sql);
//            ps.execute();

        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static void Update(int meal_price, String meal_desc, String mealn, String meal_image) {
        PreparedStatement pst2;
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:databasef.db")) {
            String sql = "update Meals set meal_price = ?, meal_description = ? , meal_image =?  where meal_name = ?";
            pst2 = con.prepareStatement(sql);
            pst2.setString(4, mealn);
            pst2.setInt(1, meal_price);
            pst2.setString(2, meal_desc);
            pst2.setString(3, meal_image);
            pst2.execute();
            pst2.close();
            JOptionPane.showMessageDialog(null, "Data Successfully Updated!");
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static ArrayList<String> getRestaurants() {
        ArrayList<String> list1 = new ArrayList<>();

        try (Connection con = Db.connect(); PreparedStatement ps = con.prepareStatement("select restaurant_name from Restaurant_Owner")) {
            ResultSet r = ps.executeQuery();
            while (r.next()) {
                list1.add(r.getString("restaurant_name"));

            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return list1;
    }

    public static int chooseRestaurant(String restaurantName) {

        ArrayList<String> arr1 = getRestaurants();
        int yes = 0;
        for (int i = 0; i < arr1.size(); i++) {
            //
            if (arr1.get(i).equalsIgnoreCase(restaurantName)) {
                yes = 1;
                restaurant = arr1.get(i);
                break;
            } else {
                yes = 2;
            }
        }
        return yes;
    }

    public static String getSearchedName() {
        return restaurant;
    }

    public static String currentDateOfOrder() {
        LocalDateTime dtime = LocalDateTime.now(); //return current date
        timenow = dtime.toString(); //convert time to string
        return timenow;
    }

    public static String Resturant_logo() {
        String pathLogo;
        try {
            Connection con = my.talabatproject.Db.connect();
            try (PreparedStatement ps = con.prepareStatement("select * from Restaurant_Owner WHERE restaurant_name=?")) {
                ps.setString(1, getSearchedName());
                ResultSet r = ps.executeQuery();
                r.next();
                pathLogo = r.getString("res_logo");
            }
        } catch (SQLException ex) {
            return null;
        }
        return pathLogo;
    }
    public static int orderNumber(){
      
           try (Connection con = Db.connect(); PreparedStatement ps = con.prepareStatement("select orderno from Orders order by id DESC ")) {
                    ResultSet r = ps.executeQuery();
                    r.next();
                    ordernumber = r.getInt("orderno");
                    ordernumber++;
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
           return ordernumber;
    }

   
}
