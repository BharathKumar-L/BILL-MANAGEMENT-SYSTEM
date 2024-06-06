package gstbilling;


import static gstbilling.Connect.connect;
import static gstbilling.FirstSetup.DB_URL;
import gstbilling.employee.Invoice;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {
public static int err=0;
   static String dbdata="";
   static File f=null;
    public Login() {
        initComponents();
         try {
          
             JFileChooser fc=new JFileChooser();
		if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
		{   f=fc.getSelectedFile();
                 }
                
             String pp="test.txt";
         f = new File(pp);
        
if(!f.exists()){
    f.createNewFile();
        FileOutputStream fos=new FileOutputStream(f);
        String out="3306,root,Bhk@2005/,billingdb";
        char[] ch=out.toCharArray();
        for(int i=0;i<ch.length;i++){
            char mm=ch[i];
            fos.write(mm);
        }
        fos.close();
fos.flush();}
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
        File f = new File("C:\\Users\\lbhar\\Downloads\\test.txt");
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
           int ch;
          
            while((ch=bis.read())!= -1){
             dbdata +=(char)ch;
            }
            bis.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FirstSetup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FirstSetup.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        StringTokenizer st=new StringTokenizer(dbdata,",");
    
        DbDatabase.setPort(st.nextToken());
        DbDatabase.setDbuser(st.nextToken());
        DbDatabase.setDbpass(st.nextToken());
        DbDatabase.setDbname(st.nextToken());
        funcon();
    }
     public static void funcon() {
            String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    String DB_URL = "jdbc:mysql://localhost:"+DbDatabase.getPort()+"/";
    String USER = DbDatabase.getDbuser();
    String PASS = DbDatabase.getDbpass();
   Connection conn = null;
   Statement stmt = null;
   try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
     /* String sql = "CREATE DATABASE billingdb";
      stmt.executeUpdate(sql);*/
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpasslabel = new javax.swing.JLabel();
        juserlabel = new javax.swing.JLabel();
        jusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        jloginbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        database = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jpasslabel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jpasslabel.setText("PASSWORD");

        juserlabel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        juserlabel.setText("USERNAME");

        jusername.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N

        jpassword.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });

        jloginbutton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jloginbutton.setText("LOGIN");
        jloginbutton.setToolTipText("CLICK ME FOR LOGIN");
        jloginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginbuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setText("GST BILLING SYSTEM LOGIN");

        database.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        database.setText("Check Connection");
        database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpasslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juserlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(database))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jloginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juserlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpasslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jloginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(database)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
    }//GEN-LAST:event_jpasswordActionPerformed

    private void jloginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginbuttonActionPerformed
       try{
         Connection con=connect();
           
           PreparedStatement ps =con.prepareStatement("Select username,name,password,role from login where username=? ");
           ps.setString(1,jusername.getText());
           ResultSet rs=ps.executeQuery();
           if(rs.next())
           {
               if("Admin".equals(rs.getString("role")))
               {
                   AdminHome.role=rs.getString("role");
                   AdminHome.name=rs.getString("name");
                   Invoice.name=rs.getString("name");
                   AdminHome ah=new AdminHome();
                   ah.setTitle("Welcome "+AdminHome.role+" name:" +AdminHome.name);
                   ah.setVisible(true);
                   this.setVisible(false);
                   
               }
               else if("Employee".equals(rs.getString("role")))
               {
                    EmployeeHome.role=rs.getString("role");
                    EmployeeHome.name=rs.getString("name");
                    Invoice.name=rs.getString("name");
                    EmployeeHome eh=new EmployeeHome();
                    eh.setTitle("Welcome "+EmployeeHome.role+" name:" +EmployeeHome.name);
                   eh.setVisible(true);
                   this.setVisible(false);
               }
               
                   
           }else{
                   JOptionPane.showMessageDialog(this, "Enter Right USERID And PASSWORD","Error Message",JOptionPane.ERROR_MESSAGE);
               }
       }
       catch(Exception ex)
       { JOptionPane.showMessageDialog(this, "Error in connecting database","Information Message",JOptionPane.INFORMATION_MESSAGE); 
       }
    }//GEN-LAST:event_jloginbuttonActionPerformed

    private void databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseActionPerformed
        
   FirstSetup fs=new FirstSetup();
        fs.setVisible(true);
    }//GEN-LAST:event_databaseActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
              if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton database;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jloginbutton;
    private javax.swing.JLabel jpasslabel;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JLabel juserlabel;
    private javax.swing.JTextField jusername;
    // End of variables declaration//GEN-END:variables
}
