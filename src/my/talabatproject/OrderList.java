package my.talabatproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yasmi
 */
public class OrderList extends javax.swing.JFrame {

    /**
     * Creates new form OrderList
     */
    static int orderid = 0;
    Meal[] m = new Meal[4];

    String restaurantName;
    int i = 0;
    int type_of_meals;

    public OrderList(Meal[] m, String restaurantName, int type_of_meals) {
        initComponents();
        for (int i = 0; i < m.length; i++) {
            this.m[i] = m[i];
        }
        this.restaurantName = restaurantName;
        this.type_of_meals = type_of_meals;
        MealData();
    }

    public OrderList(Meal m1, String restaurantName, int type_of_meals) {
        initComponents();
        this.m[0] = m1;
        this.m[1] = new Meal();
        this.m[2] = new Meal();
        this.m[3] = new Meal();
        this.restaurantName = restaurantName;
        this.type_of_meals = type_of_meals;
        MealData();
    }

    public OrderList(Meal m1, Meal m2, String restaurantName, int type_of_meals) {
        initComponents();
        this.m[0] = m1;
        this.m[1] = m2;
        this.m[2] = new Meal();
        this.m[3] = new Meal();
        this.restaurantName = restaurantName;
        this.type_of_meals = type_of_meals;
        MealData();
    }

    public OrderList(Meal m1, Meal m2, Meal m3, String restaurantName, int type_of_meals) {
        initComponents();
        this.m[0] = m1;
        this.m[1] = m2;
        this.m[2] = m3;
        this.m[3] = new Meal();
        this.restaurantName = restaurantName;
        this.type_of_meals = type_of_meals;
        MealData();
    }

    public void MealData() {

        Lbl_date.setText(Order.currentOrderDate());
        if (m[0].quantityReq >= 1) {
            this.meal1.setText(m[0].Mname);
            this.times1.setText("x" + Integer.toString((m[0].quantityReq)));
            int x = m[0].quantityReq * m[0].Mprice;
            price1.setText(Integer.toString(x));
            //  System.out.println(x);
        } else {
            this.meal1.setText("");
            this.times1.setText("0");
            this.price1.setText("0");
        }
        if (m[1].quantityReq >= 1) {
            this.meal2.setText(" " + m[1].Mname);
            this.times2.setText("x" + Integer.toString((m[1].quantityReq)));
            this.price2.setText(Integer.toString((m[1].quantityReq * m[1].Mprice)));
        } else {
            this.meal2.setText("");
            this.times2.setText("0");
            this.price2.setText("0");
        }
        if (m[2].quantityReq >= 1) {
            this.meal3.setText(" " + m[2].Mname);
            this.times3.setText("x" + Integer.toString((m[2].quantityReq)));
            this.price3.setText(Integer.toString((m[2].quantityReq * m[2].Mprice)));
        } else {
            this.meal3.setText("");
            this.times3.setText("0");
            this.price3.setText("0");
        }
        this.subt.setText(Integer.toString((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice)));
        this.total.setText(Integer.toString((5 + m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice)));
    }

