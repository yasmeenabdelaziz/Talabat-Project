/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.talabatproject;

import java.awt.Dimension;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author yasmi
 */
public final class Scrolled_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Scrolled_Menu
     */
    Meal[] m = new Meal[4];

    String name = my.talabatproject.Db.getcust();
    OrderList order;
    int m1 = 0, m2 = 0, m3 = 0, m4 = 0;
    String res_name;

    public Scrolled_Menu() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        Open();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(12);
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
        res_name = my.talabatproject.Db.getSearchedName();

    }

    public Scrolled_Menu(String restaurant_name) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        Open();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(12);
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
        res_name = restaurant_name;
    }

    int i = 0;
      public void Open() throws SQLException {
        for (int i = 0; i < m.length; i++) {
            m[i] = new Meal();
        }
        try {
            Connection con = my.talabatproject.Db.connect();
            try (PreparedStatement ps = con.prepareStatement("select * from Meals WHERE restaurant_name=?")) {
                ps.setString(1, res_name);
                String path;
                Image imfit, imgfit;
                ImageIcon image;
                ResultSet r = ps.executeQuery();

                r.next();
                meal1name.setText(r.getString("meal_name"));
                String name1 = meal1name.getText();
                desc1.setText(r.getString("meal_description"));
                String desc_1 = desc1.getText();
                p1.setText(r.getString("meal_price"));
                int price1 = Integer.parseInt(p1.getText());
                m[0] = new Meal(name1, price1, desc_1);
                path = r.getString("meal_image");
                //path = r.getString("meal_image");
                System.out.println(path);
                image = new ImageIcon(path);
                Lbl_image1.setIcon(new ImageIcon(image.getImage()));

                //////////////////////Meal 2
                if (r.next() == false) {
                    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    con.close();
                } else {
                    meal2name.setText(r.getString("meal_name"));
                    String name2 = meal2name.getText();
                    desc2.setText(r.getString("meal_description"));
                    String desc_2 = desc2.getText();
                    p2.setText(r.getString("meal_price"));
                    int price2 = Integer.parseInt(p2.getText());
                    m[1] = new Meal(name2, price2, desc_2);
                    path = r.getString("meal_image");
                    image = new ImageIcon(path);
                    Lbl_image2.setIcon(new ImageIcon(image.getImage()));
                }
                ////////////////////Meal3
                if (r.next() == false) {
                    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    con.close();
                } else {
                    meal3name.setText(r.getString("meal_name"));
                    String name3 = meal3name.getText();
                    desc3.setText(r.getString("meal_description"));
                    String desc_3 = desc3.getText();
                    p3.setText(r.getString("meal_price"));
                    int price3 = Integer.parseInt(p3.getText());
                    m[2] = new Meal(name3, price3, desc_3);
                    path = r.getString("meal_image");
                    image = new ImageIcon(path);
                    Lbl_image3.setIcon(new ImageIcon(image.getImage()));
                }
                /////////////Meal4
                if (r.next() == false) {
                    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

                } else {
                    meal4name.setText(r.getString("meal_name"));
                    String name4 = meal4name.getText();
                    desc4.setText(r.getString("meal_description"));
                    String desc_4 = desc4.getText();
                    p4.setText(r.getString("meal_price"));
                    int price4 = Integer.parseInt(p4.getText());
                    m[3] = new Meal(name4, price4, desc_4);
                    path = r.getString("meal_image");
                    image = new ImageIcon(path);
                    Lbl_image4.setIcon(new ImageIcon(image.getImage()));
                }
                ///////////////////

               
            } finally {
                con.close();
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }

    

        String pathLogo = RestaurantOwner.restaurant_logo_path();

        if (pathLogo == null) {
            Lbl_restaurant_name_image.setText(res_name);
        } else {
            Image imfit, imgfit;
            ImageIcon image;
            image = new ImageIcon(pathLogo);
            imfit = image.getImage();
            imgfit = imfit.getScaledInstance(Lbl_restaurant_name_image.getWidth(), Lbl_restaurant_name_image.getHeight(), Image.SCALE_SMOOTH);
            Lbl_restaurant_name_image.setText("");
            Lbl_restaurant_name_image.setIcon(new ImageIcon(imfit));
        }
}
    

    public void viewBasket() {
        int n;
        n = Integer.parseInt(noofmeals.getText());
        if (n > 0) {
            additem.setText("View Basket");
        } else {
            additem.setText("Add item");
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
        jPanel_header = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Lbl_restaurant_name_image = new javax.swing.JLabel();
        Lbl_image1 = new javax.swing.JLabel();
        Lbl_image2 = new javax.swing.JLabel();
        Lbl_image3 = new javax.swing.JLabel();
        meal1name = new javax.swing.JLabel();
        meal2name = new javax.swing.JLabel();
        meal3name = new javax.swing.JLabel();
        desc1 = new javax.swing.JLabel();
        inc1 = new javax.swing.JButton();
        dec1 = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        inc2 = new javax.swing.JButton();
        dec2 = new javax.swing.JButton();
        p2 = new javax.swing.JLabel();
        desc3 = new javax.swing.JLabel();
        inc3 = new javax.swing.JButton();
        dec3 = new javax.swing.JButton();
        p3 = new javax.swing.JLabel();
        number1 = new javax.swing.JLabel();
        number2 = new javax.swing.JLabel();
        number3 = new javax.swing.JLabel();
        Lbl_price4 = new javax.swing.JLabel();
        Lbl_price2 = new javax.swing.JLabel();
        Lbl_price1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Lbl_image4 = new javax.swing.JLabel();
        meal4name = new javax.swing.JLabel();
        desc4 = new javax.swing.JLabel();
        Lbl_price3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        dec4 = new javax.swing.JButton();
        inc4 = new javax.swing.JButton();
        number4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        noofmeals = new javax.swing.JLabel();
        Lbl_total_price = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        additem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(793, 890));
        setMinimumSize(new java.awt.Dimension(793, 890));
        setUndecorated(true);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(793, 890));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(793, 890));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(793, 890));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(793, 1134));
        jPanel1.setMinimumSize(new java.awt.Dimension(793, 1134));
        jPanel1.setPreferredSize(new java.awt.Dimension(793, 1134));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_header.setBackground(new java.awt.Color(255, 90, 0));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("X");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("-");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        Lbl_restaurant_name_image.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_restaurant_name_image.setFont(new java.awt.Font("Sitka Text", 1, 41)); // NOI18N
        Lbl_restaurant_name_image.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_restaurant_name_image.setText("Restaurant Image");

        javax.swing.GroupLayout jPanel_headerLayout = new javax.swing.GroupLayout(jPanel_header);
        jPanel_header.setLayout(jPanel_headerLayout);
        jPanel_headerLayout.setHorizontalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_restaurant_name_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel_headerLayout.setVerticalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headerLayout.createSequentialGroup()
                .addGroup(jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel_headerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Lbl_restaurant_name_image, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 790, 140));

        Lbl_image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_image1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yasmeen Abdelaziz\\Downloads\\Webp.net-resizeimage (4).png")); // NOI18N
        Lbl_image1.setText(".");
        jPanel1.add(Lbl_image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 150, 130));

        Lbl_image2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_image2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yasmeen Abdelaziz\\Downloads\\Webp.net-resizeimage (4).png")); // NOI18N
        jPanel1.add(Lbl_image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 480, 140, 120));

        Lbl_image3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_image3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yasmeen Abdelaziz\\Downloads\\Webp.net-resizeimage (4).png")); // NOI18N
        jPanel1.add(Lbl_image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, 140, 140));

        meal1name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meal1name.setForeground(new java.awt.Color(51, 51, 51));
        meal1name.setText("Meal_1_Name");
        jPanel1.add(meal1name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 40));

        meal2name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meal2name.setForeground(new java.awt.Color(51, 51, 51));
        meal2name.setText("Meal_2_Name");
        jPanel1.add(meal2name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 230, 40));

        meal3name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meal3name.setForeground(new java.awt.Color(51, 51, 51));
        meal3name.setText("Meal_3_name");
        jPanel1.add(meal3name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 280, 40));

        desc1.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        desc1.setForeground(new java.awt.Color(51, 51, 51));
        desc1.setText("desc1");
        jPanel1.add(desc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 520, 100));

        inc1.setBackground(new java.awt.Color(204, 204, 204));
        inc1.setText("+");
        inc1.setMaximumSize(new java.awt.Dimension(41, 25));
        inc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inc1ActionPerformed(evt);
            }
        });
        jPanel1.add(inc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 40, 30));

        dec1.setText("-");
        dec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dec1ActionPerformed(evt);
            }
        });
        jPanel1.add(dec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 30));

        p1.setFont(new java.awt.Font("Sitka Text", 1, 17)); // NOI18N
        p1.setForeground(new java.awt.Color(51, 51, 51));
        p1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p1.setText("p1 ");
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 30, 20));

        desc2.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        desc2.setForeground(new java.awt.Color(51, 51, 51));
        desc2.setText("desc2");
        jPanel1.add(desc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 630, 110));

        inc2.setText("+");
        inc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inc2ActionPerformed(evt);
            }
        });
        jPanel1.add(inc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 30));

        dec2.setText("-");
        dec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dec2ActionPerformed(evt);
            }
        });
        jPanel1.add(dec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, -1, 30));

        p2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        p2.setForeground(new java.awt.Color(51, 51, 51));
        p2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p2.setText("p2 ");
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 40, 30));

        desc3.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        desc3.setForeground(new java.awt.Color(51, 51, 51));
        desc3.setText("desc3");
        jPanel1.add(desc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 540, 80));

        inc3.setText("+");
        inc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inc3ActionPerformed(evt);
            }
        });
        jPanel1.add(inc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, -1, 30));

        dec3.setText("-");
        dec3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dec3ActionPerformed(evt);
            }
        });
        jPanel1.add(dec3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 840, -1, 30));

        p3.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        p3.setForeground(new java.awt.Color(51, 51, 51));
        p3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p3.setText("p3 ");
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 850, 50, 30));

        number1.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        number1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        number1.setText("0");
        jPanel1.add(number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 22, 30));

        number2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        number2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        number2.setText("0");
        jPanel1.add(number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 22, 30));

        number3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        number3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        number3.setText("0");
        jPanel1.add(number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 840, 20, 30));

        Lbl_price4.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        Lbl_price4.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_price4.setText("EGP");
        jPanel1.add(Lbl_price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1080, -1, 30));

        Lbl_price2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        Lbl_price2.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_price2.setText("EGP");
        jPanel1.add(Lbl_price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, -1, 30));

        Lbl_price1.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        Lbl_price1.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_price1.setText("EGP");
        jPanel1.add(Lbl_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 40, 20));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton1.setText("< Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        Lbl_image4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_image4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yasmeen Abdelaziz\\Downloads\\Webp.net-resizeimage (4).png")); // NOI18N
        jPanel1.add(Lbl_image4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 920, 140, 140));

        meal4name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meal4name.setForeground(new java.awt.Color(51, 51, 51));
        meal4name.setText("meal4name");
        jPanel1.add(meal4name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 920, 230, 30));

        desc4.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        desc4.setForeground(new java.awt.Color(51, 51, 51));
        desc4.setText("desc4");
        jPanel1.add(desc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 970, 540, 80));

        Lbl_price3.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        Lbl_price3.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_price3.setText("EGP");
        jPanel1.add(Lbl_price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 850, -1, 30));

        p4.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        p4.setForeground(new java.awt.Color(51, 51, 51));
        p4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p4.setText("p4 ");
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1080, 50, 30));

        dec4.setText("-");
        dec4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dec4ActionPerformed(evt);
            }
        });
        jPanel1.add(dec4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1060, -1, 30));

        inc4.setText("+");
        inc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inc4ActionPerformed(evt);
            }
        });
        jPanel1.add(inc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1060, -1, 30));

        number4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        number4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        number4.setText("0");
        jPanel1.add(number4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1060, 24, 30));

        jPanel3.setBackground(new java.awt.Color(255, 90, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 80, 0), 3, true));

        noofmeals.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        noofmeals.setForeground(new java.awt.Color(234, 233, 233));
        noofmeals.setText("0");
        noofmeals.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        noofmeals.setPreferredSize(new java.awt.Dimension(10, 16));
        noofmeals.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                noofmealsPropertyChange(evt);
            }
        });

        Lbl_total_price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_total_price.setForeground(new java.awt.Color(240, 240, 240));
        Lbl_total_price.setText("Total EGP");

        price.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("0.00");

        additem.setBackground(new java.awt.Color(244, 100, 0));
        additem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        additem.setForeground(new java.awt.Color(229, 229, 229));
        additem.setText("Add items");
        additem.setBorder(null);
        additem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        additem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                additemMouseClicked(evt);
            }
        });
        additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noofmeals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(Lbl_total_price)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_total_price)
                    .addComponent(noofmeals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 40));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void inc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inc1ActionPerformed

        if (evt.getSource() == inc1) {
            m1 = 1;
            m[0].quantityReq++;
            number1.setText(Integer.toString(m[0].quantityReq));
            price.setText(Integer.toString((int) ((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice) + (m[3].quantityReq * m[3].Mprice))));
            noofmeals.setText(Integer.toString(m[0].quantityReq + m[1].quantityReq + m[2].quantityReq + m[3].quantityReq));

        }
        viewBasket();
    }//GEN-LAST:event_inc1ActionPerformed

    private void dec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dec1ActionPerformed

        if (evt.getSource() == dec1) {
            m1 = 0;
            m[0].quantityReq--;
            if (m[0].quantityReq < 0) {
                JOptionPane.showMessageDialog(null, "No Meals Selected", "ERROR", JOptionPane.ERROR_MESSAGE, null);
                m[0].quantityReq++;
            } else {
                number1.setText(Integer.toString(m[0].quantityReq));
                price.setText(Integer.toString((int) ((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice) + (m[3].quantityReq * m[3].Mprice))));
                noofmeals.setText(Integer.toString(m[0].quantityReq + m[1].quantityReq + m[2].quantityReq + m[3].quantityReq));
            }
        }
        viewBasket();
    }//GEN-LAST:event_dec1ActionPerformed

    private void inc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inc2ActionPerformed
        if (evt.getSource() == inc2) {
            m2 = 1;
            m[1].quantityReq++;
            number2.setText(Integer.toString(m[1].quantityReq));
            price.setText(Integer.toString((int) ((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice) + (m[3].quantityReq * m[3].Mprice))));
            noofmeals.setText(Integer.toString(m[0].quantityReq + m[1].quantityReq + m[2].quantityReq + m[3].quantityReq));

        }
        viewBasket();
    }//GEN-LAST:event_inc2ActionPerformed

    private void dec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dec2ActionPerformed
        if (evt.getSource() == dec2) {
            m2 = 0;
            m[1].quantityReq--;
            if (m[1].quantityReq < 0) {
                JOptionPane.showMessageDialog(null, "No Meals Selected", "ERROR", JOptionPane.ERROR_MESSAGE, null);
                m[1].quantityReq++;
            } else {
                number2.setText(Integer.toString(m[1].quantityReq));
                price.setText(Integer.toString((int) ((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice) + (m[3].quantityReq * m[3].Mprice))));
                noofmeals.setText(Integer.toString(m[0].quantityReq + m[1].quantityReq + m[2].quantityReq + m[3].quantityReq));

            }
        }
        viewBasket();
    }//GEN-LAST:event_dec2ActionPerformed

    private void inc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inc3ActionPerformed
        if (evt.getSource() == inc3) {
            m3 = 1;
            m[2].quantityReq++;
            number3.setText(Integer.toString(m[2].quantityReq));
            price.setText(Integer.toString((int) ((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice) + (m[3].quantityReq * m[3].Mprice))));
            noofmeals.setText(Integer.toString(m[0].quantityReq + m[1].quantityReq + m[2].quantityReq + m[3].quantityReq));

        }
        viewBasket();
    }//GEN-LAST:event_inc3ActionPerformed

    private void dec3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dec3ActionPerformed
        if (evt.getSource() == dec3) {
            m3 = 0;
            m[2].quantityReq--;
            if (m[2].quantityReq < 0) {
                JOptionPane.showMessageDialog(null, "No Meals Selected", "ERROR", JOptionPane.ERROR_MESSAGE, null);
                m[2].quantityReq++;
            } else {
                number3.setText(Integer.toString(m[2].quantityReq));
                price.setText(Integer.toString((int) ((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice) + (m[3].quantityReq * m[3].Mprice))));
                noofmeals.setText(Integer.toString(m[0].quantityReq + m[1].quantityReq + m[2].quantityReq + m[3].quantityReq));
            }
        }
        viewBasket();
    }//GEN-LAST:event_dec3ActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu back_to_Menu = new Menu();
        this.dispose();
        back_to_Menu.setVisible(true);
        back_to_Menu.pack();
        back_to_Menu.setLocationRelativeTo(null);
        back_to_Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dec4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dec4ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == dec4) {
            m4 = 0;
            m[3].quantityReq--;
            if (m[3].quantityReq < 0) {
                JOptionPane.showMessageDialog(null, "No Meals Selected", "ERROR", JOptionPane.ERROR_MESSAGE, null);
                m[3].quantityReq++;
            } else {
                number4.setText(Integer.toString(m[3].quantityReq));
                price.setText(Integer.toString((int) ((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice) + (m[3].quantityReq * m[3].Mprice))));
                noofmeals.setText(Integer.toString(m[0].quantityReq + m[1].quantityReq + m[2].quantityReq + m[3].quantityReq));
            }
        }
        viewBasket();
    }//GEN-LAST:event_dec4ActionPerformed

    private void inc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inc4ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == inc4) {
            m4 = 1;
            m[3].quantityReq++;
            number4.setText(Integer.toString(m[3].quantityReq));
            price.setText(Integer.toString((int) ((m[0].quantityReq * m[0].Mprice) + (m[1].quantityReq * m[1].Mprice) + (m[2].quantityReq * m[2].Mprice) + (m[3].quantityReq * m[3].Mprice))));
            noofmeals.setText(Integer.toString(m[0].quantityReq + m[1].quantityReq + m[2].quantityReq + m[3].quantityReq));
        }
        viewBasket();
    }//GEN-LAST:event_inc4ActionPerformed

    private void additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_additemActionPerformed

    private void additemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additemMouseClicked
        // TODO add your handling code here
        int sum = m1 + m2 + m3 + m4;
        if (Integer.parseInt(number1.getText()) != 0 && Integer.parseInt(number2.getText()) == 0 && Integer.parseInt(number3.getText()) == 0 && Integer.parseInt(number4.getText()) == 0) {
            order = new OrderList(m[0], res_name, sum);
          
        } else if (Integer.parseInt(number1.getText()) != 0 && Integer.parseInt(number2.getText()) != 0 && Integer.parseInt(number3.getText()) == 0 && Integer.parseInt(number4.getText()) == 0) {
            order = new OrderList(m[0], m[1], res_name, sum);
           
        } else if (Integer.parseInt(number1.getText()) != 0 && Integer.parseInt(number2.getText()) != 0 && Integer.parseInt(number3.getText()) != 0 && Integer.parseInt(number4.getText()) == 0) {
            order = new OrderList(m[0], m[1], m[2], res_name, sum);
        
        }
        this.setVisible(false);
        order.setVisible(true);
        order.MealData();
        order.pack();
        order.setLocationRelativeTo(null);
        order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_additemMouseClicked

    private void noofmealsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_noofmealsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_noofmealsPropertyChange

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Scrolled_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scrolled_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scrolled_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scrolled_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Scrolled_Menu().setVisible(true);
            } catch (SQLException ex) {
                ex.getMessage();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_image1;
    private javax.swing.JLabel Lbl_image2;
    private javax.swing.JLabel Lbl_image3;
    private javax.swing.JLabel Lbl_image4;
    private javax.swing.JLabel Lbl_price1;
    private javax.swing.JLabel Lbl_price2;
    private javax.swing.JLabel Lbl_price3;
    private javax.swing.JLabel Lbl_price4;
    private javax.swing.JLabel Lbl_restaurant_name_image;
    private javax.swing.JLabel Lbl_total_price;
    public javax.swing.JTextField additem;
    private javax.swing.JButton dec1;
    private javax.swing.JButton dec2;
    private javax.swing.JButton dec3;
    private javax.swing.JButton dec4;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JLabel desc3;
    private javax.swing.JLabel desc4;
    private javax.swing.JButton inc1;
    private javax.swing.JButton inc2;
    private javax.swing.JButton inc3;
    private javax.swing.JButton inc4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel meal1name;
    private javax.swing.JLabel meal2name;
    private javax.swing.JLabel meal3name;
    private javax.swing.JLabel meal4name;
    private javax.swing.JLabel noofmeals;
    private javax.swing.JLabel number1;
    private javax.swing.JLabel number2;
    private javax.swing.JLabel number3;
    private javax.swing.JLabel number4;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    public javax.swing.JLabel price;
    // End of variables declaration//GEN-END:variables
}
