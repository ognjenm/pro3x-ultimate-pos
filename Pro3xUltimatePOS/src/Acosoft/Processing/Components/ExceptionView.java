// Pro3x Community project
// Copyright (C) 2009  Aleksandar Zgonjan
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, http://www.gnu.org/licenses/gpl.html

package Acosoft.Processing.Components;

import Acosoft.Processing.Pro3App;
import Pro3x.Code.Helpdesk;
import Pro3x.Configuration.General;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.mail.Address;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.jdesktop.application.Action;
import org.jfree.data.gantt.TaskSeries;

/**
 *
 * @author  nonstop
 */
public class ExceptionView extends javax.swing.JDialog {
    
    /** Creates new form ExceptionView */
    public ExceptionView(String opis) {
        
        initComponents();
        //cmdEmail.setVisible(false);
        Configure(opis);
    }

    public ExceptionView(Throwable exp)
    {
        initComponents();

        StringWriter str = new StringWriter();
        PrintWriter print = new PrintWriter(str);

        exp.printStackTrace(print);
        //cmdEmail.setVisible(false);
        Configure(str.toString());
    }

    @Override
    public void setVisible(boolean b)
    {
        cmdEmail.setVisible(General.isKoristiTehnickuPodrsku());
        setLocationRelativeTo(null);
        super.setVisible(b);
    }

    private void Configure(String opis)
    {
        detalji.setText(opis);
        detalji.select(0, 0);

        try
        {
            URL url = ExceptionView.class.getResource("resources/blockdevice.png");
            this.setIconImage(ImageIO.read(url));
        }
        catch (IOException ex)
        {
            Logger.getLogger(ExceptionView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalji = new javax.swing.JTextArea();
        cmdZatvori = new javax.swing.JButton();
        cmdKopiraj = new javax.swing.JButton();
        cmdEmail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(Acosoft.Processing.Pro3App.class).getContext().getResourceMap(ExceptionView.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModal(true);
        setName("Form"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setName("jScrollPane2"); // NOI18N

        detalji.setColumns(20);
        detalji.setEditable(false);
        detalji.setRows(5);
        detalji.setName("detalji"); // NOI18N
        jScrollPane2.setViewportView(detalji);

        cmdZatvori.setText(resourceMap.getString("cmdZatvori.text")); // NOI18N
        cmdZatvori.setName("cmdZatvori"); // NOI18N
        cmdZatvori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdZatvoriActionPerformed(evt);
            }
        });

        cmdKopiraj.setText(resourceMap.getString("cmdKopiraj.text")); // NOI18N
        cmdKopiraj.setName("cmdKopiraj"); // NOI18N
        cmdKopiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKopirajActionPerformed(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(Acosoft.Processing.Pro3App.class).getContext().getActionMap(ExceptionView.class, this);
        cmdEmail.setAction(actionMap.get("PosaljiMail")); // NOI18N
        cmdEmail.setText(resourceMap.getString("cmdEmail.text")); // NOI18N
        cmdEmail.setName("cmdEmail"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addComponent(cmdKopiraj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdZatvori)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdZatvori)
                    .addComponent(cmdKopiraj)
                    .addComponent(cmdEmail))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdZatvoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdZatvoriActionPerformed
        dispose();
}//GEN-LAST:event_cmdZatvoriActionPerformed

    @Action
    public void PosaljiMail()
    {
        try
        {
            Helpdesk helpdesk = Pro3App.getApplication().getHelpdeskInfo();

            Properties props = new Properties();
            props.put("mail.smtp.host", helpdesk.getMailServer());

            Session session = Session.getDefaultInstance(props);

            MimeMessage msg = new MimeMessage(session);
            msg.setSubject(helpdesk.getSubject());
            msg.setFrom(new InternetAddress(helpdesk.getFromMail()));
            msg.setRecipient(RecipientType.TO, new InternetAddress(helpdesk.getToMail()));

            msg.setText(detalji.getText());

            Transport.send(msg);
            Tasks.showMessage("Poruka je uspješno poslana.");

            dispose();
        }
        catch (Exception ex)
        {
            Logger.getLogger(ExceptionView.class.getName()).log(Level.SEVERE, null, ex);
            Tasks.showMessage("Greška pri slanju maila: " + ex.getMessage());
        }
    }

    private void cmdKopirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKopirajActionPerformed
        detalji.selectAll();
        detalji.copy();
        detalji.select(0, 0);
}//GEN-LAST:event_cmdKopirajActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdEmail;
    private javax.swing.JButton cmdKopiraj;
    private javax.swing.JButton cmdZatvori;
    private javax.swing.JTextArea detalji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
}