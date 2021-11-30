package jnotepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;

public class FrameAbout extends JFrame {

    
    public FrameAbout() {
        initComponents();
        setTitle("About");
        this.lblCopyright.setText("Copyright 2020 by Aloigi Cristiano");
        this.lblProductName.setText("Product Name: JNotepad");
        this.lblProductVersion.setText("Version: 1.0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    this.btnOk = new JButton();
    this.lblProductName = new JLabel();
    this.lblProductVersion = new JLabel();
    this.lblCopyright = new JLabel();
    setDefaultCloseOperation(3);
    this.btnOk.setText("Ok");
    this.btnOk.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            FrameAbout.this.btnOkActionPerformed(evt);
          }
        });
    this.lblProductName.setText("jLabel1");
    this.lblProductVersion.setText("jLabel1");
    this.lblCopyright.setText("jLabel1");
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addGap(39, 39, 39)
              .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.lblProductVersion)
                .addComponent(this.lblProductName)
                .addComponent(this.lblCopyright)))
            .addGroup(layout.createSequentialGroup()
              .addGap(76, 76, 76)
              .addComponent(this.btnOk, -2, 107, -2)))
          .addContainerGap(87, 32767)));
    layout.setVerticalGroup(layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addGap(21, 21, 21)
          .addComponent(this.lblProductName)
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(this.lblProductVersion)
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(this.lblCopyright)
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(this.btnOk)
          .addContainerGap(-1, 32767)));
    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(ActionEvent evt) {
        dispose();
    }
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton btnOk;

    private JLabel lblCopyright;

    private JLabel lblProductName;

    private JLabel lblProductVersion;

    // End of variables declaration//GEN-END:variables
}
