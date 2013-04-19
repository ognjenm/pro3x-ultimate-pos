/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PregledZapisnikaPromjeneCijena.java
 *
 * Created on 2010.01.20, 20:09:46
 */

package Pro3x.Zapisnici;

import Acosoft.Processing.Components.Code;
import Acosoft.Processing.Components.DateCellRenderer;
import Acosoft.Processing.Components.ExceptionView;
import Acosoft.Processing.Components.NumberCellRenderer;
import Acosoft.Processing.Components.Tasks;
import Acosoft.Processing.Pro3App;
import Acosoft.Processing.Pro3Postavke;
import Acosoft.Processing.Pro3View;
import Pro3x.Code.ReportingServices;
import Pro3x.Code.TaskPromjeneCijena;
import Pro3x.Code.ZapisnikPromjeneCijene;
import Pro3x.View.PregledKartice;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperPrint;
import org.jdesktop.application.Action;
import org.jdesktop.application.Task;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Aco
 */
public class PregledZapisnikaPromjeneCijena extends javax.swing.JInternalFrame {

    private SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy");

    /** Creates new form PregledZapisnikaPromjeneCijena */
    public PregledZapisnikaPromjeneCijena()
    {
        this.zapisnici = ObservableCollections.observableList(new LinkedList<ZapisnikPromjeneCijene>());
        initComponents();
        
        getRootPane().setDefaultButton(btnZatvori);
    }

    protected List<ZapisnikPromjeneCijene> zapisnici;

    public List<ZapisnikPromjeneCijene> getZapisnici()
    {
        return zapisnici;
    }

    public void setZapisnici(List<ZapisnikPromjeneCijene> zapisnici)
    {
        this.zapisnici.clear();
        this.zapisnici.addAll(zapisnici);

        Code.ScrollToLastRow(jTable1);
        Code.SelectLastRow(jTable1);
    }

    protected ZapisnikPromjeneCijene zapisnik;
    public static final String PROP_ZAPISNIK = "zapisnik";

    public ZapisnikPromjeneCijene getZapisnik()
    {
        return zapisnik;
    }

    public void setZapisnik(ZapisnikPromjeneCijene zapisnik)
    {
        ZapisnikPromjeneCijene oldZapisnik = this.zapisnik;
        this.zapisnik = zapisnik;
        firePropertyChange(PROP_ZAPISNIK, oldZapisnik, zapisnik);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        raspon = new javax.swing.JTextField();
        btnZatvori = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnOsvjezi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(Acosoft.Processing.Pro3App.class).getContext().getResourceMap(PregledZapisnikaPromjeneCijena.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        raspon.setText(resourceMap.getString("raspon.text")); // NOI18N
        raspon.setName("raspon"); // NOI18N
        raspon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rasponFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rasponFocusLost(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(Acosoft.Processing.Pro3App.class).getContext().getActionMap(PregledZapisnikaPromjeneCijena.class, this);
        btnZatvori.setAction(actionMap.get("Zatvori")); // NOI18N
        btnZatvori.setText(resourceMap.getString("btnZatvori.text")); // NOI18N
        btnZatvori.setName("btnZatvori"); // NOI18N

        jButton2.setAction(actionMap.get("IspisZapisnikaPromjenaCijena")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        btnOsvjezi.setAction(actionMap.get("UcitajZapisnike")); // NOI18N
        btnOsvjezi.setText(resourceMap.getString("btnOsvjezi.text")); // NOI18N
        btnOsvjezi.setName("btnOsvjezi"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setName("jTable1"); // NOI18N
        jTable1.setRowHeight(24);
        jTable1.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${zapisnici}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${datum}"));
        columnBinding.setColumnName("Datum");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${artikal.naziv}"));
        columnBinding.setColumnName("Artikal.naziv");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kolicina}"));
        columnBinding.setColumnName("Kolicina");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${staraCijena}"));
        columnBinding.setColumnName("Stara Cijena");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${novaCijena}"));
        columnBinding.setColumnName("Nova Cijena");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${zapisnik}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable1.columnModel.title0")); // NOI18N
        jTable1.getColumnModel().getColumn(0).setCellRenderer(new DateCellRenderer("dd.MM.yyyy HH:mm"));
        jTable1.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable1.columnModel.title1")); // NOI18N
        jTable1.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("jTable1.columnModel.title2")); // NOI18N
        jTable1.getColumnModel().getColumn(2).setCellRenderer(new NumberCellRenderer());
        jTable1.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("jTable1.columnModel.title3")); // NOI18N
        jTable1.getColumnModel().getColumn(3).setCellRenderer(new NumberCellRenderer());
        jTable1.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("jTable1.columnModel.title4")); // NOI18N
        jTable1.getColumnModel().getColumn(4).setCellRenderer(new NumberCellRenderer());

        jButton4.setAction(actionMap.get("OtvoriKarticu")); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(raspon, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOsvjezi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZatvori)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZatvori)
                    .addComponent(jButton2)
                    .addComponent(btnOsvjezi)
                    .addComponent(raspon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rasponFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_rasponFocusGained
    {//GEN-HEADEREND:event_rasponFocusGained
        if(raspon.getText().equals("Podesi vremenski raspon"))
        {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 1);
            Date kraj = cal.getTime();

            cal.set(Calendar.HOUR, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.DATE, 1);

            Date pocetak = cal.getTime();

            raspon.setText(sf.format(pocetak) + "-" + sf.format(kraj));
            raspon.setHorizontalAlignment(JTextField.CENTER);
        }
        
        getRootPane().setDefaultButton(btnOsvjezi);
    }//GEN-LAST:event_rasponFocusGained

