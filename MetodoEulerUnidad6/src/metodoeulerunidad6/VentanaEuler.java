package metodoeulerunidad6;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class VentanaEuler extends javax.swing.JFrame {

    public VentanaEuler() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iciclo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valorFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ValorInicial = new javax.swing.JTextField();
        incremento = new javax.swing.JTextField();
        Ejecutar = new javax.swing.JButton();
        BotonReiniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEuler = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Metodo Euler");

        jLabel2.setText("Iteraciones :");

        iciclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icicloActionPerformed(evt);
            }
        });

        jLabel3.setText("Y(0):");

        jLabel4.setText("X:");

        jLabel5.setText("h:");

        Ejecutar.setBackground(new java.awt.Color(51, 51, 51));
        Ejecutar.setForeground(new java.awt.Color(255, 255, 255));
        Ejecutar.setText("Ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        BotonReiniciar.setBackground(new java.awt.Color(0, 204, 204));
        BotonReiniciar.setText("Reiniciar");
        BotonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReiniciarActionPerformed(evt);
            }
        });

        TablaEuler.setBackground(new java.awt.Color(102, 255, 102));
        TablaEuler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaEuler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "i", "X", "Y"
            }
        ));
        jScrollPane1.setViewportView(TablaEuler);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonReiniciar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(iciclo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(ValorInicial))))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(incremento, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addComponent(valorFinal))
                            .addGap(40, 40, 40)
                            .addComponent(Ejecutar))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(iciclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ejecutar)
                    .addComponent(jLabel3)
                    .addComponent(valorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(incremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonReiniciar)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icicloActionPerformed

    private void BotonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReiniciarActionPerformed
        ValorInicial.setText("");
        valorFinal.setText("");
        iciclo.setText("");
        incremento.setText("");
    }//GEN-LAST:event_BotonReiniciarActionPerformed

    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
        
        try{
        double Y = Double.parseDouble(this.valorFinal.getText().trim());
        double X = Double.parseDouble(this.ValorInicial.getText().trim());
        double h = Double.parseDouble(this.incremento.getText().trim());
        int vueltas = Integer.parseInt(this.iciclo.getText().trim());
        
        SolucionMetodo IniciarMetodo = new SolucionMetodo();
        
        ArrayList<VariablesMetodo> instanciaA = IniciarMetodo.SolucionEuler(X, Y, h, vueltas);
        
        ModeloTabla_Euler m = new ModeloTabla_Euler(instanciaA);
        
       this.TablaEuler.setModel(m);
        
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Ha ocurido un error en la operacion");
       }
        
        
    }//GEN-LAST:event_EjecutarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEuler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonReiniciar;
    private javax.swing.JButton Ejecutar;
    private javax.swing.JTable TablaEuler;
    private javax.swing.JTextField ValorInicial;
    private javax.swing.JTextField iciclo;
    private javax.swing.JTextField incremento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField valorFinal;
    // End of variables declaration//GEN-END:variables
}
