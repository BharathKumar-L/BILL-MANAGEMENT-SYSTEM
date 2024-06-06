/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gstbilling.employee;

import gstbilling.Connect;
import gstbilling.EmployeeHome;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


public class PreviousInvoice extends javax.swing.JInternalFrame {

    /**
     * Creates new form PreviousInvoice
     */
    public PreviousInvoice() {
        initComponents();
        fill();
    }
    private void fill(){
        try{
        Connection con=Connect.connect();
        PreparedStatement ps=con.prepareStatement("select * from productcreated");
        ResultSet rs=ps.executeQuery();
            jtableproduct.setModel(DbUtils.resultSetToTableModel(rs));
        ps=con.prepareStatement("select * from invoicecustomer");
        rs=ps.executeQuery(); 
                jtablecustomer.setModel(DbUtils.resultSetToTableModel(rs));
         ps=con.prepareStatement("select * from invoicedata");
         rs=ps.executeQuery();
                jtableproduct1.setModel(DbUtils.resultSetToTableModel(rs));
                ps=con.prepareStatement("select * from invoicedata where invoiceno in (select invoiceno from invoicecustomer where invoicedeclaredby=?)");
             String hoho=EmployeeHome.name;
              ps.setString(1,hoho);
              rs=ps.executeQuery();
              jTableown.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception ex){}
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
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableproduct = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablecustomer = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtableproduct1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableown = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Previous Invoice Detail");

        jtableproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtableproduct);

        jTabbedPane1.addTab("InvoiceProductDetail", jScrollPane2);

        jtablecustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtablecustomer);

        jTabbedPane1.addTab("InvoiceCustomerDetail", jScrollPane3);

        jtableproduct1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jtableproduct1);

        jTabbedPane1.addTab("All Invoice Product Detail", jScrollPane4);

        jTableown.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTableown);

        jTabbedPane1.addTab("own created Invoice", jScrollPane7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableown;
    private javax.swing.JTable jtablecustomer;
    private javax.swing.JTable jtableproduct;
    private javax.swing.JTable jtableproduct1;
    // End of variables declaration//GEN-END:variables
}