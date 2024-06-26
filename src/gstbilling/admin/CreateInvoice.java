package gstbilling.admin;

import gstbilling.AdminHome;
import gstbilling.Connect;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CreateInvoice extends javax.swing.JInternalFrame {

    public CreateInvoice() {
        initComponents();
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        filldetail();
        fetch();
    }
private void filldetail()
{try{
             Connection con=Connect.connect();
             PreparedStatement ps=con.prepareStatement("Select * from companydetail");
             ResultSet rs=ps.executeQuery();
             if(rs.next())
             {
                  
                 jcompname.setText(rs.getString("companyname"));
                  jCombostate.setSelectedItem(rs.getString("state"));
                 
                    jgst.setText(rs.getString("gstinnumber"));
                        DateFill mm=new DateFill();
                        mm.fill();
                        String moni="";
                        if(Integer.parseInt(mm.getMonth())<10){
                        moni="0"+mm.getMonth();}
                        System.out.print(moni);
                     jComboyear.setSelectedItem(mm.getYear());
                     
                     jCombomonth.setSelectedItem(moni);
                     jcombodate.setSelectedItem(mm.getDate1());
                    
                     jemail.setText(rs.getString("cinnumber"));
                    String hoho=AdminHome.name;
                    jemployeedeclare.setText(hoho);
                   ps=con.prepareStatement("Select invoiceno from invoicecustomer order by sno desc limit 1");
                   rs=ps.executeQuery();
                   if(rs.next()){
                   String st=rs.getString("invoiceno");
                   String ft=st.substring(0,3);
                   String lt=st.substring(7,10);
                   int lts=Integer.parseInt(lt);
                    lts=lts+1;
                    lt=String.valueOf(lts);
                     st=ft+mm.getYear()+lt;
                     int len=st.length();
                     len=10-len;
                     if(len==1)
                         lt=lt.replace(lt,"0"+lt);
                     if(len==2)
                    
                        lt=lt.replace(lt, "00"+lt);
                      st=ft+mm.getYear()+lt;
                     jinvoice.setText(st);
                   }
             }
             
        
        }catch(Exception ex){}}
          
private void fetch()
    {  try{
            
          Connection con=Connect.connect();
          PreparedStatement ps=con.prepareStatement("select * from productcreated");
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {  
                 jComboprod1.addItem(rs.getString("productname"));
                 jComboprod2.addItem(rs.getString("productname"));
                 jComboprod3.addItem(rs.getString("productname"));
                 
                 
             }
      }
      catch(Exception ex){ JOptionPane.showMessageDialog(this, "Error"+ex,"Information Message",JOptionPane.INFORMATION_MESSAGE);}}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcompname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jinvoice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcombodate = new javax.swing.JComboBox();
        jCombomonth = new javax.swing.JComboBox();
        jComboyear = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jCombostate = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jgst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboprod1 = new javax.swing.JComboBox();
        jComboqt1 = new javax.swing.JComboBox();
        jamount1 = new javax.swing.JTextField();
        jfinalamount1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jcgst1 = new javax.swing.JTextField();
        jcgstrate1 = new javax.swing.JTextField();
        jcgstfinal1 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jsgst1 = new javax.swing.JTextField();
        jsgstrate1 = new javax.swing.JTextField();
        jsgstfinal1 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jigst1 = new javax.swing.JTextField();
        jigstrate1 = new javax.swing.JTextField();
        jigstfinal1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jpaneltotal1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox8 = new javax.swing.JComboBox();
        jComboprod2 = new javax.swing.JComboBox();
        jComboqt2 = new javax.swing.JComboBox();
        jamount2 = new javax.swing.JTextField();
        jfinalamount2 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jcgst2 = new javax.swing.JTextField();
        jcgstrate2 = new javax.swing.JTextField();
        jcgstfinal2 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jsgst2 = new javax.swing.JTextField();
        jsgstrate2 = new javax.swing.JTextField();
        jsgstfinal2 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jigst2 = new javax.swing.JTextField();
        jigstrate2 = new javax.swing.JTextField();
        jigstfinal2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jpaneltotal2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox11 = new javax.swing.JComboBox();
        jComboprod3 = new javax.swing.JComboBox();
        jComboqt3 = new javax.swing.JComboBox();
        jamount3 = new javax.swing.JTextField();
        jfinalamount3 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jcgst3 = new javax.swing.JTextField();
        jcgstrate3 = new javax.swing.JTextField();
        jcgstfinal3 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jsgst3 = new javax.swing.JTextField();
        jsgstrate3 = new javax.swing.JTextField();
        jsgstfinal3 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jigst3 = new javax.swing.JTextField();
        jigstrate3 = new javax.swing.JTextField();
        jigstfinal3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jpaneltotal3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jsavebutton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jothercharges = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jnetamount = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jemployeedeclare = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Create Invoice");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Company Name");

        jcompname.setEditable(false);
        jcompname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jcompname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcompnameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setText("Invoice Number");

        jinvoice.setEditable(false);
        jinvoice.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinvoiceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("Date");

        jcombodate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jcombodate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jcombodate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombodateActionPerformed(evt);
            }
        });

        jCombomonth.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jCombomonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jCombomonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombomonthActionPerformed(evt);
            }
        });

        jComboyear.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2017", "2018", "2019", "2020" }));
        jComboyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboyearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setText("State");

        jCombostate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jCombostate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Andra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttaranchal", "Uttar Pradesh", "West Bengal" }));
        jCombostate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombostateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setText("GST/TIN No");

        jgst.setEditable(false);
        jgst.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jgst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgstActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel7.setText("CIN Number");

        jemail.setEditable(false);
        jemail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setText("Product Name");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel9.setText("Quantity");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setText("Rate");

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setText("Amount");

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setText("SNo");

        jComboBox7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));

        jComboprod1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboprod1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboprod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboprod1ActionPerformed(evt);
            }
        });

        jComboqt1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboqt1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        jComboqt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboqt1ActionPerformed(evt);
            }
        });

        jamount1.setEditable(false);
        jamount1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jfinalamount1.setEditable(false);
        jfinalamount1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jfinalamount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfinalamount1ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField5.setText("CGST@");

        jcgst1.setEditable(false);
        jcgst1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jcgst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcgst1ActionPerformed(evt);
            }
        });

        jcgstrate1.setEditable(false);
        jcgstrate1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jcgstfinal1.setEditable(false);
        jcgstfinal1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField11.setText("SGST@");

        jsgst1.setEditable(false);
        jsgst1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jsgst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsgst1ActionPerformed(evt);
            }
        });

        jsgstrate1.setEditable(false);
        jsgstrate1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jsgstrate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsgstrate1ActionPerformed(evt);
            }
        });

        jsgstfinal1.setEditable(false);
        jsgstfinal1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField16.setText("IGST@");

        jigst1.setEditable(false);
        jigst1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jigst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jigst1ActionPerformed(evt);
            }
        });

        jigstrate1.setEditable(false);
        jigstrate1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jigstrate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jigstrate1ActionPerformed(evt);
            }
        });

        jigstfinal1.setEditable(false);
        jigstfinal1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jigstfinal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jigstfinal1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel13.setText("Total Amount");

        jpaneltotal1.setEditable(false);
        jpaneltotal1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jpaneltotal1.setText("0.0");

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel16.setText("%");

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel17.setText("%");

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel18.setText("%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jComboprod1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboqt1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jcgst1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jigst1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jsgst1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jamount1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstrate1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstrate1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstrate1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jigstfinal1)
                            .addComponent(jsgstfinal1)
                            .addComponent(jpaneltotal1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jfinalamount1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jcgstfinal1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboprod1)
                    .addComponent(jComboqt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jamount1)
                    .addComponent(jfinalamount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstrate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstrate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstrate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jpaneltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jButton1.setText("ADD ITEM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2" }));

        jComboprod2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboprod2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboprod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboprod2ActionPerformed(evt);
            }
        });

        jComboqt2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboqt2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        jComboqt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboqt2ActionPerformed(evt);
            }
        });

        jamount2.setEditable(false);
        jamount2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jfinalamount2.setEditable(false);
        jfinalamount2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField21.setText("CGST");

        jcgst2.setEditable(false);
        jcgst2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jcgstrate2.setEditable(false);
        jcgstrate2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jcgstfinal2.setEditable(false);
        jcgstfinal2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField25.setText("SGST");

        jsgst2.setEditable(false);
        jsgst2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jsgstrate2.setEditable(false);
        jsgstrate2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jsgstrate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsgstrate2ActionPerformed(evt);
            }
        });

        jsgstfinal2.setEditable(false);
        jsgstfinal2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jTextField29.setEditable(false);
        jTextField29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField29.setText("IGST");

        jigst2.setEditable(false);
        jigst2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jigstrate2.setEditable(false);
        jigstrate2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jigstrate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jigstrate2ActionPerformed(evt);
            }
        });

        jigstfinal2.setEditable(false);
        jigstfinal2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel14.setText("Total Amount");

        jpaneltotal2.setEditable(false);
        jpaneltotal2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jpaneltotal2.setText("0.0");

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel20.setText("%");

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel21.setText("%");

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel24.setText("%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jComboprod2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboqt2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jigst2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jcgst2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jsgst2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jamount2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstrate2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstrate2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstrate2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jigstfinal2)
                            .addComponent(jsgstfinal2)
                            .addComponent(jpaneltotal2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jfinalamount2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcgstfinal2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboprod2)
                    .addComponent(jComboqt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jamount2)
                    .addComponent(jfinalamount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstrate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstfinal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstrate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstfinal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstrate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstfinal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jpaneltotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jComboBox11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3" }));

        jComboprod3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboprod3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboprod3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboprod3ActionPerformed(evt);
            }
        });

        jComboqt3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jComboqt3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        jComboqt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboqt3ActionPerformed(evt);
            }
        });

        jamount3.setEditable(false);
        jamount3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jfinalamount3.setEditable(false);
        jfinalamount3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jTextField37.setEditable(false);
        jTextField37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField37.setText("CGST");

        jcgst3.setEditable(false);
        jcgst3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jcgstrate3.setEditable(false);
        jcgstrate3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jcgstfinal3.setEditable(false);
        jcgstfinal3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jTextField41.setEditable(false);
        jTextField41.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField41.setText("SGST");

        jsgst3.setEditable(false);
        jsgst3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jsgstrate3.setEditable(false);
        jsgstrate3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jsgstrate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsgstrate3ActionPerformed(evt);
            }
        });

        jsgstfinal3.setEditable(false);
        jsgstfinal3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jTextField45.setEditable(false);
        jTextField45.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTextField45.setText("IGST");

        jigst3.setEditable(false);
        jigst3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jigstrate3.setEditable(false);
        jigstrate3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jigstrate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jigstrate3ActionPerformed(evt);
            }
        });

        jigstfinal3.setEditable(false);
        jigstfinal3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel15.setText("Total Amount");

        jpaneltotal3.setEditable(false);
        jpaneltotal3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jpaneltotal3.setText("0.0");

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel19.setText("%");

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel25.setText("%");

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel26.setText("%");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jComboprod3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jsgst3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboqt3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jcgst3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jigst3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jamount3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstrate3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstrate3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstrate3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jigstfinal3)
                            .addComponent(jsgstfinal3)
                            .addComponent(jpaneltotal3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addGap(0, 88, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jfinalamount3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcgstfinal3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboprod3)
                    .addComponent(jComboqt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jamount3)
                    .addComponent(jfinalamount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstrate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcgstfinal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstrate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsgstfinal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstrate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jigstfinal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jpaneltotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jsavebutton.setText("Save");
        jsavebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsavebuttonActionPerformed(evt);
            }
        });

        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel22.setText("Other Charges");

        jothercharges.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jothercharges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jotherchargesKeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel23.setText("Net Amount");

        jnetamount.setEditable(false);
        jnetamount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jnetamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnetamountActionPerformed(evt);
            }
        });

        jemployeedeclare.setEditable(false);
        jemployeedeclare.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jemployeedeclare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemployeedeclareActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setText("Invoice Declared By");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jButton1)
                                .addGap(269, 269, 269))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jgst, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcombodate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCombomonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboyear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCombostate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(256, 256, 256))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcompname, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(258, 258, 258))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(300, 300, 300)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jnetamount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jothercharges, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(198, 198, 198)
                            .addComponent(jsavebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(89, 89, 89)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(315, 315, 315)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jemployeedeclare, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(626, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcompname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcombodate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombomonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboyear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jCombostate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgst, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jothercharges, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnetamount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jemployeedeclare, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsavebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jemployeedeclareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemployeedeclareActionPerformed

    }//GEN-LAST:event_jemployeedeclareActionPerformed

    private void jnetamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnetamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnetamountActionPerformed

    private void jotherchargesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jotherchargesKeyReleased
        try{   double tp1;
            double tp2;
            double tp3;
            tp1=Double.parseDouble(jpaneltotal1.getText());
            tp2=Double.parseDouble(jpaneltotal2.getText());
            tp3=Double.parseDouble(jpaneltotal3.getText());
            double kk=tp1+tp2+tp3+Double.parseDouble(jothercharges.getText());
            jnetamount.setText(String.valueOf(kk));
        }catch(Exception ex){}
    }//GEN-LAST:event_jotherchargesKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new BillPrintable(),getPageFormat(pj));
        try {
            pj.print();

        }
        catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jsavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsavebuttonActionPerformed
        try{
            Connection con=Connect.connect();
            PreparedStatement ps=con.prepareStatement("insert into invoiceproduct (invoiceno,typeofprod,date,prod1,quant1,prod2,quant2,prod3,quant3,othercharges,netamount) values(?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,jinvoice.getText());
            ps.setString(2, String.valueOf(panel-1));
            String date=jcombodate.getSelectedItem().toString();
            String month=jCombomonth.getSelectedItem().toString();
            String year=jComboyear.getSelectedItem().toString();
            String dates=year+"-"+month+"-"+date;
            Date dd=Date.valueOf(dates);
            ps.setString(3, dd.toString());
            ps.setString(4,jComboprod1.getSelectedItem().toString());
            ps.setString(5, jComboqt1.getSelectedItem().toString());
            ps.setString(6, jComboprod2.getSelectedItem().toString());
            ps.setString(7, jComboqt2.getSelectedItem().toString());
            ps.setString(8, jComboprod3.getSelectedItem().toString());
            ps.setString(9, jComboqt3.getSelectedItem().toString());
            ps.setString(10,jothercharges.getText());
            ps.setString(11,jnetamount.getText());
            int a=ps.executeUpdate();
            ps=con.prepareStatement("insert into invoicecustomer (invoiceno,invoicedeclaredby) values(?,?)");

            ps.setString(1,jinvoice.getText());
            ps.setString(2,jemployeedeclare.getText());
            int b=ps.executeUpdate();
            if((a>0)&&(b>0))
            {JOptionPane.showMessageDialog(this, "SUCCESSFULLY CREATED ","Information Message",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            JOptionPane.showMessageDialog(this, "RECHANGED SOME ERROR OCCUR","Information Message",JOptionPane.INFORMATION_MESSAGE);

        }catch(Exception ex){JOptionPane.showMessageDialog(this, "Error"+ex,"Information Message",JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_jsavebuttonActionPerformed

    private void jigstrate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jigstrate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jigstrate3ActionPerformed

    private void jsgstrate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsgstrate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsgstrate3ActionPerformed

    private void jComboqt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboqt3ActionPerformed
        fill();
    }//GEN-LAST:event_jComboqt3ActionPerformed

    private void jComboprod3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboprod3ActionPerformed
        try{

            Connection con=Connect.connect();
            PreparedStatement ps=con.prepareStatement("select * from productcreated where productname=?");
            ps.setString(1,jComboprod3.getSelectedItem().toString());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                jamount3.setText(rs.getString("price"));
                jcgst3.setText(rs.getString("cgstper"));
                jsgst3.setText(rs.getString("sgstper"));
                jigst3.setText(rs.getString("igstper"));
                jfinalamount3.setText("");
                jComboqt3.setSelectedIndex(1);

            }
        }
        catch(Exception ex){ JOptionPane.showMessageDialog(this, "Error"+ex,"Information Message",JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_jComboprod3ActionPerformed

    private void jigstrate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jigstrate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jigstrate2ActionPerformed

    private void jsgstrate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsgstrate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsgstrate2ActionPerformed

    private void jComboqt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboqt2ActionPerformed
        try{String quantity=jComboqt2.getSelectedItem().toString();
            double quan=Double.parseDouble(quantity);
            String amount=jamount2.getText();
            double amt=Double.parseDouble(amount);
            double res=quan*amt;
            String resu=String.valueOf(res);
            double total1=res;
            jfinalamount2.setText(resu);
            String quantity1=jcgst2.getText();
            double quan1=Double.parseDouble(quantity1);
            double cres=((double)(amt*quan1)/100);
            String cresu=String.valueOf(cres);
            jcgstrate2.setText(cresu);
            double cresa1=((double)(res*quan1)/100);
            String cresua=String.valueOf(cresa1);
            jcgstfinal2.setText(cresua);
            //-------------------------------------------------------------------------
            quantity1=jsgst2.getText();
            quan1=Double.parseDouble(quantity1);
            cres=((double)(amt*quan1)/100);
            cresu=String.valueOf(cres);
            jsgstrate2.setText(cresu);
            double  cresa2=((double)(res*quan1)/100);
            cresua=String.valueOf(cresa2);
            jsgstfinal2.setText(cresua);
            //----------------------------------------------------------------------------
            quantity1=jigst2.getText();
            quan1=Double.parseDouble(quantity1);
            cres=((double)(amt*quan1)/100);
            cresu=String.valueOf(cres);
            jigstrate2.setText(cresu);
            double  cresa=((double)(res*quan1)/100);
            cresua=String.valueOf(cresa);
            jigstfinal2.setText(cresua);
            double result2=cresa+cresa2+cresa1+total1;
            String out1=String.valueOf(result2);
            jpaneltotal2.setText(out1);}catch(Exception ex){}
    }//GEN-LAST:event_jComboqt2ActionPerformed

    private void jComboprod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboprod2ActionPerformed
        try{

            Connection con=Connect.connect();
            PreparedStatement ps=con.prepareStatement("select * from productcreated where productname=?");
            ps.setString(1,jComboprod2.getSelectedItem().toString());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                jamount2.setText(rs.getString("price"));
                jcgst2.setText(rs.getString("cgstper"));
                jsgst2.setText(rs.getString("sgstper"));
                jigst2.setText(rs.getString("igstper"));
                jfinalamount2.setText("");
                jComboqt2.setSelectedIndex(1);

            }
        }
        catch(Exception ex){ JOptionPane.showMessageDialog(this, "Error"+ex,"Information Message",JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_jComboprod2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(3==panel)
        { jPanel4.setVisible(true);panel++;}
        if(2==panel)
        {    jPanel3.setVisible(true);panel++;}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jigstfinal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jigstfinal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jigstfinal1ActionPerformed

    private void jigstrate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jigstrate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jigstrate1ActionPerformed

    private void jigst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jigst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jigst1ActionPerformed

    private void jsgstrate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsgstrate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsgstrate1ActionPerformed

    private void jsgst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsgst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsgst1ActionPerformed

    private void jcgst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcgst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcgst1ActionPerformed

    private void jfinalamount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfinalamount1ActionPerformed

    }//GEN-LAST:event_jfinalamount1ActionPerformed

    private void jComboqt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboqt1ActionPerformed
        try{String quantity=jComboqt1.getSelectedItem().toString();
            double quan=Double.parseDouble(quantity);
            String amount=jamount1.getText();
            double amt=Double.parseDouble(amount);
            double res=quan*amt;
            String resu=String.valueOf(res);
            double total1=res;
            jfinalamount1.setText(resu);
            String quantity1=jcgst1.getText();
            double quan1=Double.parseDouble(quantity1);
            double cres=((double)(amt*quan1)/100);
            String cresu=String.valueOf(cres);
            jcgstrate1.setText(cresu);
            double cresa1=((double)(res*quan1)/100);
            String cresua=String.valueOf(cresa1);
            jcgstfinal1.setText(cresua);
            //-------------------------------------------------------------------------
            quantity1=jsgst1.getText();
            quan1=Double.parseDouble(quantity1);
            cres=((double)(amt*quan1)/100);
            cresu=String.valueOf(cres);
            jsgstrate1.setText(cresu);
            double  cresa2=((double)(res*quan1)/100);
            cresua=String.valueOf(cresa2);
            jsgstfinal1.setText(cresua);
            //----------------------------------------------------------------------------
            quantity1=jigst1.getText();
            quan1=Double.parseDouble(quantity1);
            cres=((double)(amt*quan1)/100);
            cresu=String.valueOf(cres);
            jigstrate1.setText(cresu);
            double  cresa=((double)(res*quan1)/100);
            cresua=String.valueOf(cresa);
            jigstfinal1.setText(cresua);
            double result1=cresa+cresa2+cresa1+total1;
            String out1=String.valueOf(result1);
            jpaneltotal1.setText(out1);}catch(Exception ex){}
    }//GEN-LAST:event_jComboqt1ActionPerformed

    private void jComboprod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboprod1ActionPerformed
        try{

            Connection con=Connect.connect();
            PreparedStatement ps=con.prepareStatement("select * from productcreated where productname=?");
            ps.setString(1,jComboprod1.getSelectedItem().toString());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                jamount1.setText(rs.getString("price"));
                jcgst1.setText(rs.getString("cgstper"));
                jsgst1.setText(rs.getString("sgstper"));
                jigst1.setText(rs.getString("igstper"));
                jfinalamount1.setText("");
                jComboqt1.setSelectedIndex(1);

            }
        }
        catch(Exception ex){ JOptionPane.showMessageDialog(this, "Error"+ex,"Information Message",JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_jComboprod1ActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailActionPerformed

    private void jgstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgstActionPerformed

    private void jCombostateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombostateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombostateActionPerformed

    private void jComboyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboyearActionPerformed

    private void jCombomonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombomonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombomonthActionPerformed

    private void jcombodateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombodateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombodateActionPerformed

    private void jinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jinvoiceActionPerformed

    private void jcompnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcompnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcompnameActionPerformed
private static int amount1,amount2,amount3;            static  double result1=0,result2=0,result3=0;        private double cresa1;
    private void fill(){
        try{String quantity=jComboqt3.getSelectedItem().toString();
       double quan=Double.parseDouble(quantity);
             String amount=jamount3.getText();
       double amt=Double.parseDouble(amount);
       double res=quan*amt;       
       String resu=String.valueOf(res);
       double total1=res;
       jfinalamount3.setText(resu);
       String quantity1=jcgst3.getText();
       double quan1=Double.parseDouble(quantity1);
       double cres=((double)(amt*quan1)/100);
       String cresu=String.valueOf(cres);
       jcgstrate3.setText(cresu);
       double cresa1=((double)(res*quan1)/100);
       String cresua=String.valueOf(cresa1);
       jcgstfinal3.setText(cresua); 
       //-------------------------------------------------------------------------
         quantity1=jsgst3.getText();
        quan1=Double.parseDouble(quantity1);
        cres=((double)(amt*quan1)/100);
        cresu=String.valueOf(cres);
       jsgstrate3.setText(cresu);
      double  cresa2=((double)(res*quan1)/100);
       cresua=String.valueOf(cresa2);
       jsgstfinal3.setText(cresua); 
       //----------------------------------------------------------------------------
        quantity1=jigst3.getText();
        quan1=Double.parseDouble(quantity1);
        cres=((double)(amt*quan1)/100);
        cresu=String.valueOf(cres);
       jigstrate3.setText(cresu);
      double  cresa=((double)(res*quan1)/100);
        cresua=String.valueOf(cresa);
       jigstfinal3.setText(cresua);
       double result3=cresa+cresa2+cresa1+total1;
       String out1=String.valueOf(result3);
       jpaneltotal3.setText(out1);}catch(Exception ex){}}public class BillPrintable implements Printable {
    
   
    
    
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
      
                
        
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    

            double width = pageFormat.getImageableWidth();                    
           
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 
           
            ////////// code by alqama//////////////

            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        //    int idLength=metrics.stringWidth("000000");
            //int idLength=metrics.stringWidth("00");
            int idLength=metrics.stringWidth("000");
            int amtLength=metrics.stringWidth("000000");
            int qtyLength=metrics.stringWidth("00000");
            int priceLength=metrics.stringWidth("000000");
            int prodLength=(int)width - idLength - amtLength - qtyLength - priceLength-17;

        //    int idPosition=0;
        //    int productPosition=idPosition + idLength + 2;
        //    int pricePosition=productPosition + prodLength +10;
        //    int qtyPosition=pricePosition + priceLength + 2;
        //    int amtPosition=qtyPosition + qtyLength + 2;
            
            int productPosition = 0;
            int discountPosition= prodLength+5;
            int pricePosition = discountPosition +idLength+10;
            int qtyPosition=pricePosition + priceLength + 4;
            int amtPosition=qtyPosition + qtyLength;
            
            
              
        try{
            /*Draw Header*/
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            int headerRectHeighta=40;
            
           
           
            ///////////////// Product price Get ///////////
                
             g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            
            g2d.drawLine(12, y, 580, y);
            g2d.drawLine(409,y,409,480);
            g2d.drawLine(12, y, 12, 480);y+=yShift;
            g2d.drawString("                                                                  ",12,y);y+=yShift;
            g2d.drawString("                               "+jcompname.getText()+"                                          ",12,y);y+=yShift;
            
            g2d.drawString(" ------------------------------------------------------------------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString(" Invoice No:- "+jinvoice.getText(),12, y);
            g2d.drawString(" CIN NO:-"+jemail.getText(),290, y);y+=yShift;
             g2d.drawString(" Date:- "+jcombodate.getSelectedItem().toString()+"-"+jCombomonth.getSelectedItem().toString()+"-"+jComboyear.getSelectedItem().toString(),12, y);
            g2d.drawString(" GST NO:-"+jgst.getText(),290, y);y+=yShift;
             g2d.drawString(" -----------------------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Product             Quantity              Rate                   Amount      ",10,y);y+=yShift;
            g2d.drawString(" --------------------------------------------------------------------------------------------------",10,y);y+=headerRectHeight;
             g2d.drawString("                                                                                                 ",10,y);y+=yShift;
            g2d.drawString(" "+jComboprod1.getSelectedItem().toString(),10,y);
            g2d.drawString(jComboqt1.getSelectedItem().toString(),135,y);
            g2d.drawString(jamount1.getText(),245,y);
            g2d.drawString(jfinalamount1.getText(),365, y);y+=yShift;
            
            g2d.drawString(" "+jTextField5.getText()+""+jcgst1.getText(),10,y);
            g2d.drawString(jcgstrate1.getText(),245,y);
            g2d.drawString(jcgstfinal1.getText(),365,y);y+=yShift;
            
           
            g2d.drawString(" "+jTextField11.getText()+""+jsgst1.getText(),10,y);
            g2d.drawString(jsgstrate1.getText(),245,y);
            g2d.drawString(jsgstfinal1.getText(),365,y);y+=yShift;
            
            g2d.drawString(" "+jTextField16.getText()+jigst1.getText(),10,y);
            g2d.drawString(jigstrate1.getText(),245,y);
            g2d.drawString(jigstfinal1.getText(),365,y);y+=yShift;
           
         
            
             g2d.drawString("                                                                                                 ",10,y);y+=yShift;
            if(!jamount2.getText().isEmpty())
            {
                  g2d.drawString(" "+jComboprod2.getSelectedItem().toString(),10,y);
            g2d.drawString(jComboqt2.getSelectedItem().toString(),135,y);
            g2d.drawString(jamount2.getText(),245,y);
            g2d.drawString(jfinalamount2.getText(),365, y);y+=yShift;
            
            g2d.drawString(" "+jTextField5.getText()+jcgst2.getText(),10,y);
            g2d.drawString(jcgstrate2.getText(),245,y);
            g2d.drawString(jcgstfinal2.getText(),365,y);y+=yShift;
          
            g2d.drawString(" "+jTextField11.getText()+jsgst2.getText(),10,y);
            g2d.drawString(jsgst2.getText(),245,y);
            g2d.drawString(jsgstfinal2.getText(),365,y);y+=yShift;
            
            g2d.drawString(" "+jTextField16.getText()+jigst2.getText(),10,y);
            g2d.drawString(jigst2.getText(),245,y);
            g2d.drawString(jigstfinal2.getText(),365,y);y+=yShift;
         
           
            }
             g2d.drawString("                                                                                                     ",10,y);y+=yShift;
            if(!jamount3.getText().isEmpty())
            {
                g2d.drawString(" "+jComboprod3.getSelectedItem().toString(),10,y);
            g2d.drawString(jComboqt3.getSelectedItem().toString(),135,y);
            g2d.drawString(jamount3.getText(),245,y);
            g2d.drawString(jfinalamount1.getText(),365, y);y+=yShift;
            
             g2d.drawString(" "+jTextField5.getText()+jcgst3.getText(),10,y);
            g2d.drawString(jcgstrate3.getText(),245,y);
            g2d.drawString(jcgstfinal3.getText(),365,y);y+=yShift;
            
            g2d.drawString(" "+jTextField11.getText()+jsgst3.getText(),10,y);
            g2d.drawString(jsgst3.getText(),245,y);
            g2d.drawString(jsgstfinal3.getText(),365,y);y+=yShift;
            
           g2d.drawString(" "+jTextField16.getText()+jigst3.getText(),10,y);
            g2d.drawString(jigst3.getText(),245,y);
            g2d.drawString(jigstfinal3.getText(),365,y);y+=yShift;
            
            
            }
            g2d.drawString(" ---------------------------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Other Charges    ",10,y);
            g2d.drawString(jothercharges.getText(),245,y);y+=yShift;
            g2d.drawString(" Net Amount  ",10,y);
            g2d.drawString(jnetamount.getText(),365,y);y+=yShift;
            g2d.drawString(" ---------------------------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString("                                                                                                   ",10,y);y+=yShift;
            g2d.drawString("                                                                                                    ",10,y);y+=yShift;
            g2d.drawString(" ---------------------------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString("                ",10,y);y+=yShift;
            g2d.drawString(" Invoice Declared By: "+jemployeedeclare.getText()+"            ", 10, y);y+=yShift;
            g2d.drawString("                                                                  ",10,y);y+=yShift;
           g2d.drawString(" Signature:             ", 10, y);y+=yShift;
           g2d.drawString("                                                                  ",10,y);y+=yShift;
           g2d.drawString("                                                                  ",10,y);y+=yShift;
           g2d.drawLine(12, 480, 580, 480);y+=yShift;
          
                   
           
             
           
            
  g2d.setFont(new Font("Monospaced",Font.BOLD,10));
  g2d.drawString("Customer Shopping Invoice", 30,y);y+=yShift; 
          

    }
    catch(Exception r){
    r.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }
   }
  public PageFormat getPageFormat(PrinterJob pj)
{
    
    PageFormat pf = pj.defaultPage();
    Paper paper = pf.getPaper();    

    double middleHeight =13.0;  
    double headerHeight = 4.0;                  
    double footerHeight = 4.0;                  
    double width = convert_CM_To_PPI(14.8);      
    double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
    paper.setSize(width, height);
    paper.setImageableArea(                    
        0,
        10,
        width-10,            
        height - convert_CM_To_PPI(0.5)
    );  
            
    pf.setOrientation(PageFormat.PORTRAIT);        
    pf.setPaper(paper);    

    return pf;
}
    protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
}
 
protected static double toPPI(double inch) {            
	        return inch * 72d;            
}    int panel = 2;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jCombomonth;
    private javax.swing.JComboBox jComboprod1;
    private javax.swing.JComboBox jComboprod2;
    private javax.swing.JComboBox jComboprod3;
    private javax.swing.JComboBox jComboqt1;
    private javax.swing.JComboBox jComboqt2;
    private javax.swing.JComboBox jComboqt3;
    private javax.swing.JComboBox jCombostate;
    private javax.swing.JComboBox jComboyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jamount1;
    private javax.swing.JTextField jamount2;
    private javax.swing.JTextField jamount3;
    private javax.swing.JTextField jcgst1;
    private javax.swing.JTextField jcgst2;
    private javax.swing.JTextField jcgst3;
    private javax.swing.JTextField jcgstfinal1;
    private javax.swing.JTextField jcgstfinal2;
    private javax.swing.JTextField jcgstfinal3;
    private javax.swing.JTextField jcgstrate1;
    private javax.swing.JTextField jcgstrate2;
    private javax.swing.JTextField jcgstrate3;
    private javax.swing.JComboBox jcombodate;
    private javax.swing.JTextField jcompname;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jemployeedeclare;
    private javax.swing.JTextField jfinalamount1;
    private javax.swing.JTextField jfinalamount2;
    private javax.swing.JTextField jfinalamount3;
    private javax.swing.JTextField jgst;
    private javax.swing.JTextField jigst1;
    private javax.swing.JTextField jigst2;
    private javax.swing.JTextField jigst3;
    private javax.swing.JTextField jigstfinal1;
    private javax.swing.JTextField jigstfinal2;
    private javax.swing.JTextField jigstfinal3;
    private javax.swing.JTextField jigstrate1;
    private javax.swing.JTextField jigstrate2;
    private javax.swing.JTextField jigstrate3;
    private javax.swing.JTextField jinvoice;
    private javax.swing.JTextField jnetamount;
    private javax.swing.JTextField jothercharges;
    private javax.swing.JTextField jpaneltotal1;
    private javax.swing.JTextField jpaneltotal2;
    private javax.swing.JTextField jpaneltotal3;
    private javax.swing.JButton jsavebutton;
    private javax.swing.JTextField jsgst1;
    private javax.swing.JTextField jsgst2;
    private javax.swing.JTextField jsgst3;
    private javax.swing.JTextField jsgstfinal1;
    private javax.swing.JTextField jsgstfinal2;
    private javax.swing.JTextField jsgstfinal3;
    private javax.swing.JTextField jsgstrate1;
    private javax.swing.JTextField jsgstrate2;
    private javax.swing.JTextField jsgstrate3;
    // End of variables declaration//GEN-END:variables
}
