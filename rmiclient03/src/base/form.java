package base;

import java.rmi.Naming;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import operation.TovarOperation;
import types.Tovar;


public class form extends javax.swing.JFrame {

    public form() {
        
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

        dlgAdd = new javax.swing.JDialog();
        lblName = new javax.swing.JLabel();
        cmbName = new javax.swing.JComboBox<>();
        lblKol = new javax.swing.JLabel();
        spnKol = new javax.swing.JSpinner();
        lblPrice = new javax.swing.JLabel();
        lblPriceInfo = new javax.swing.JLabel();
        scrPrice = new javax.swing.JScrollBar();
        pnlConstruct = new javax.swing.JPanel();
        rdbNoParam = new javax.swing.JRadioButton();
        rdbYesParam = new javax.swing.JRadioButton();
        btnAddTovar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnGrp = new javax.swing.ButtonGroup();
        tlBar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        spr1 = new javax.swing.JToolBar.Separator();
        btnDecide = new javax.swing.JButton();
        spr2 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        lbl = new javax.swing.JLabel();
        txtTotalSumma = new javax.swing.JTextField();

        lblName.setText("Наименование");
        lblName.setName("lblName"); // NOI18N

        cmbName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Тетрадь", "Ручка", "Карандаш" }));
        cmbName.setName("cmbName"); // NOI18N

        lblKol.setText("Количество");
        lblKol.setToolTipText("");
        lblKol.setName("lblKol"); // NOI18N

        spnKol.setModel(new javax.swing.SpinnerNumberModel(10, 1, 30, 2));
        spnKol.setName("spnKol"); // NOI18N

        lblPrice.setText("Цена");
        lblPrice.setName("lblPrice"); // NOI18N

        lblPriceInfo.setText("50");
        lblPriceInfo.setToolTipText("");
        lblPriceInfo.setName("lblPriceInfo"); // NOI18N

        scrPrice.setMinimum(5);
        scrPrice.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrPrice.setValue(50);
        scrPrice.setName("srcPrice"); // NOI18N
        scrPrice.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrPriceAdjustmentValueChanged(evt);
            }
        });

        pnlConstruct.setBorder(javax.swing.BorderFactory.createTitledBorder("Конструктор"));
        pnlConstruct.setName("pnlConstruct"); // NOI18N

        btnGrp.add(rdbNoParam);
        rdbNoParam.setSelected(true);
        rdbNoParam.setText("без параметров");
        rdbNoParam.setName("rdbNoParam"); // NOI18N

        btnGrp.add(rdbYesParam);
        rdbYesParam.setText("с параметрами");
        rdbYesParam.setName("rdbYesParam"); // NOI18N

        javax.swing.GroupLayout pnlConstructLayout = new javax.swing.GroupLayout(pnlConstruct);
        pnlConstruct.setLayout(pnlConstructLayout);
        pnlConstructLayout.setHorizontalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConstructLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbNoParam)
                    .addComponent(rdbYesParam))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConstructLayout.setVerticalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConstructLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbNoParam)
                .addGap(18, 18, 18)
                .addComponent(rdbYesParam)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnAddTovar.setText("Добавить");
        btnAddTovar.setName("btnAddTovar"); // NOI18N
        btnAddTovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTovarActionPerformed(evt);
            }
        });

        btnCancel.setText("Отмена");
        btnCancel.setToolTipText("");
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgAddLayout = new javax.swing.GroupLayout(dlgAdd.getContentPane());
        dlgAdd.getContentPane().setLayout(dlgAddLayout);
        dlgAddLayout.setHorizontalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addComponent(lblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPriceInfo)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgAddLayout.createSequentialGroup()
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlConstruct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgAddLayout.createSequentialGroup()
                                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblKol))
                                .addGap(18, 18, 18)
                                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgAddLayout.createSequentialGroup()
                                .addComponent(btnAddTovar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        dlgAddLayout.setVerticalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKol)
                    .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(lblPriceInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlConstruct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTovar)
                    .addComponent(btnCancel))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа №1");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tlBar.setRollover(true);
        tlBar.setToolTipText("Файл");
        tlBar.setName("tlBar"); // NOI18N

        btnAdd.setText("Добавить");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        tlBar.add(btnAdd);

        spr1.setName("spr1"); // NOI18N
        tlBar.add(spr1);

        btnDecide.setText("Вычислить");
        btnDecide.setFocusable(false);
        btnDecide.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDecide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecide.setName("btnDecide"); // NOI18N
        btnDecide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDecide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecideActionPerformed(evt);
            }
        });
        tlBar.add(btnDecide);

        spr2.setName("spr2"); // NOI18N
        tlBar.add(spr2);

        btnExit.setText("Выход");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setName("btnExit"); // NOI18N
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        tlBar.add(btnExit);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Номер п/п", "Название", "Цена", "Количество", "Сумма"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setName("tbl"); // NOI18N
        jScrollPane1.setViewportView(tbl);

        lbl.setText("Общая сумма товара");
        lbl.setName("lbl"); // NOI18N

        txtTotalSumma.setEditable(false);
        txtTotalSumma.setName("txtTotalSumma"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlBar, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalSumma, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl)
                    .addComponent(txtTotalSumma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        dlgAdd.setSize(300, 320);
        dlgAdd.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDecideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecideActionPerformed
        // TODO add your handling code here:
        try{
            txtTotalSumma.setText(Integer.toString(tovarOperation.getSumOfTovar()));
        }catch(Exception ex){
            ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_btnDecideActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddTovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTovarActionPerformed
        // TODO add your handling code here:
        dlgAdd.setVisible(false);

        // реализовать проверку полей на правильность ввода
        Tovar el;
        if (rdbYesParam.isSelected()) {
            el = new Tovar(cmbName.getSelectedItem().toString(), (int) spnKol.getValue(), scrPrice.getValue());
        } else {
            el = new Tovar();
            el.setName(cmbName.getSelectedItem().toString());
            el.setKol((int) spnKol.getValue());
            el.setPrice(scrPrice.getValue());
        }
        
        try{
            doVivod(tovarOperation.addNewTovar(el));
        }catch (Exception ex) {
            ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Не удалось добавить. Попытайтесь повторить попытку :" + ex.getMessage() + ".",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnAddTovarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dlgAdd.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void scrPriceAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrPriceAdjustmentValueChanged
        // TODO add your handling code here:
        lblPriceInfo.setText(Integer.toString((int) scrPrice.getValue()));
    }//GEN-LAST:event_scrPriceAdjustmentValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            tovarOperation = (TovarOperation)Naming.lookup("//localhost:1199/rmiTest02"); 
            model = (DefaultTableModel)tbl.getModel(); 
            doVivod(tovarOperation.getListOfTovar());
        } catch (Exception ex) {
            ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);
        }         

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }
    
    TovarOperation tovarOperation;
    static DefaultTableModel model = new DefaultTableModel();
                                                                                                                                                                                                          

    private void doVivod(List<Tovar> lstTovar){
        doClearTable();
        int i = 1;
        for(Tovar tovar: lstTovar){
            Object[] rowData = new Object[5];
            rowData[0] = i++;
            rowData[1] = tovar.getName();
            rowData[2] = tovar.getPrice();
            rowData[3] = tovar.getKol();
            rowData[4] = tovar.getPrice() * tovar.getKol();
            model.addRow(rowData);
        }
    }
    
    private void doClearTable(){
        while (model.getRowCount()>0){
            model.removeRow(0);
        }   
  }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTovar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDecide;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JComboBox<String> cmbName;
    private javax.swing.JDialog dlgAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblKol;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceInfo;
    private javax.swing.JPanel pnlConstruct;
    private javax.swing.JRadioButton rdbNoParam;
    private javax.swing.JRadioButton rdbYesParam;
    private javax.swing.JScrollBar scrPrice;
    private javax.swing.JSpinner spnKol;
    private javax.swing.JToolBar.Separator spr1;
    private javax.swing.JToolBar.Separator spr2;
    private javax.swing.JTable tbl;
    private javax.swing.JToolBar tlBar;
    private javax.swing.JTextField txtTotalSumma;
    // End of variables declaration//GEN-END:variables
}