    private void rasponFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rasponFocusLost
        getRootPane().setDefaultButton(btnZatvori);
    }//GEN-LAST:event_rasponFocusLost

    @Action(block = Task.BlockingScope.COMPONENT)
    public Task UcitajZapisnike()
    {
        try
        {
            String[] datumi = raspon.getText().split("-");
            
            Date pocetak = sf.parse(datumi[0]);
            Date kraj = sf.parse(datumi[1]);

            return new TaskPromjeneCijena(pocetak, kraj, this);
        }
        catch (ParseException ex)
        {
            Logger.getLogger(PregledZapisnikaPromjeneCijena.class.getName()).log(Level.SEVERE, null, ex);

            raspon.requestFocusInWindow();
            raspon.selectAll();

            new ExceptionView(ex).setVisible(true);

            return null;
        }
    }

    @Action
    public void Zatvori()
    {
        try
        {
            setClosed(true);
        }
        catch (PropertyVetoException ex)
        {
            Logger.getLogger(PregledZapisnikaPromjeneCijena.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Action
    public void OtvoriKarticu()
    {
        ZapisnikPromjeneCijene odabraniZapisnik = getZapisnik();

        if(odabraniZapisnik != null)
        {
            Pro3View view = (Pro3View) Pro3App.getApplication().getMainView();

            if(odabraniZapisnik.getKartica() != null)
                view.Show(new PregledKartice(odabraniZapisnik.getArtikal(),
                        odabraniZapisnik.getKartica().getSid()));
            else
                view.Show(new PregledKartice(odabraniZapisnik.getArtikal()));
        }
        else Tasks.showMessage("Izaberite zapisnik za prikaz kartice artikla");
    }
    
    @Action
    public void IspisZapisnikaPromjenaCijena()
    {
        if(zapisnici.size() == 0)
        {
            Pro3App app = Pro3App.getApplication();
            app.getContext().getTaskService().execute(new Task(app) 
            {
                @Override
                protected Object doInBackground() throws Exception 
                {
                    setMessage("U zadanom periodu nema zapisnika o promjeni cijena.");
                    return null;
                }
            });
            
            return;
        }
        
        try
        {
            HashMap params = new HashMap();
            params.put("Logo", Pro3Postavke.getLogoStream());
            params.put("Zaglavlje", Pro3Postavke.getInfo().getZaglavlje());

            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            params.put("Datum", sdf.format(Calendar.getInstance().getTime()));

            List<ZapisnikPromjeneCijene> data = zapisnici;
            
            Collections.sort(data, new Comparator<ZapisnikPromjeneCijene>() 
            {
                public int compare(ZapisnikPromjeneCijene o1, ZapisnikPromjeneCijene o2) 
                {
                    return o1.getArtikal().getNaziv().compareTo(o2.getArtikal().getNaziv());
                }
            });
            
            String report = ReportingServices.Reports.ZapisnikPromjenaCijena.getPath();
            JasperPrint jp = ReportingServices.LoadReport(ReportingServices.class, report, params, data);
            ReportingServices.ShowReport(jp, "Ispis zapisnika o promjeni cijena", "ispis-zapisnika-promjena-cijena");
        }
        catch (Exception ex)
        {
            Logger.getLogger(PregledZapisnikaPromjeneCijena.class.getName()).log(Level.SEVERE, null, ex);
            new ExceptionView(ex).setVisible(true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOsvjezi;
    private javax.swing.JButton btnZatvori;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField raspon;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}