    public String notee;
    String Customer_name = Customer.getCustomername();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        meal2 = new javax.swing.JLabel();
        meal1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        note = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        subt = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        checkout = new javax.swing.JButton();
        add = new javax.swing.JButton();
        meal3 = new javax.swing.JLabel();
        times1 = new javax.swing.JLabel();
        times2 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        times3 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        Lbl_date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        price5 = new javax.swing.JLabel();
        price6 = new javax.swing.JLabel();

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("______________________________________________________________________");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(231, 231, 231));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Basket");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, 217, 62));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 11, 20, 33));

        meal2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        meal2.setText("  label2");
        jPanel1.add(meal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 20));

        meal1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        meal1.setText("  label 1");
        meal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meal1MouseClicked(evt);
            }
        });
        jPanel1.add(meal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 20));

        jTextField1.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Special request");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 385, -1, -1));

        note.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        note.setForeground(new java.awt.Color(153, 153, 153));
        note.setText(" Anything else we need to know?");
        note.setBorder(null);
        note.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noteMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                noteMouseReleased(evt);
            }
        });
        note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteActionPerformed(evt);
            }
        });
        jPanel1.add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 448, 376, 45));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Add a note");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 411, 81, 31));

        jLabel8.setForeground(new java.awt.Color(231, 231, 231));
        jLabel8.setText("______________________________________________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 511, -1, -1));

        jLabel10.setForeground(new java.awt.Color(231, 231, 231));
        jLabel10.setText("______________________________________________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 363, 502, -1));

        jTextField3.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Payment summary");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 545, -1, -1));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(46, 46, 46));
        jLabel11.setText("Subtotal");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 576, 92, 33));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(46, 46, 46));
        jLabel12.setText("Service Charge");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 615, 92, 33));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setText("Total amount");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 654, 104, 33));

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(46, 46, 46));
        jLabel14.setText("EGP  5.00");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 624, -1, -1));

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(46, 46, 46));
        jLabel15.setText("EGP ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 585, -1, -1));

        subt.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        subt.setForeground(new java.awt.Color(46, 46, 46));
        subt.setText("0.00");
        jPanel1.add(subt, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 585, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel17.setText("EGP ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 662, -1, -1));

        total.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        total.setText("0.00");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 665, -1, -1));

        checkout.setBackground(new java.awt.Color(255, 90, 0));
        checkout.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 255, 255));
        checkout.setText("Checkout");
        checkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        jPanel1.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, 185, 53));

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setForeground(new java.awt.Color(255, 90, 0));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 453, 58, -1));

        meal3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        meal3.setText("  label3");
        jPanel1.add(meal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 20));

        times1.setBackground(new java.awt.Color(255, 51, 0));
        times1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        times1.setForeground(new java.awt.Color(255, 51, 0));
        times1.setText("x");
        jPanel1.add(times1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 30, 20));

        times2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        times2.setForeground(new java.awt.Color(255, 51, 0));
        times2.setText("x");
        jPanel1.add(times2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 30, 20));

        price2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price2.setText("0");
        jPanel1.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 50, 20));

        times3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        times3.setForeground(new java.awt.Color(255, 51, 0));
        times3.setText("x");
        jPanel1.add(times3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 30, 20));

        price3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price3.setText("0");
        jPanel1.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 50, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 23, 24, 23));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("<");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 19, -1, 27));

        price1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price1.setText("0");
        jPanel1.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 50, 30));

        Lbl_date.setText("date");
        jPanel1.add(Lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 41));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 156, 0, 20));

        price4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price4.setText("EGP");
        jPanel1.add(price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 40, 30));

        price5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price5.setText("EGP");
        jPanel1.add(price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 40, 30));

        price6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        price6.setText("EGP");
        jPanel1.add(price6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Menu back_to_Menu = new Menu();
        this.dispose();
        back_to_Menu.setVisible(true);
        back_to_Menu.pack();
        back_to_Menu.setLocationRelativeTo(null);
        back_to_Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        notee = note.getText();
    }//GEN-LAST:event_addActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        // TODO add your handling code here:
        int ordernumber = Order.orderNumber();
        if (evt.getSource() == checkout) {

            if (m[0].quantityReq == 0 && m[1].quantityReq == 0 && m[2].quantityReq == 0) {
                JOptionPane.showMessageDialog(this, "No Meals Selected :(");
                this.dispose();
                Scrolled_Menu rog;
                try {
                    rog = new Scrolled_Menu();
                    rog.setVisible(true);
                    rog.setLocationRelativeTo(null);
                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }

            } else {

                String[] guiMealName = new String[3];
                guiMealName[0] = meal1.getText();
                guiMealName[1] = meal2.getText();
                guiMealName[2] = meal3.getText();

                int[] guiMealPrice = new int[3];
                guiMealPrice[0] = Integer.parseInt(price1.getText());
                guiMealPrice[1] = Integer.parseInt(price2.getText());
                guiMealPrice[2] = Integer.parseInt(price3.getText());
                for (int j = 0; j < 3; j++) {
                    System.out.println(guiMealName[j]);
                }

                for (int j = 0; j < type_of_meals; j++) {
                    try (Connection con = my.talabatproject.Db.connect();
                            PreparedStatement ps = con.prepareStatement("insert into Orders values(?,?,?,?,?,?,?,?,?)");) {
                        String currentDate = Order.currentOrderDate();
                        ps.setInt(2, guiMealPrice[j]);
                        ps.setInt(3, m[j].quantityReq);
                        ps.setString(4, note.getText());
                        ps.setString(5, my.talabatproject.Db.getcust());
                        ps.setString(6, restaurantName);
                        ps.setString(7, currentDate);
                        ps.setInt(8, ordernumber);
                        ps.setString(9, guiMealName[j]);
                        ps.execute();
                        JOptionPane.showMessageDialog(null, "insertion Successful");
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void noteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteActionPerformed

    private void noteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteMouseReleased
        // TODO add your handling code here:
        note.setText(" ");
    }//GEN-LAST:event_noteMouseReleased

    private void noteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_noteMouseEntered

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void meal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_meal1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }
    public javax.swing.JTextField Entered_Name;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_date;
    public javax.swing.JButton add;
    private javax.swing.JButton checkout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JLabel meal1;
    public javax.swing.JLabel meal2;
    public javax.swing.JLabel meal3;
    public javax.swing.JTextField note;
    private javax.swing.JLabel price1;
    public javax.swing.JLabel price2;
    public javax.swing.JLabel price3;
    private javax.swing.JLabel price4;
    private javax.swing.JLabel price5;
    private javax.swing.JLabel price6;
    public javax.swing.JLabel subt;
    public javax.swing.JLabel times1;
    public javax.swing.JLabel times2;
    public javax.swing.JLabel times3;
    public javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

}