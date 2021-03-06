/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icap.pvvih.view;

import com.icap.pvvih.model.Users;
import com.icap.pvvih.util.Res;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.swingx.JXHyperlink;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author DELL
 */
public class PVVIH extends javax.swing.JFrame {

    /**
     * Creates new form PVVIH
     *
     * @param connectedUser
     */
    public PVVIH(Users connectedUser) {
        currentUser=connectedUser;
        doPreConfig();
        initComponents();
        doDefaultConfig(connectedUser);
    }
    
    private void doDefaultConfig(Users currentUser) {
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.pack();
        this.setExtendedState(PVVIH.MAXIMIZED_BOTH);
        this.setTitle("PVVIH DC 1.0");
        lblConnectedUser.setText(currentUser.getPrenom() + " " + currentUser.getNom() + " connected.");
        tsWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        
        final JXHyperlink lblHome = new JXHyperlink();
        lblHome.setText("Home");
        final JXHyperlink lblDE = new JXHyperlink();
        lblDE.setText("Data Entry");
         final JXHyperlink lblSearch = new JXHyperlink();
        lblSearch.setText("Research");
        final JXHyperlink lblSignout = new JXHyperlink();
        lblSignout.setText("Sign out");
        final JXHyperlink lblUser = new JXHyperlink();
        lblUser.setText("User manager");
        
        taskActions.add(lblHome);
        taskActions.add(lblDE);
         taskActions.add(lblSearch);
        taskOthers.add(lblUser);
        taskOthers.add(lblSignout);
        if (!"Admin".equals(currentUser.getRole())) {
             lblUser.setVisible(false); 
        }
        // Add actions in all Hyperlink
        lblHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scrollManager.setViewportView(createDemoPanel());
            }
        });
        
        lblDE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              scrollManager.setViewportView(new PSurvey(currentUser));  
            }
        });
        
         lblSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              scrollManager.setViewportView(new PSearch());  
            }
        });
        
        lblUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             scrollManager.setViewportView(new PUserMan());   
            }
        });
        
        lblSignout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSignoutActionPerformed(e);
            }
        });
        scrollManager.setViewportView(createDemoPanel());
    }
    
    private void doPreConfig() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        ImageIcon image = new ImageIcon(getClass().getResource(Res.LOGO_APP));
        this.setIconImage(image.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        lblConnectedUser = new org.jdesktop.swingx.JXLabel();
        btnSignout = new org.jdesktop.swingx.JXButton();
        taskPaneCentral = new org.jdesktop.swingx.JXTaskPaneContainer();
        taskActions = new org.jdesktop.swingx.JXTaskPane();
        taskOthers = new org.jdesktop.swingx.JXTaskPane();
        panCentral = new org.jdesktop.swingx.JXPanel();
        scrollManager = new javax.swing.JScrollPane();
        tsWelcome = new org.jdesktop.swingx.JXTitledSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jXPanel1.setBackground(java.awt.Color.white);

        lblConnectedUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icap/pvvih/res/icons8-customer-24.png"))); // NOI18N
        lblConnectedUser.setText("jXLabel1");

        btnSignout.setBackground(java.awt.Color.white);
        btnSignout.setBorder(null);
        btnSignout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icap/pvvih/res/icons8-sign-out-24.png"))); // NOI18N
        btnSignout.setText("Sign out");
        btnSignout.setFocusable(false);
        btnSignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoutActionPerformed(evt);
            }
        });

        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        taskPaneCentral.setLayout(verticalLayout1);

        taskActions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icap/pvvih/res/icons8-action-24.png"))); // NOI18N
        taskActions.setTitle("Actions");
        taskPaneCentral.add(taskActions);

        taskOthers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icap/pvvih/res/icons8-inactive-state-24.png"))); // NOI18N
        taskOthers.setTitle("Others");
        taskPaneCentral.add(taskOthers);

        panCentral.setBackground(java.awt.Color.white);
        panCentral.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        scrollManager.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout panCentralLayout = new javax.swing.GroupLayout(panCentral);
        panCentral.setLayout(panCentralLayout);
        panCentralLayout.setHorizontalGroup(
            panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollManager)
        );
        panCentralLayout.setVerticalGroup(
            panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollManager)
        );

        tsWelcome.setTitle("Welcome !");

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskPaneCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGap(0, 612, Short.MAX_VALUE)
                        .addComponent(lblConnectedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSignout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tsWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConnectedUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(tsWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(taskPaneCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoutActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnSignoutActionPerformed
    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("IPhone 5s", new Double(20));        
        dataset.setValue("SamSung Grand", new Double(20));        
        dataset.setValue("MotoG", new Double(40));        
        dataset.setValue("Nokia Lumia", new Double(10));        
        return dataset;        
    }
    
    private static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Data stored statistics", // chart title 
                dataset, // data    
                true, // include legend   
                true,
                false);
        
        return chart;
    }
    
    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());        
        return new ChartPanel(chart);        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnSignout;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXLabel lblConnectedUser;
    private org.jdesktop.swingx.JXPanel panCentral;
    public static javax.swing.JScrollPane scrollManager;
    private org.jdesktop.swingx.JXTaskPane taskActions;
    private org.jdesktop.swingx.JXTaskPane taskOthers;
    public static org.jdesktop.swingx.JXTaskPaneContainer taskPaneCentral;
    private org.jdesktop.swingx.JXTitledSeparator tsWelcome;
    // End of variables declaration//GEN-END:variables
EntityManager em;
EntityManagerFactory emf;
Users currentUser;
}
