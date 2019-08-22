public class BA extends javax.swing.JFrame {

    BankAcc b;
    double balance;
    int acc_no;
    int sr;
    login log;
    public BA(BankAcc a,login l) {
        b=a;
        log=l;
        balance =a.get_bal();
        acc_no=a.get_acc_no();
        initComponents();
        label2.setText("Acc no. : "+acc_no);
        Balan.setText("Balance : "+balance);
        tar.setText("Sr.no\t\tParticulars\t\tAmount\t\tBalance");
        sr=1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tar = new java.awt.TextArea();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        Balan = new java.awt.Label();
        dm = new javax.swing.JButton();
        wm = new javax.swing.JButton();
        tf = new java.awt.TextField();
        ejl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(950, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tar.setEditable(false);
        tar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        label1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        label1.setPreferredSize(new java.awt.Dimension(40, 30));
        label1.setText(" Bank");

        label2.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        label2.setText("Acc no.");

        Balan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Balan.setText("Balance");

        dm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dm.setText("Deposit Money");
        dm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmActionPerformed(evt);
            }
        });

        wm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        wm.setText("Withdraw Money");
        wm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wmActionPerformed(evt);
            }
        });

        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Enter Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(dm, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ejl, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wm)
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balan, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tar, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Balan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(wm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ejl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(tar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wmActionPerformed
        double wd ;
        wd = Double.parseDouble(tf.getText());
        if(wd<=0)
        {
            ejl.setText("\n Transaction Failed");
        }
        else{
            if(wd<=balance)
            {    
                balance-=wd;
                b.withdraw(wd);
                Balan.setText("Balance is : "+balance);
                tar.append("\n"+sr+"\t\tdebit"+"\t\t\t"+wd+"\t\t"+balance);
                sr+=1;
            }
            else
            ejl.setText("\n Transaction Failed (Balance insufficient )");
            tf.setText("0.00");
        }    
    }//GEN-LAST:event_wmActionPerformed

    private void dmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmActionPerformed
        double dep ;
        dep = Double.parseDouble(tf.getText());
        balance+=dep;
        b.Deposit(dep);
        Balan.setText("Balance is : "+balance);
        tar.append("\n"+sr+"\t\tcredit"+"\t\t\t"+dep+"\t\t"+balance);
        sr+=1;
        tf.setText("0.00");
    }//GEN-LAST:event_dmActionPerformed

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        log.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Balan;
    private javax.swing.JButton dm;
    private javax.swing.JLabel ejl;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextArea tar;
    private java.awt.TextField tf;
    private javax.swing.JButton wm;
    // End of variables declaration//GEN-END:variables
}
