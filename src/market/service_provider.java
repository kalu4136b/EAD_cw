/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author ranat
 */
public class service_provider extends javax.swing.JFrame {

 dbConnn ob1 = new dbConnn();
    
    Connection Con;
    PreparedStatement psmt;
    
    public service_provider() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        btn_reg4 = new com.k33ptoo.components.KButton();
        btn_reg5 = new com.k33ptoo.components.KButton();
        btn_reg6 = new com.k33ptoo.components.KButton();
        btn_reg7 = new com.k33ptoo.components.KButton();
        btn_reg11 = new com.k33ptoo.components.KButton();
        tbp_cus = new raven.tabbed.TabbedPaneCustom();
        Dashboard = new javax.swing.JPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        txt_welcome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_UCuser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_UCcur_pw = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_UCnew_pw = new javax.swing.JTextField();
        btn_reg9 = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_UCuser1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_UCuser2 = new javax.swing.JTextField();
        btn_reg10 = new com.k33ptoo.components.KButton();
        txt_UCuser3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        services = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmb_service = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        btn_reg8 = new com.k33ptoo.components.KButton();
        txt_comName = new javax.swing.JTextField();
        txt_comPac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 204));

        btn_reg4.setText("Add Service");
        btn_reg4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_reg4.setIconTextGap(40);
        btn_reg4.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btn_reg4.setkEndColor(new java.awt.Color(0, 153, 204));
        btn_reg4.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_reg4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_reg4.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btn_reg4.setkPressedColor(new java.awt.Color(0, 153, 204));
        btn_reg4.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btn_reg4.setkStartColor(new java.awt.Color(0, 153, 204));
        btn_reg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg4ActionPerformed(evt);
            }
        });

        btn_reg5.setText("Settings");
        btn_reg5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_reg5.setIconTextGap(40);
        btn_reg5.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btn_reg5.setkEndColor(new java.awt.Color(0, 153, 204));
        btn_reg5.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_reg5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_reg5.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btn_reg5.setkPressedColor(new java.awt.Color(0, 153, 204));
        btn_reg5.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btn_reg5.setkStartColor(new java.awt.Color(0, 153, 204));
        btn_reg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg5ActionPerformed(evt);
            }
        });

        btn_reg6.setText("Subscribers");
        btn_reg6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_reg6.setIconTextGap(40);
        btn_reg6.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btn_reg6.setkEndColor(new java.awt.Color(0, 153, 204));
        btn_reg6.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_reg6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_reg6.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btn_reg6.setkPressedColor(new java.awt.Color(0, 153, 204));
        btn_reg6.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btn_reg6.setkStartColor(new java.awt.Color(0, 153, 204));
        btn_reg6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg6ActionPerformed(evt);
            }
        });

        btn_reg7.setText("Dashboard");
        btn_reg7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_reg7.setIconTextGap(40);
        btn_reg7.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btn_reg7.setkEndColor(new java.awt.Color(0, 153, 204));
        btn_reg7.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_reg7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_reg7.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btn_reg7.setkPressedColor(new java.awt.Color(0, 153, 204));
        btn_reg7.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btn_reg7.setkStartColor(new java.awt.Color(0, 153, 204));
        btn_reg7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg7ActionPerformed(evt);
            }
        });

        btn_reg11.setText("Logout");
        btn_reg11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_reg11.setIconTextGap(40);
        btn_reg11.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btn_reg11.setkEndColor(new java.awt.Color(0, 153, 204));
        btn_reg11.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_reg11.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_reg11.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btn_reg11.setkPressedColor(new java.awt.Color(0, 153, 204));
        btn_reg11.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btn_reg11.setkStartColor(new java.awt.Color(0, 153, 204));
        btn_reg11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_reg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_reg6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_reg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(btn_reg7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btn_reg11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btn_reg7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reg6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btn_reg11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.LINE_START);

        tbp_cus.setSelectedColor(new java.awt.Color(255, 255, 255));

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkBorderRadius(30);
        kGradientPanel2.setkEndColor(new java.awt.Color(51, 255, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 204, 153));

        txt_welcome.setFont(new java.awt.Font("STHupo", 0, 29)); // NOI18N
        txt_welcome.setForeground(new java.awt.Color(255, 255, 255));
        txt_welcome.setText("WELCOME");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txt_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txt_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        tbp_cus.addTab("", Dashboard);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );

        tbp_cus.addTab("", jPanel3);

        settings.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Add Bank Details");

        jLabel11.setText("User Name");

        jLabel10.setText("Current Password");

        jLabel12.setText("New password");

        btn_reg9.setText("update ");
        btn_reg9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_reg9.setIconTextGap(40);
        btn_reg9.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btn_reg9.setkEndColor(new java.awt.Color(0, 153, 204));
        btn_reg9.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_reg9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_reg9.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btn_reg9.setkPressedColor(new java.awt.Color(0, 153, 204));
        btn_reg9.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btn_reg9.setkStartColor(new java.awt.Color(0, 153, 204));
        btn_reg9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg9ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Password Change");

        jLabel13.setText("Account  Name");

        jLabel14.setText("Account Number");

        btn_reg10.setText("Add");
        btn_reg10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_reg10.setIconTextGap(40);
        btn_reg10.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btn_reg10.setkEndColor(new java.awt.Color(0, 153, 204));
        btn_reg10.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_reg10.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_reg10.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btn_reg10.setkPressedColor(new java.awt.Color(0, 153, 204));
        btn_reg10.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btn_reg10.setkStartColor(new java.awt.Color(0, 153, 204));
        btn_reg10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg10ActionPerformed(evt);
            }
        });

        jLabel15.setText("OTP");

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_UCuser3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_UCuser1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_UCcur_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_UCuser, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_UCnew_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_UCuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_reg10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reg9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_UCuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_UCcur_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_UCnew_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reg9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_UCuser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_UCuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_UCuser3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reg10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        tbp_cus.addTab("", settings);

        services.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Select Service Type");

        cmb_service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Television ", "Telecommunication ", " ", " " }));
        cmb_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_serviceActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter Company Name to Display User ");

        jLabel17.setText("Service name");

        jLabel18.setText("price");

        txt_price.setText("0.00");
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });

        btn_reg8.setText("Add");
        btn_reg8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_reg8.setIconTextGap(40);
        btn_reg8.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btn_reg8.setkEndColor(new java.awt.Color(0, 153, 204));
        btn_reg8.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_reg8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_reg8.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        btn_reg8.setkPressedColor(new java.awt.Color(0, 153, 204));
        btn_reg8.setkSelectedColor(new java.awt.Color(0, 153, 153));
        btn_reg8.setkStartColor(new java.awt.Color(0, 153, 204));
        btn_reg8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg8ActionPerformed(evt);
            }
        });

        txt_comName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Add Services");

        javax.swing.GroupLayout servicesLayout = new javax.swing.GroupLayout(services);
        services.setLayout(servicesLayout);
        servicesLayout.setHorizontalGroup(
            servicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicesLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(servicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_service, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_comName, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(servicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, servicesLayout.createSequentialGroup()
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_reg8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_comPac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        servicesLayout.setVerticalGroup(
            servicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicesLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_comName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_service, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_comPac, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(servicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reg8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        tbp_cus.addTab("", services);

        getContentPane().add(tbp_cus, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg4ActionPerformed
        tbp_cus.setSelectedIndex(2);
    }//GEN-LAST:event_btn_reg4ActionPerformed

    private void btn_reg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg5ActionPerformed
            tbp_cus.setSelectedIndex(3);
    }//GEN-LAST:event_btn_reg5ActionPerformed

    private void btn_reg6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg6ActionPerformed
        tbp_cus.setSelectedIndex(1);
    }//GEN-LAST:event_btn_reg6ActionPerformed

    private void btn_reg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg7ActionPerformed
      tbp_cus.setSelectedIndex(0);
    }//GEN-LAST:event_btn_reg7ActionPerformed

    private void btn_reg9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg9ActionPerformed
       

    }//GEN-LAST:event_btn_reg9ActionPerformed

    private void btn_reg10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reg10ActionPerformed

    private void btn_reg11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg11ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Are you sure to Logout from the Current session!", "alert", HEIGHT);

        Login l1 = new Login();
        l1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_reg11ActionPerformed

    private void btn_reg8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg8ActionPerformed
      
        Con = ob1.getConnection();
        
        String com_name = txt_comName.getText();
        String srv = txt_comPac.getText();
        String pri = txt_price.getText();
        
        
        try{
            psmt=Con.prepareStatement("Insert into `"+com_name+"`(com_name,service,price)values(?,?,?)");
        
             
             psmt.setString(1,com_name);
             psmt.setString(2, srv);
             psmt.setString(3,pri);
             psmt.executeUpdate();
             
             JOptionPane.showMessageDialog(rootPane, "Success!");
             
             txt_comName.setText(null);
             txt_comPac.setText(null);
             txt_price.setText(null);
             
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        
    }//GEN-LAST:event_btn_reg8ActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_comNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_comNameActionPerformed

    private void cmb_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_serviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_serviceActionPerformed

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
            java.util.logging.Logger.getLogger(service_provider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(service_provider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(service_provider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(service_provider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new service_provider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private com.k33ptoo.components.KButton btn_reg10;
    private com.k33ptoo.components.KButton btn_reg11;
    private com.k33ptoo.components.KButton btn_reg4;
    private com.k33ptoo.components.KButton btn_reg5;
    private com.k33ptoo.components.KButton btn_reg6;
    private com.k33ptoo.components.KButton btn_reg7;
    private com.k33ptoo.components.KButton btn_reg8;
    private com.k33ptoo.components.KButton btn_reg9;
    private javax.swing.JComboBox<String> cmb_service;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel services;
    private javax.swing.JPanel settings;
    private raven.tabbed.TabbedPaneCustom tbp_cus;
    private javax.swing.JTextField txt_UCcur_pw;
    private javax.swing.JTextField txt_UCnew_pw;
    private javax.swing.JTextField txt_UCuser;
    private javax.swing.JTextField txt_UCuser1;
    private javax.swing.JTextField txt_UCuser2;
    private javax.swing.JTextField txt_UCuser3;
    private javax.swing.JTextField txt_comName;
    private javax.swing.JTextField txt_comPac;
    private javax.swing.JTextField txt_price;
    public javax.swing.JLabel txt_welcome;
    // End of variables declaration//GEN-END:variables
}
