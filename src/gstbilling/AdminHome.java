package gstbilling;
import gstbilling.admin.CreateNewUser;
import gstbilling.admin.EditClassification;
import gstbilling.admin.GstClassificationCreation;
import gstbilling.admin.GstCompanyDetail;
import gstbilling.admin.PreviousInvoice;
import gstbilling.admin.changepassword;
import gstbilling.employee.Invoice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminHome extends javax.swing.JFrame {
   public static String role;
    public static String name;
    public AdminHome() {
        initComponents();
          try{
             Connection con=Connect.connect();
             PreparedStatement ps=con.prepareStatement("Select * from companydetail");
             ResultSet rs=ps.executeQuery();
             if(rs.next())
             {
                 jregistertype.setText(rs.getString("registrationtype"));
                 jcomname.setText(rs.getString("companyname"));
                 jcomstate.setText(rs.getString("state"));
                 jgst.setText(rs.getString("gstinnumber"));
                 
             }
        }catch(Exception ex){}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jcomdetailbutton = new javax.swing.JButton();
        jprevinvoice = new javax.swing.JButton();
        jcreateinvoicebutton = new javax.swing.JButton();
        jnewuser = new javax.swing.JButton();
        jcomname = new javax.swing.JLabel();
        jregistertype = new javax.swing.JLabel();
        jgst = new javax.swing.JLabel();
        jchangepassbutton1 = new javax.swing.JButton();
        jclassificationbutton1 = new javax.swing.JButton();
        jclassedit = new javax.swing.JButton();
        jclassificationview1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jcomstate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(230, 230, 230));
        desktopPane.setAutoscrolls(true);
        desktopPane.setInheritsPopupMenu(true);

        jcomdetailbutton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jcomdetailbutton.setText("GST COMPANY DETAIL");
        jcomdetailbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomdetailbuttonActionPerformed(evt);
            }
        });
        desktopPane.add(jcomdetailbutton);
        jcomdetailbutton.setBounds(340, 180, 260, 40);

        jprevinvoice.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jprevinvoice.setText("PREVIOUS INVOICE DETAIL");
        jprevinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprevinvoiceActionPerformed(evt);
            }
        });
        desktopPane.add(jprevinvoice);
        jprevinvoice.setBounds(340, 240, 260, 40);

        jcreateinvoicebutton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jcreateinvoicebutton.setText("CREATE INVOICE");
        jcreateinvoicebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcreateinvoicebuttonActionPerformed(evt);
            }
        });
        desktopPane.add(jcreateinvoicebutton);
        jcreateinvoicebutton.setBounds(340, 300, 260, 40);

        jnewuser.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jnewuser.setText("CREATE NEW USER");
        jnewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnewuserActionPerformed(evt);
            }
        });
        desktopPane.add(jnewuser);
        jnewuser.setBounds(340, 420, 260, 40);

        jcomname.setBackground(new java.awt.Color(204, 204, 204));
        jcomname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 48)); // NOI18N
        jcomname.setForeground(new java.awt.Color(0, 0, 0));
        jcomname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desktopPane.add(jcomname);
        jcomname.setBounds(360, 30, 740, 80);

        jregistertype.setBackground(new java.awt.Color(0, 0, 0));
        jregistertype.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jregistertype.setForeground(new java.awt.Color(0, 0, 0));
        jregistertype.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desktopPane.add(jregistertype);
        jregistertype.setBounds(770, 180, 250, 40);

        jgst.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jgst.setForeground(new java.awt.Color(0, 0, 0));
        jgst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desktopPane.add(jgst);
        jgst.setBounds(780, 300, 230, 40);

        jchangepassbutton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jchangepassbutton1.setText("CHANGE PASSWORD");
        jchangepassbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchangepassbutton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jchangepassbutton1);
        jchangepassbutton1.setBounds(340, 360, 260, 40);

        jclassificationbutton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jclassificationbutton1.setText("GST CLASSIFICATION CREATION");
        jclassificationbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclassificationbutton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jclassificationbutton1);
        jclassificationbutton1.setBounds(340, 480, 260, 40);

        jclassedit.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jclassedit.setText("GST CLASSIFICATION UPD/DEL");
        jclassedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclasseditActionPerformed(evt);
            }
        });
        desktopPane.add(jclassedit);
        jclassedit.setBounds(770, 360, 260, 40);

        jclassificationview1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jclassificationview1.setText("GST CLASSIFICATION VIEW");
        jclassificationview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclassificationview1ActionPerformed(evt);
            }
        });
        desktopPane.add(jclassificationview1);
        jclassificationview1.setBounds(770, 420, 260, 40);

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(770, 480, 260, 40);

        jcomstate.setBackground(new java.awt.Color(0, 0, 0));
        jcomstate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jcomstate.setForeground(new java.awt.Color(0, 0, 0));
        jcomstate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desktopPane.add(jcomstate);
        jcomstate.setBounds(770, 240, 240, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image11.jpg"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(4, 4, 1360, 680);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcomdetailbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomdetailbuttonActionPerformed
  
        gstbilling.admin.GstCompanyDetail gc=new GstCompanyDetail();
        desktopPane.add(gc);
        gc.setVisible(true);
    }//GEN-LAST:event_jcomdetailbuttonActionPerformed

    private void jnewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnewuserActionPerformed
         gstbilling.admin.CreateNewUser cnu=new CreateNewUser();
        desktopPane.add(cnu);
        cnu.setVisible(true);
    }//GEN-LAST:event_jnewuserActionPerformed

    private void jchangepassbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchangepassbutton1ActionPerformed
        gstbilling.admin.changepassword cp=new changepassword();
        desktopPane.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jchangepassbutton1ActionPerformed

    private void jclassificationbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclassificationbutton1ActionPerformed
         gstbilling.admin.GstClassificationCreation gcc=new GstClassificationCreation();
        desktopPane.add(gcc);
        gcc.setVisible(true);
    }//GEN-LAST:event_jclassificationbutton1ActionPerformed

    private void jclasseditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclasseditActionPerformed
     gstbilling.admin.EditClassification ec=new EditClassification();
     desktopPane.add(ec);
     ec.setVisible(true);
    }//GEN-LAST:event_jclasseditActionPerformed

    private void jcreateinvoicebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcreateinvoicebuttonActionPerformed
        Invoice ci=new Invoice();
        desktopPane.add(ci);
        ci.setVisible(true);
    }//GEN-LAST:event_jcreateinvoicebuttonActionPerformed

    private void jprevinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprevinvoiceActionPerformed
                PreviousInvoice pi=new PreviousInvoice();
                desktopPane.add(pi);
                pi.setVisible(true);
    }//GEN-LAST:event_jprevinvoiceActionPerformed

    private void jclassificationview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclassificationview1ActionPerformed
      gstbilling.employee.ViewProduct vp=new gstbilling.employee.ViewProduct();
      desktopPane.add(vp);
      vp.setVisible(true);
    }//GEN-LAST:event_jclassificationview1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jchangepassbutton1;
    private javax.swing.JButton jclassedit;
    private javax.swing.JButton jclassificationbutton1;
    private javax.swing.JButton jclassificationview1;
    private javax.swing.JButton jcomdetailbutton;
    private javax.swing.JLabel jcomname;
    private javax.swing.JLabel jcomstate;
    private javax.swing.JButton jcreateinvoicebutton;
    private javax.swing.JLabel jgst;
    private javax.swing.JButton jnewuser;
    private javax.swing.JButton jprevinvoice;
    private javax.swing.JLabel jregistertype;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
