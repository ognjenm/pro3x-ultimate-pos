/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PromjenaOpisaArtikla.java
 *
 * Created on 2010.03.16, 21:56:03
 */

package Pro3x.View;

import Acosoft.Processing.Components.Tasks;
import Acosoft.Processing.DataBox.Roba;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import org.jdesktop.application.Action;

/**
 *
 * @author Aco
 */
public class PromjenaOpisaArtikla extends javax.swing.JInternalFrame {

    /** Creates new form PromjenaOpisaArtikla */
    public PromjenaOpisaArtikla(Roba artikal, JInternalFrame popis)
    {
        initComponents();

        setArtikal(artikal);
        setPregled(popis);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        naziv = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        opis = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(Acosoft.Processing.Pro3App.class).getContext().getResourceMap(PromjenaOpisaArtikla.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel1.border.title"))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(475, 120));

        naziv.setFont(resourceMap.getFont("naziv.font")); // NOI18N
        naziv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naziv.setText(resourceMap.getString("naziv.text")); // NOI18N
        naziv.setToolTipText(resourceMap.getString("naziv.toolTipText")); // NOI18N
        naziv.setName("naziv"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(naziv, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(naziv, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        opis.setColumns(20);
        opis.setLineWrap(true);
        opis.setRows(5);
        opis.setName("opis"); // NOI18N
        jScrollPane1.setViewportView(opis);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(Acosoft.Processing.Pro3App.class).getContext().getActionMap(PromjenaOpisaArtikla.class, this);
        jButton1.setAction(actionMap.get("Zatvori")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jButton2.setAction(actionMap.get("Spremi")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected Roba artikal;
    protected JInternalFrame pregled;

    public JInternalFrame getPregled()
    {
        return pregled;
    }

    public void setPregled(JInternalFrame pregled)
    {
        if(pregled != null)
        {
            this.pregled = pregled;
            this.pregled.addInternalFrameListener(new InternalFrameAdapter()
            {
                @Override
                public void internalFrameClosing(InternalFrameEvent e)
                {
                    Zatvori();
                }
            });
        }
    }

    public Roba getArtikal()
    {
        return artikal;
    }

    public void setArtikal(Roba artikal)
    {
        this.artikal = artikal;
        opis.setText(artikal.getDeklaracija());
        naziv.setText(artikal.getNaziv());
    }

    @Action
    public void Spremi()
    {
        getArtikal().setDeklaracija(opis.getText());
        Tasks.showMessage("Spremite promjene artikla kako bi opis artikla ostao trajno izmjenjen.");
        Zatvori();
    }

    @Action
    public void Zatvori()
    {
        try
        {
            setClosed(true);
        } catch (PropertyVetoException ex)
        {
            Logger.getLogger(PromjenaOpisaArtikla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel naziv;
    private javax.swing.JTextArea opis;
    // End of variables declaration//GEN-END:variables

}
