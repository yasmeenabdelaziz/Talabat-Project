/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.talabatproject;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmeen Abdelaziz
 */
public class Owner_Browse_date extends javax.swing.JFrame {

    /**
     * Creates new form Owner_Browse_date
     */
    public Owner_Browse_date() throws SQLException {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(12);
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 10));
        jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
    
        ordersno();
    }
    int i = 2;

    int k; 
    int j;
    boolean isOrderedFound = false;
public void ordersno() throws SQLException
{
    int[] orders = new int[3];
  Connection con = Db.connect();
        try (
                PreparedStatement p1 = con.prepareStatement("select DISTINCT orderno from Orders where restaurant_name = ? ");) {
            p1.setString(1, my.talabatproject.Db.getres());
           p1.execute();
            ResultSet r = p1.executeQuery();
           int i=0;
            while(r.next()==true)
            {
                orders[i] = Integer.parseInt(r.getString("orderno"));
                i++;
            }
        }
       
      System.out.println(orders[0]);
       System.out.println(orders[1]);
        System.out.println(orders[2]);
        
}
public void ordersvalues() throws SQLException
{
    int[] orders = new int[3];
  Connection con = Db.connect();
        try (
                PreparedStatement p1 = con.prepareStatement("select count(*) from Orders where orderno=? ");) {
            p1.setString(1, my.talabatproject.Db.getres());
           p1.execute();
            ResultSet r = p1.executeQuery();
           int i=0;
            while(r.next()==true)
            {
                orders[i] = Integer.parseInt(r.getString("orderno"));
                i++;
            }
        }
      
        
}
    public void open() throws SQLException {
        int i;
        Connection con = Db.connect();
        try (
                PreparedStatement p1 = con.prepareStatement("select * from Orders where restaurant_name = ? Group by orderno ");) {
            p1.setString(1, my.talabatproject.Db.getres());

            p1.execute();
            ResultSet r = p1.executeQuery();
            
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//            i = r.getInt("orderno");
//       
//                if (r.next() == true && i == r.getInt("orderno")) {
//                    Lbl_orderId1.setText(r.getString("orderno"));
//                    Lbl_meal1Name1.setText(r.getString("mealname"));
//                    Lbl_total1Quantity1.setText(r.getString("MealQuantity"));
//                    Lbl_dispalyOrderDate1.setText(r.getString("order_date"));
//                    Lbl_additionalNotes1.setText(r.getString("additional_notes"));
//                    isOrderedFound = true;
//                }
//               if (r.next() == true && i == r.getInt("orderno")) {
//                     System.out.println("in second if" + i );
//                    Lbl_meal1Name2.setText(r.getString("mealname"));
//                    Lbl_total1Quantity2.setText(r.getString("MealQuantity"));
//
//                    isOrderedFound = true;
//                }
//                else {
//                    
//                    System.out.println("in else");
//                    Lbl_orderId2.setText(r.getString("orderno"));
//                    Lbl_meal2Name1.setText(r.getString("mealname"));
//                    Lbl_total2Quantity1.setText(r.getString("MealQuantity"));
//                    Lbl_dispalyOrderDate2.setText(r.getString("order_date"));
//                    Lbl_additionalNotes2.setText(r.getString("additional_notes"));
//            }

//            if (r.next() == true) {
//                if (i == r.getInt("orderno")) {
//                    Lbl_meal1Name3.setText(r.getString("mealname"));
//                    Lbl_total1Quantity3.setText(r.getString("MealQuantity"));
//                    isOrderedFound = true;
//
//                }
//            } else {
//
//            }
//
//// the frist result set end
////         p1.setString(1, my.talabatproject.Db.getres());
//            // the second result set
//// ResultSet re = p1.executeQuery();
//            if (r.next() == true) {
//                k = r.getInt("orderno");
//                if (k == r.getInt("orderno")) {
//                    Lbl_orderId2.setText(r.getString("orderno"));
//                    Lbl_meal2Name1.setText(r.getString("mealname"));
//                    Lbl_total2Quantity1.setText(r.getString("MealQuantity"));
//                    Lbl_dispalyOrderDate2.setText(r.getString("order_date"));
//                    Lbl_additionalNotes2.setText(r.getString("additional_notes"));
//                    isOrderedFound = true;
//                }
//            } else {
//
//            }
//
//            if (r.next() == true) {
//                if (k == r.getInt("orderno")) {
//                    Lbl_meal2Name2.setText(r.getString("mealname"));
//                    Lbl_total2Quantity2.setText(r.getString("MealQuantity"));
//                    isOrderedFound = true;
//                }
//            } else {
//
//            }
//            if (r.next() == true) {
//                if (k == r.getInt("orderno")) {
//                    Lbl_meal2Name3.setText(r.getString("mealname"));
//                    Lbl_total2Quantity3.setText(r.getString("MealQuantity"));
//                    isOrderedFound = true;
//                }
//            } else {
//
//            }
//
//            if (r.next() == true) {
//                j = r.getInt("orderno");
//                if (j == r.getInt("orderno")) {
//                    Lbl_orderId3.setText(r.getString("orderno"));
//
//                    Lbl_meal3Name1.setText(r.getString("mealname"));
//                    Lbl_total3Quantity1.setText(r.getString("MealQuantity"));
//                    Lbl_dispalyOrderDate3.setText(r.getString("order_date"));
//                    Lbl_additionalNotes3.setText(r.getString("additional_notes"));
//                    isOrderedFound = true;
//                }
//            }
//            if (r.next() == true) {
//                if (j == r.getInt("orderno")) {
//                    Lbl_meal3Name2.setText(r.getString("mealname"));
//                    Lbl_total3Quantity2.setText(r.getString("MealQuantity"));
//                    isOrderedFound = true;
//                }
//            } else {
//
//            }
//
//            if (r.next() == true) {
//                if (j == r.getInt("orderno")) {
//                    Lbl_meal3Name3.setText(r.getString("mealname"));
//                    Lbl_total3Quantity3.setText(r.getString("MealQuantity"));
//                    isOrderedFound = true;
//                }
//            } else {
//
//            }
//
//            if (r.next() == true) {
//                if (j == r.getInt("orderno")) {
//                    Lbl_orderId3.setText(r.getString("orderno"));
//
//                    Lbl_meal4Name1.setText(r.getString("mealname"));
//                    Lbl_total4Quantity1.setText(r.getString("MealQuantity"));
//                    Lbl_dispalyOrderDate4.setText(r.getString("order_date"));
//                    Lbl_additionalNotes4.setText(r.getString("additional_notes"));
//                    isOrderedFound = true;
//                }
//            } else {
//
//            }
//            if (r.next() == true) {
//                if (j == r.getInt("orderno")) {
//                    Lbl_meal4Name2.setText(r.getString("mealname"));
//                    Lbl_total4Quantity4.setText(r.getString("MealQuantity"));
//                    isOrderedFound = true;
//                }
//            } else {
//
//            }
//            if (r.next() == true) {
//                if (j == r.getInt("orderno")) {
//                    Lbl_meal3Name4.setText(r.getString("mealname"));
//                    Lbl_total4Quantity3.setText(r.getString("MealQuantity"));
//                    isOrderedFound = true;
//                }
//            } else {
//
//            }
//            if (isOrderedFound == false) {
//                JOptionPane.showMessageDialog(this, "No orders found :(");
//
//            }

        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        } finally {
            con.close();

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lbl_meal2Name2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Lbl_orderId1 = new javax.swing.JLabel();
        times3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Lbl_total2Quantity3 = new javax.swing.JLabel();
        Lbl_meal1Name3 = new javax.swing.JLabel();
        Lbl_total1Quantity2 = new javax.swing.JLabel();
        Lbl_dispalyOrderDate5 = new javax.swing.JLabel();
        Lbl_meal1Name2 = new javax.swing.JLabel();
        Lbl_total1Quantity3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Lbl_additionalNotes5 = new javax.swing.JTextField();
        Lbl_orderId5 = new javax.swing.JLabel();
        Lbl_meal1Name1 = new javax.swing.JLabel();
        Lbl_meal2Name3 = new javax.swing.JLabel();
        Lbl_meal3Name2 = new javax.swing.JLabel();
        Lbl_meal2Name1 = new javax.swing.JLabel();
        Lbl_total1Quantity1 = new javax.swing.JLabel();
        Lbl_total3Quantity2 = new javax.swing.JLabel();
        Lbl_total2Quantity2 = new javax.swing.JLabel();
        Lbl_additionalNotes1 = new javax.swing.JTextField();
        Lbl_dispalyOrderDate1 = new javax.swing.JLabel();
        Lbl_orderId2 = new javax.swing.JLabel();
        Lbl_meal3Name3 = new javax.swing.JLabel();
        Lbl_meal4Name2 = new javax.swing.JLabel();
        Lbl_total2Quantity1 = new javax.swing.JLabel();
        Lbl_total3Quantity3 = new javax.swing.JLabel();
        Lbl_total4Quantity3 = new javax.swing.JLabel();
        Lbl_additionalNotes2 = new javax.swing.JTextField();
        Lbl_dispalyOrderDate2 = new javax.swing.JLabel();
        Lbl_orderId3 = new javax.swing.JLabel();
        Lbl_meal3Name1 = new javax.swing.JLabel();
        Lbl_meal3Name4 = new javax.swing.JLabel();
        Lbl_total3Quantity1 = new javax.swing.JLabel();
        Lbl_total5Quantity2 = new javax.swing.JLabel();
        Lbl_total4Quantity1 = new javax.swing.JLabel();
        Lbl_total4Quantity4 = new javax.swing.JLabel();
        Lbl_additionalNotes3 = new javax.swing.JTextField();
        Lbl_dispalyOrderDate3 = new javax.swing.JLabel();
        Lbl_orderId4 = new javax.swing.JLabel();
        Lbl_meal4Name1 = new javax.swing.JLabel();
        Lbl_meal5Name3 = new javax.swing.JLabel();
        Lbl_meal5Name1 = new javax.swing.JLabel();
        Lbl_meal5Name2 = new javax.swing.JLabel();
        Lbl_total5Quantity3 = new javax.swing.JLabel();
        Lbl_total5Quantity1 = new javax.swing.JLabel();
        Lbl_additionalNotes4 = new javax.swing.JTextField();
        Lbl_dispalyOrderDate4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(543, 646));
        setUndecorated(true);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(543, 646));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(543, 646));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(543, 646));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(231, 231, 231));
        jPanel1.setMaximumSize(new java.awt.Dimension(509, 967));
        jPanel1.setMinimumSize(new java.awt.Dimension(509, 967));
        jPanel1.setPreferredSize(new java.awt.Dimension(509, 967));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Browse Order");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 270, 62));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 20, 33));

        Lbl_meal2Name2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal2Name2.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal2Name2.setText("meal name");
        Lbl_meal2Name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal2Name2MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal2Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 20));

        jLabel8.setForeground(new java.awt.Color(231, 231, 231));
        jLabel8.setText("______________________________________________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, 500, 20));

        jLabel10.setForeground(new java.awt.Color(231, 231, 231));
        jLabel10.setText("______________________________________________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 524, -1));

        Lbl_orderId1.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_orderId1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        Lbl_orderId1.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_orderId1.setText("order1");
        jPanel1.add(Lbl_orderId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 28));

        times3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        times3.setForeground(new java.awt.Color(255, 51, 0));
        jPanel1.add(times3, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 265, -1, 44));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 20, 23));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("<");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 19, -1, 27));

        Lbl_total2Quantity3.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total2Quantity3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total2Quantity3.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total2Quantity3.setText("x");
        jPanel1.add(Lbl_total2Quantity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 30, 20));

        Lbl_meal1Name3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal1Name3.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal1Name3.setText("meal name");
        Lbl_meal1Name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal1Name3MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal1Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 160, 20));

        Lbl_total1Quantity2.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total1Quantity2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total1Quantity2.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total1Quantity2.setText("x");
        jPanel1.add(Lbl_total1Quantity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 26, 24));

        Lbl_dispalyOrderDate5.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        Lbl_dispalyOrderDate5.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_dispalyOrderDate5.setText("Date");
        jPanel1.add(Lbl_dispalyOrderDate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 820, 230, 30));

        Lbl_meal1Name2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal1Name2.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal1Name2.setText("meal name");
        Lbl_meal1Name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal1Name2MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal1Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, 20));

        Lbl_total1Quantity3.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total1Quantity3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total1Quantity3.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total1Quantity3.setText("x");
        jPanel1.add(Lbl_total1Quantity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 26, 24));

        jLabel11.setForeground(new java.awt.Color(231, 231, 231));
        jLabel11.setText("______________________________________________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 524, 20));

        jLabel12.setForeground(new java.awt.Color(231, 231, 231));
        jLabel12.setText("______________________________________________________________________");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 524, -1));

        Lbl_additionalNotes5.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_additionalNotes5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Lbl_additionalNotes5.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_additionalNotes5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lbl_additionalNotes5.setText("additional notes");
        Lbl_additionalNotes5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.add(Lbl_additionalNotes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 850, 280, 80));

        Lbl_orderId5.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_orderId5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        Lbl_orderId5.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_orderId5.setText("order5");
        jPanel1.add(Lbl_orderId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 820, 90, 28));

        Lbl_meal1Name1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal1Name1.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal1Name1.setText("meal name");
        Lbl_meal1Name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal1Name1MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal1Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, 20));

        Lbl_meal2Name3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal2Name3.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal2Name3.setText("meal name");
        Lbl_meal2Name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal2Name3MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal2Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 170, 20));

        Lbl_meal3Name2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal3Name2.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal3Name2.setText("meal name");
        Lbl_meal3Name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal3Name2MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal3Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 170, 20));

        Lbl_meal2Name1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal2Name1.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal2Name1.setText("meal name");
        Lbl_meal2Name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal2Name1MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal2Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 20));

        Lbl_total1Quantity1.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total1Quantity1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total1Quantity1.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total1Quantity1.setText("x");
        jPanel1.add(Lbl_total1Quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 30, 30));

        Lbl_total3Quantity2.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total3Quantity2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total3Quantity2.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total3Quantity2.setText("x");
        jPanel1.add(Lbl_total3Quantity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 30, 20));

        Lbl_total2Quantity2.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total2Quantity2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total2Quantity2.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total2Quantity2.setText("x");
        jPanel1.add(Lbl_total2Quantity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 30, 20));

        Lbl_additionalNotes1.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_additionalNotes1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Lbl_additionalNotes1.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_additionalNotes1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lbl_additionalNotes1.setText("additional notes");
        Lbl_additionalNotes1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.add(Lbl_additionalNotes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 280, 80));

        Lbl_dispalyOrderDate1.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        Lbl_dispalyOrderDate1.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_dispalyOrderDate1.setText("Date");
        jPanel1.add(Lbl_dispalyOrderDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 280, 30));

        Lbl_orderId2.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_orderId2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        Lbl_orderId2.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_orderId2.setText("order2");
        jPanel1.add(Lbl_orderId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 28));

        Lbl_meal3Name3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal3Name3.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal3Name3.setText("meal name");
        Lbl_meal3Name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal3Name3MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal3Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 170, 20));

        Lbl_meal4Name2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal4Name2.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal4Name2.setText("meal name");
        Lbl_meal4Name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal4Name2MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal4Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 170, 20));

        Lbl_total2Quantity1.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total2Quantity1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total2Quantity1.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total2Quantity1.setText("x");
        jPanel1.add(Lbl_total2Quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 30, 30));

        Lbl_total3Quantity3.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total3Quantity3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total3Quantity3.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total3Quantity3.setText("x");
        jPanel1.add(Lbl_total3Quantity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 30, 20));

        Lbl_total4Quantity3.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total4Quantity3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total4Quantity3.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total4Quantity3.setText("x");
        jPanel1.add(Lbl_total4Quantity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 740, 30, 20));

        Lbl_additionalNotes2.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_additionalNotes2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Lbl_additionalNotes2.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_additionalNotes2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lbl_additionalNotes2.setText("additional notes");
        Lbl_additionalNotes2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.add(Lbl_additionalNotes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 280, 80));

        Lbl_dispalyOrderDate2.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        Lbl_dispalyOrderDate2.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_dispalyOrderDate2.setText("Date");
        jPanel1.add(Lbl_dispalyOrderDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 280, 30));

        Lbl_orderId3.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_orderId3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        Lbl_orderId3.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_orderId3.setText("order3");
        jPanel1.add(Lbl_orderId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, 28));

        Lbl_meal3Name1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal3Name1.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal3Name1.setText("meal name");
        Lbl_meal3Name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal3Name1MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal3Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 160, 20));

        Lbl_meal3Name4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal3Name4.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal3Name4.setText("meal name");
        Lbl_meal3Name4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal3Name4MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal3Name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 170, 20));

        Lbl_total3Quantity1.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total3Quantity1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total3Quantity1.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total3Quantity1.setText("x");
        jPanel1.add(Lbl_total3Quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 30, 30));

        Lbl_total5Quantity2.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total5Quantity2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total5Quantity2.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total5Quantity2.setText("x");
        jPanel1.add(Lbl_total5Quantity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 880, 30, -1));

        Lbl_total4Quantity1.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total4Quantity1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total4Quantity1.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total4Quantity1.setText("x");
        jPanel1.add(Lbl_total4Quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 680, 30, 20));

        Lbl_total4Quantity4.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total4Quantity4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total4Quantity4.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total4Quantity4.setText("x");
        jPanel1.add(Lbl_total4Quantity4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, 30, 20));

        Lbl_additionalNotes3.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_additionalNotes3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Lbl_additionalNotes3.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_additionalNotes3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lbl_additionalNotes3.setText("additional notes");
        Lbl_additionalNotes3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.add(Lbl_additionalNotes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 280, 80));

        Lbl_dispalyOrderDate3.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        Lbl_dispalyOrderDate3.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_dispalyOrderDate3.setText("Date");
        jPanel1.add(Lbl_dispalyOrderDate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 280, 30));

        Lbl_orderId4.setBackground(new java.awt.Color(0, 0, 0));
        Lbl_orderId4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        Lbl_orderId4.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_orderId4.setText("order4");
        jPanel1.add(Lbl_orderId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 80, 28));

        Lbl_meal4Name1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal4Name1.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal4Name1.setText("meal name");
        Lbl_meal4Name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal4Name1MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal4Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 160, 20));

        Lbl_meal5Name3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal5Name3.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal5Name3.setText("meal name");
        Lbl_meal5Name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal5Name3MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal5Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 910, 170, 20));

        Lbl_meal5Name1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal5Name1.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal5Name1.setText("meal name");
        Lbl_meal5Name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal5Name1MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal5Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, 170, 20));

        Lbl_meal5Name2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lbl_meal5Name2.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_meal5Name2.setText("meal name");
        Lbl_meal5Name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_meal5Name2MouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_meal5Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 880, 170, 20));

        Lbl_total5Quantity3.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total5Quantity3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total5Quantity3.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total5Quantity3.setText("x");
        jPanel1.add(Lbl_total5Quantity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 910, 30, -1));

        Lbl_total5Quantity1.setBackground(new java.awt.Color(255, 51, 0));
        Lbl_total5Quantity1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lbl_total5Quantity1.setForeground(new java.awt.Color(255, 51, 0));
        Lbl_total5Quantity1.setText("x");
        jPanel1.add(Lbl_total5Quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 850, 30, -1));

        Lbl_additionalNotes4.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_additionalNotes4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Lbl_additionalNotes4.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_additionalNotes4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lbl_additionalNotes4.setText("additional notes");
        Lbl_additionalNotes4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.add(Lbl_additionalNotes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, 280, 80));

        Lbl_dispalyOrderDate4.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        Lbl_dispalyOrderDate4.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_dispalyOrderDate4.setText("Date");
        jPanel1.add(Lbl_dispalyOrderDate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 250, 30));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void Lbl_meal2Name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal2Name2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal2Name2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Menu back_to_Menu = new Menu();
        this.dispose();
        back_to_Menu.setVisible(true);
        back_to_Menu.pack();
        back_to_Menu.setLocationRelativeTo(null);
        back_to_Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void Lbl_meal1Name3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal1Name3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal1Name3MouseClicked

    private void Lbl_meal1Name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal1Name2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal1Name2MouseClicked

    private void Lbl_meal1Name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal1Name1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal1Name1MouseClicked

    private void Lbl_meal2Name3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal2Name3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal2Name3MouseClicked

    private void Lbl_meal3Name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal3Name2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal3Name2MouseClicked

    private void Lbl_meal2Name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal2Name1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal2Name1MouseClicked

    private void Lbl_meal3Name3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal3Name3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal3Name3MouseClicked

    private void Lbl_meal4Name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal4Name2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal4Name2MouseClicked

    private void Lbl_meal3Name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal3Name1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal3Name1MouseClicked

    private void Lbl_meal3Name4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal3Name4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal3Name4MouseClicked

    private void Lbl_meal4Name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal4Name1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal4Name1MouseClicked

    private void Lbl_meal5Name3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal5Name3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal5Name3MouseClicked

    private void Lbl_meal5Name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal5Name1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal5Name1MouseClicked

    private void Lbl_meal5Name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_meal5Name2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_meal5Name2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Owner_Browse_date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_Browse_date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_Browse_date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_Browse_date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Owner_Browse_date().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Owner_Browse_date.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Lbl_additionalNotes1;
    private javax.swing.JTextField Lbl_additionalNotes2;
    private javax.swing.JTextField Lbl_additionalNotes3;
    private javax.swing.JTextField Lbl_additionalNotes4;
    private javax.swing.JTextField Lbl_additionalNotes5;
    private javax.swing.JLabel Lbl_dispalyOrderDate1;
    private javax.swing.JLabel Lbl_dispalyOrderDate2;
    private javax.swing.JLabel Lbl_dispalyOrderDate3;
    private javax.swing.JLabel Lbl_dispalyOrderDate4;
    private javax.swing.JLabel Lbl_dispalyOrderDate5;
    public javax.swing.JLabel Lbl_meal1Name1;
    public javax.swing.JLabel Lbl_meal1Name2;
    public javax.swing.JLabel Lbl_meal1Name3;
    public javax.swing.JLabel Lbl_meal2Name1;
    public javax.swing.JLabel Lbl_meal2Name2;
    public javax.swing.JLabel Lbl_meal2Name3;
    public javax.swing.JLabel Lbl_meal3Name1;
    public javax.swing.JLabel Lbl_meal3Name2;
    public javax.swing.JLabel Lbl_meal3Name3;
    public javax.swing.JLabel Lbl_meal3Name4;
    public javax.swing.JLabel Lbl_meal4Name1;
    public javax.swing.JLabel Lbl_meal4Name2;
    public javax.swing.JLabel Lbl_meal5Name1;
    public javax.swing.JLabel Lbl_meal5Name2;
    public javax.swing.JLabel Lbl_meal5Name3;
    private javax.swing.JLabel Lbl_orderId1;
    private javax.swing.JLabel Lbl_orderId2;
    private javax.swing.JLabel Lbl_orderId3;
    private javax.swing.JLabel Lbl_orderId4;
    private javax.swing.JLabel Lbl_orderId5;
    public javax.swing.JLabel Lbl_total1Quantity1;
    public javax.swing.JLabel Lbl_total1Quantity2;
    public javax.swing.JLabel Lbl_total1Quantity3;
    public javax.swing.JLabel Lbl_total2Quantity1;
    public javax.swing.JLabel Lbl_total2Quantity2;
    public javax.swing.JLabel Lbl_total2Quantity3;
    public javax.swing.JLabel Lbl_total3Quantity1;
    public javax.swing.JLabel Lbl_total3Quantity2;
    public javax.swing.JLabel Lbl_total3Quantity3;
    public javax.swing.JLabel Lbl_total4Quantity1;
    public javax.swing.JLabel Lbl_total4Quantity3;
    public javax.swing.JLabel Lbl_total4Quantity4;
    public javax.swing.JLabel Lbl_total5Quantity1;
    public javax.swing.JLabel Lbl_total5Quantity2;
    public javax.swing.JLabel Lbl_total5Quantity3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel times3;
    // End of variables declaration//GEN-END:variables
}
